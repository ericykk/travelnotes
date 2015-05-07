package cn.eric.springmvc.controller;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import cn.eric.springmvc.model.User;

@Controller
@RequestMapping("/")
public class UserController {
    @RequestMapping("userLogin")
    public ModelAndView userLogin(@ModelAttribute User user) {
    	//@ModelAttribute ע�������ģ��������ֵ��User�������������Ҫ��jspҳ������Զ�Ӧ
		System.out.println(user.getUserName());
		System.out.println(user.getPassWord());
		//��ʼ�����Զ�Ӧҳ��
		ModelAndView mv =new ModelAndView("hello");
		mv.addObject(user);
		return mv;
	}
    @RequestMapping("index")
    public String index(){

    	return "index";
    }

}
