package cn.ericallen.travelnotes.test;

import java.util.Date;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.ericallen.travelnotes.service.user.IUserService;
import cn.ericallen.travelnotes.user.model.User;

public class UserTest {

	private IUserService userService;
	@Before
    public void before(){
        @SuppressWarnings("resource")
        ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{
                "classpath:conf/spring-mybatis.xml"});
        userService = (IUserService) context.getBean("userService");
    }


    @Test
    public void addUser(){
        User user = new User();
        user.setOpenId("bbbbbbbb");
        user.setNickName("eric");
        user.setSex("男");
        user.setCity("苏州市");
        user.setProvince("江苏省");
        user.setCountry("中国");
        user.setCreateTime(new Date());
        user.setLoginAccountType("0");
        user.setLoginTime(new Date());
        userService.saveUserData(user);
    }


    @Test
    public void getUserByOpenId(){
       User user = userService.getUserByOpenId("bbbbbbbb");
       if(user!=null)
    	   System.out.println(user.getNickName());
    }

	@Test
	public void updateUserData(){
		User user = new User();
		user.setNickName("anila");
		user.setOpenId("bbbbbbbb");
		user.setSex("女");
		userService.updateUserData(user);
	}

}
