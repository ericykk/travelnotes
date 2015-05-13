package cn.ericallen.travelnotes.dao.notes;

import cn.ericallen.travelnotes.notes.model.TravelNotesPraise;

public interface ITravelNotesPraiseDao {
    int deleteByPrimaryKey(Long id);

    int insert(TravelNotesPraise record);

    int insertSelective(TravelNotesPraise record);

    TravelNotesPraise selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TravelNotesPraise record);

    int updateByPrimaryKey(TravelNotesPraise record);
}