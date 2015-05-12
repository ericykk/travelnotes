package cn.ericallen.travelnotes.dao.user;

import cn.ericallen.travelnotes.user.model.User;

public interface IUserDao {
	 //根据授权的令牌获取登陆用户信息
	 User getUserByOpenId(String openId);
	 //保存登录用户信息
	 void saveUserData(User user);
	 //更新登录用户信息
	 int updateUserData(User user);
}
