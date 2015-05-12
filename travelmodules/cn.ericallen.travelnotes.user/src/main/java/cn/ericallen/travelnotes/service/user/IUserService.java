package cn.ericallen.travelnotes.service.user;

import cn.ericallen.travelnotes.user.model.User;

public interface IUserService {
	 //根据授权的令牌获取登陆用户信息
	 public User getUserByOpenId(String openId);
	 //保存登录用户信息
	 public void saveUserData(User user);
	 //更新登录用户信息
	 public int updateUserData(User user);
}
