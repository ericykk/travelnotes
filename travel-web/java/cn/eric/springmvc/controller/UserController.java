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
    	//@ModelAttribute 注解代表用模型来接收值，User对象里面的属性要和jsp页面的属性对应
		System.out.println(user.getUserName());
		System.out.println(user.getPassWord());
		//初始化属性对应页面
		ModelAndView mv =new ModelAndView("hello");
		mv.addObject(user);
		return mv;
	}
    @RequestMapping("index")
    public String index(){

    	return "index";
    }

}
