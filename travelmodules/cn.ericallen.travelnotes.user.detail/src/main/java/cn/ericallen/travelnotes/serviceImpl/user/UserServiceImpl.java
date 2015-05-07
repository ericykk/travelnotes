package cn.ericallen.travelnotes.serviceImpl.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.ericallen.travelnotes.dao.user.IUserDao;
import cn.ericallen.travelnotes.service.user.IUserService;
import cn.ericallen.travelnotes.user.model.User;

@Service("userService")
public class UserServiceImpl implements IUserService {
	@Autowired
	private IUserDao userDao;
	@Override
	public  User getUserByUserName(User user) {

		return userDao.getUserByUserName(user);
	}

}
