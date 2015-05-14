package cn.ericallen.travelnotes.dao.user;

import cn.ericallen.travelnotes.user.model.TravelNoteUser;

public interface TravelNoteUserMapper {
    int deleteByPrimaryKey(Long id);

    int insert(TravelNoteUser record);

    int insertSelective(TravelNoteUser record);

    TravelNoteUser selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TravelNoteUser record);

    int updateByPrimaryKey(TravelNoteUser record);
}