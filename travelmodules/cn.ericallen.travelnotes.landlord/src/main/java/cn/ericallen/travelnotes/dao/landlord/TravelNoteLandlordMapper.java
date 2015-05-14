package cn.ericallen.travelnotes.dao.landlord;

import cn.ericallen.travelnotes.landlord.model.TravelNoteLandlord;

public interface TravelNoteLandlordMapper {
    int deleteByPrimaryKey(Long id);

    int insert(TravelNoteLandlord record);

    int insertSelective(TravelNoteLandlord record);

    TravelNoteLandlord selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TravelNoteLandlord record);

    int updateByPrimaryKey(TravelNoteLandlord record);
}