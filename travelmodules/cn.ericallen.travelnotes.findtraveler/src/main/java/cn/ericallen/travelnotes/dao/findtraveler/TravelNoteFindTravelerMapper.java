package cn.ericallen.travelnotes.dao.findtraveler;

import cn.ericallen.travelnotes.findtraveler.model.TravelNoteFindTraveler;

public interface TravelNoteFindTravelerMapper {
    int deleteByPrimaryKey(Long id);

    int insert(TravelNoteFindTraveler record);

    int insertSelective(TravelNoteFindTraveler record);

    TravelNoteFindTraveler selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TravelNoteFindTraveler record);

    int updateByPrimaryKey(TravelNoteFindTraveler record);
}