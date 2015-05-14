package cn.ericallen.travelnotes.dao.notes;

import cn.ericallen.travelnotes.notes.model.TravelNoteData;

public interface TravelNoteDataMapper {
    int deleteByPrimaryKey(Long id);

    int insert(TravelNoteData record);

    int insertSelective(TravelNoteData record);

    TravelNoteData selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TravelNoteData record);

    int updateByPrimaryKey(TravelNoteData record);
}