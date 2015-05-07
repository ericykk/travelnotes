package cn.eric.springmvc.dao;

import java.util.List;

import cn.eric.springmvc.model.User;

public interface IUserDao {

	public List<User> selectUser(User user);
	
}
