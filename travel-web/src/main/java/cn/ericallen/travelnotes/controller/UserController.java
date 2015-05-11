package cn.ericallen.travelnotes.controller;


import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import cn.ericallen.travelnotes.common.base.BeanSupport;
import cn.ericallen.travelnotes.common.base.Result;
import cn.ericallen.travelnotes.service.user.IUserService;
import cn.ericallen.travelnotes.user.model.User;
@Controller
@RequestMapping("/user")
public class UserController extends BeanSupport{

	@Resource(name="userService")
	private IUserService userService;

	@RequestMapping(value="/userLogin",method = RequestMethod.POST)
    public ModelAndView userLogin(HttpServletRequest request, HttpServletResponse response) {
    	//@ModelAttribute 注解代表用模型来接收值，User对象里面的属性要和jsp页面的属性对应
		String userName = request.getParameter("userName");
		User user = new User();
		user.setUserName(userName);
	    user = userService.getUserByUserName(user);

		//初始化属性对应页面
		ModelAndView mv =new ModelAndView("hello");
		mv.addObject(user);
		return mv;
	}
    @RequestMapping("index")
    public ModelAndView index(){
    	ModelAndView mv = new ModelAndView("index");
        return mv;
    }

//    @RequestMapping("hello")
//    public ModelAndView hello(){
//    	ModelAndView mv = new ModelAndView("hello");
//        return mv;
//    }

    @RequestMapping("hello")
    @ResponseBody
    public Result<?> getHello(){
    	Map<Object, String> resultMap  = new HashMap<Object,String>();
    	resultMap.put("userName", "eric");
    	resultMap.put("age", "23");
    	resultMap.put("sex", "男");
    	return success(resultMap);

    }

}
