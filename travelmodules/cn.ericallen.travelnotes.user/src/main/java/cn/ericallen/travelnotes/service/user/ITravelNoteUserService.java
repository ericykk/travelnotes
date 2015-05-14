package cn.ericallen.travelnotes.service.user;

import cn.ericallen.travelnotes.user.model.TravelNoteUser;

public interface ITravelNoteUserService {
	 	int deleteByPrimaryKey(Long id);

	    int insert(TravelNoteUser record);

	    int insertSelective(TravelNoteUser record);

	    TravelNoteUser selectByPrimaryKey(Long id);

	    int updateByPrimaryKeySelective(TravelNoteUser record);

	    int updateByPrimaryKey(TravelNoteUser record);
}
