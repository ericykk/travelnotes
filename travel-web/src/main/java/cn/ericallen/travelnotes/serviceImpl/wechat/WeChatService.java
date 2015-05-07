package cn.ericallen.travelnotes.serviceImpl.wechat;


import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringUtils;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import cn.ericallen.travelnotes.common.base.ParseXmlToEntity;
import cn.ericallen.travelnotes.common.base.TravelNoteConstant;
import cn.ericallen.travelnotes.common.model.WeChatXmlEntity;
import cn.ericallen.travelnotes.common.wechat.AesException;
import cn.ericallen.travelnotes.common.wechat.WXBizMsgCrypt;
import cn.ericallen.travelnotes.service.user.IUserService;
import cn.ericallen.travelnotes.user.model.User;

import com.thoughtworks.xstream.XStream;

@Service
public class WeChatService {

	private static XStream xstream =null;

	private static IUserService userService;


	/**
	  * 处理微信发来的请求
	  *
	  * @param request
	  * @return
	  * @throws AesException
	  */
	 public  static String processRequest(HttpServletRequest request)  {

	  String replyMsg = null;
	  try {

		  xstream = new XStream();
		  //构造加解密函数
		  WXBizMsgCrypt wXBizMsgCrypt= new  WXBizMsgCrypt(TravelNoteConstant.TOKEN, TravelNoteConstant.EncodingAESKey, TravelNoteConstant.APPID);

		  String msgSignature = request.getParameter("msg_signature");
		  String timeStamp = request.getParameter("timestamp");
		  String nonce = request.getParameter("nonce");
		  //如果url上无encrypt_type或者其值为raw，则回复明文，否则按照上述的加密算法加密回复密文
		  String encrypType = request.getParameter("encrypt_type");

		  InputStream inputStream = request.getInputStream();

		  BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));

		  StringBuilder sb = new StringBuilder();

          String line = null;

	      while ((line = reader.readLine()) != null) {
	    	 sb.append(line+"\n");
	      }
	      String encryptMsg = sb.toString();
	      //获取解密后的明文
	      String decryptionXml = wXBizMsgCrypt.decryptMsg(msgSignature, timeStamp, nonce, encryptMsg);
	      //默认返回的文本消息内容
	      String respContent = "请求处理异常，请稍候尝试！";

	       WeChatXmlEntity weChatXmlRequest = ParseXmlToEntity.getWeChatXmlEntity(decryptionXml);
		   // 发送方帐号（open_id）
		   String fromUserName = weChatXmlRequest.getFromUserName();
		   // 公众帐号
		   String toUserName = weChatXmlRequest.getToUserName();
		   // 消息类型
		   String msgType = weChatXmlRequest.getMsgType();

		   // 回复消息
		   WeChatXmlEntity weChatXmlResponse = new WeChatXmlEntity();
		   weChatXmlResponse.setToUserName(fromUserName);
		   weChatXmlResponse.setFromUserName(toUserName);
		   weChatXmlResponse.setCreateTime(String.valueOf(new Date().getTime()));

		   // 文本消息
		   if (msgType.equals("text")) {
			   weChatXmlResponse.setMsgType("text");
			   String requestContent = weChatXmlRequest.getContent();
			   User user = new User();
			   user.setUserName(requestContent);

			   @SuppressWarnings("resource")
			   ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"classpath:conf/spring-mybatis.xml"});

			   userService = (IUserService) context.getBean("userService");
			   user =  userService.getUserByUserName(user);
			   if(user!=null)
			   respContent = user.getUserName()+"\n"+user.getCellPhone()+"\n"+user.getPlace();
		   }
		   // 图片消息
		   else if (msgType.equals("image")) {
		    respContent = "您发送的是图片消息！";
		   }
		   // 地理位置消息
		   else if (msgType.equals("location")) {
		    respContent = "您发送的是地理位置消息！";
		   }
		   // 链接消息
		   else if (msgType.equals("link")) {
		    respContent = "您发送的是链接消息！";
		   }
		   // 音频消息
		   else if (msgType.equals("voice")) {
		    respContent = "您发送的是音频消息！";
		   }
		   	// 事件推送
		   else if (msgType.equals("event")) {
		    // 事件类型
		    String eventType = weChatXmlRequest.getEvent();
		    // 订阅
		    if (eventType.equals("subscribe")) {
		     respContent = "谢谢您的关注！";
		    }
		    // 取消订阅
		    else if (eventType.equals("unsubscribe")) {
		     // TODO 取消订阅后用户再收不到公众号发送的消息，因此不需要回复消息
		    }
		    // 自定义菜单点击事件
		    else if (eventType.equals("click")) {
		     // TODO 自定义菜单权没有开放，暂不处理该类消息
		    }
		   }
		   weChatXmlResponse.setContent(respContent);


		   replyMsg = xstream.toXML(weChatXmlResponse);
		   replyMsg = replyMsg.replace("cn.ericallen.travelnotes.common.model.WeChatXmlEntity", "xml");
		   //直接回复明文
		   if(StringUtils.isBlank(encrypType)||"raw".equals(encrypType))
			   return replyMsg;
		   //加密回复信息
		   replyMsg = wXBizMsgCrypt.encryptMsg(replyMsg, timeStamp, nonce);
		  } catch (Exception e) {
		   e.printStackTrace();
		  }

	  return replyMsg;

	 }
}
