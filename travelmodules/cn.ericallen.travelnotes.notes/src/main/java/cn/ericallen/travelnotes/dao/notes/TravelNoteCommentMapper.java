package cn.ericallen.travelnotes.dao.notes;

import cn.ericallen.travelnotes.notes.model.TravelNoteComment;

public interface TravelNoteCommentMapper {
    int deleteByPrimaryKey(Long id);

    int insert(TravelNoteComment record);

    int insertSelective(TravelNoteComment record);

    TravelNoteComment selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TravelNoteComment record);

    int updateByPrimaryKey(TravelNoteComment record);
}