package cn.eric.springmvc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.eric.springmvc.dao.IUserDao;
import cn.eric.springmvc.model.User;
import cn.eric.springmvc.service.IUserService;
@Service
public class UserServiceImpl implements IUserService {
	@Autowired
	private IUserDao userDao;
	@Override
	public List<User> selectUser(User user) {
		return userDao.selectUser(user);
	}

}
