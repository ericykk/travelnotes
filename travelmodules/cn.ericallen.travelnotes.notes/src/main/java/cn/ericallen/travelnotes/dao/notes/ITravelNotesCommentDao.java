package cn.ericallen.travelnotes.dao.notes;

import cn.ericallen.travelnotes.notes.model.TravelNotesComment;

public interface ITravelNotesCommentDao {
    int deleteByPrimaryKey(Long id);

    int insert(TravelNotesComment record);

    int insertSelective(TravelNotesComment record);

    TravelNotesComment selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TravelNotesComment record);

    int updateByPrimaryKey(TravelNotesComment record);
}