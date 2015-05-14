package cn.ericallen.travelnotes.dao.notes;

import cn.ericallen.travelnotes.notes.model.TravelNoteShare;

public interface TravelNoteShareMapper {
    int deleteByPrimaryKey(Long id);

    int insert(TravelNoteShare record);

    int insertSelective(TravelNoteShare record);

    TravelNoteShare selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TravelNoteShare record);

    int updateByPrimaryKey(TravelNoteShare record);
}