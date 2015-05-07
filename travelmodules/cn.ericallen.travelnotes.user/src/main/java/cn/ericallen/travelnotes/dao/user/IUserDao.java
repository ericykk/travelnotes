package cn.ericallen.travelnotes.dao.user;

import cn.ericallen.travelnotes.user.model.User;

public interface IUserDao {
	 User getUserByUserName(User user);
}
