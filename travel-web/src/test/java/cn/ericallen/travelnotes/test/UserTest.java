package cn.ericallen.travelnotes.test;

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
        user.setUserName("eric");
        System.out.println(userService.getUserByUserName(user));
    }

}
