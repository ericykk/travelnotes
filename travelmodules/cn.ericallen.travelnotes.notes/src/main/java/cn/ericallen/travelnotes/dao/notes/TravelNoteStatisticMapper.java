package cn.ericallen.travelnotes.dao.notes;

import cn.ericallen.travelnotes.notes.model.TravelNoteStatistic;

public interface TravelNoteStatisticMapper {
    int deleteByPrimaryKey(Long id);

    int insert(TravelNoteStatistic record);

    int insertSelective(TravelNoteStatistic record);

    TravelNoteStatistic selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TravelNoteStatistic record);

    int updateByPrimaryKey(TravelNoteStatistic record);
}