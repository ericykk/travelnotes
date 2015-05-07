package cn.ericallen.travelnotes.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.ericallen.travelnotes.common.base.TravelNoteConstant;
import cn.ericallen.travelnotes.common.base.WeChatSha1;
import cn.ericallen.travelnotes.serviceImpl.wechat.WeChatService;
@SuppressWarnings("serial")
public class WeChatServlet extends HttpServlet {


	/**
	 *确认请求信息是否来自微信服务器
	 */
	@Override
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
		//微信加密签名
		String signature = request.getParameter("signature");
		//时间戳
		String timestamp = request.getParameter("timestamp");
		//随机数
		String nonce = request.getParameter("nonce");
		//随机字符串
		String echostr = request.getParameter("echostr");

		String token = TravelNoteConstant.TOKEN;

		String str[] = {token,timestamp,nonce};
		//按照字典序排序
		Arrays.sort(str);

		String finalStr = str[0]+str[1]+str[2];
		PrintWriter out = response.getWriter();

		//如果签名一样 则表示请求来自微信服务器  直接返回echostr
		if(signature.equals(WeChatSha1.encode(finalStr))){
			out.print(echostr);
		}

		out.close();
		out =null;

	}

	//处理微信服务器的请求
	@Override
	public  void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException{
		//设置编码格式  防止中文乱码
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		//调用服务类 处理信息
		String resultMessage = WeChatService.processRequest(request);
		//响应消息
	    PrintWriter out = response.getWriter();
        out.print(resultMessage);
        out.close();
        out = null;

	}

}
