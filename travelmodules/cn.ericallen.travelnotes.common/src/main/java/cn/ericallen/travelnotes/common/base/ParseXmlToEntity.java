package cn.ericallen.travelnotes.common.base;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Iterator;

import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import cn.ericallen.travelnotes.common.model.WeChatXmlEntity;


/**
 *
 * @author eric_ykk
 * 将获取到的微信xml转换为实体类
 */
public class ParseXmlToEntity {

	public static WeChatXmlEntity getWeChatXmlEntity(String postXml){

		WeChatXmlEntity weChatXmlEntity = null;

		try {

			  //将字符串转化为XML文档对象
			  Document document = DocumentHelper.parseText(postXml);
			  // 获得文档的根节点
		      Element root = document.getRootElement();
		      // 遍历根节点下所有子节点
		      Iterator<?> iter = root.elementIterator();

		      // 遍历所有结点
		      weChatXmlEntity = new WeChatXmlEntity();
		      //利用反射机制，调用set方法
		      //获取该实体的元类型
		      Class<?> c = Class.forName("cn.ericallen.travelnotes.common.model.WeChatXmlEntity");
		      weChatXmlEntity = (WeChatXmlEntity)c.newInstance();//创建这个实体的对象

		      while(iter.hasNext()){
		        Element ele = (Element)iter.next();
		        //获取set方法中的参数字段（实体类的属性）
		        Field field = c.getDeclaredField(ele.getName());
		        //获取set方法，field.getType())获取它的参数数据类型
		        Method method = c.getDeclaredMethod("set"+ele.getName(), field.getType());
		        //调用set方法
		        method.invoke(weChatXmlEntity, ele.getText());
		        }

		} catch (Exception e) {
			e.printStackTrace();
		}
		return weChatXmlEntity;
		}
}