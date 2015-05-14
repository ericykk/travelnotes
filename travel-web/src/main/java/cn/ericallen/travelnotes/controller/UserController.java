package cn.ericallen.travelnotes.controller;

import java.util.Date;

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
import cn.ericallen.travelnotes.service.user.ITravelNoteUserService;
import cn.ericallen.travelnotes.user.model.TravelNoteUser;
@Controller
@RequestMapping("/user")
public class UserController extends BeanSupport{

	@Resource(name="travelNoteUserService")
	private ITravelNoteUserService travelNoteUserService;

	@RequestMapping(value="/userLogin",method = RequestMethod.POST)
    public ModelAndView userLogin(HttpServletRequest request, HttpServletResponse response) {
    	 //@ModelAttribute 注解代表用模型来接收值，User对象里面的属性要和jsp页面的属性对应
		 TravelNoteUser user = new TravelNoteUser();
	     user.setOpenid("aaaaaaaa");
	     user.setCity("苏州市");
	     user.setProvince("江苏省");
	     user.setCountry("中国");
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

    @RequestMapping("hello")
    @ResponseBody
    public Result<?> getHello(){
    	 TravelNoteUser user = new TravelNoteUser();
         user.setOpenid("aaaaaaaa");
         user.setCity("苏州市");
         user.setProvince("江苏省");
         user.setCountry("中国");
         user.setCreateTime(new Date());
         user.setLoginAccountType("0");
         user.setLoginTime(new Date());
         travelNoteUserService.insertSelective(user);
    	 return success(user);

    }

}
