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
	public User getUserByOpenId(String openId) {
		return userDao.getUserByOpenId(openId);
	}
	@Override
	public void saveUserData(User user) {
        userDao.saveUserData(user);
	}
	@Override
	public int updateUserData(User user) {
		return userDao.updateUserData(user);
	}

}
