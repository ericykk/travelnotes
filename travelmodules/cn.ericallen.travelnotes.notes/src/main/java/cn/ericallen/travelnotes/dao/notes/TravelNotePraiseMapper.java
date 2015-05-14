package cn.ericallen.travelnotes.dao.notes;

import cn.ericallen.travelnotes.notes.model.TravelNotePraise;

public interface TravelNotePraiseMapper {
    int deleteByPrimaryKey(Long id);

    int insert(TravelNotePraise record);

    int insertSelective(TravelNotePraise record);

    TravelNotePraise selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TravelNotePraise record);

    int updateByPrimaryKey(TravelNotePraise record);
}