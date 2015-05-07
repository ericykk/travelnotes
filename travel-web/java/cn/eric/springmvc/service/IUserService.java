package cn.eric.springmvc.service;

import java.util.List;

import cn.eric.springmvc.model.User;

public interface IUserService {
	
	public List<User> selectUser(User user);
	
}
