package cn.ericallen.travelnotes.dao.notes;

import cn.ericallen.travelnotes.notes.model.TravelNotesShare;

public interface ITravelNotesShareDao {
    int deleteByPrimaryKey(Long id);

    int insert(TravelNotesShare record);

    int insertSelective(TravelNotesShare record);

    TravelNotesShare selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TravelNotesShare record);

    int updateByPrimaryKey(TravelNotesShare record);
}