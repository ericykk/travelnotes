package cn.ericallen.travelnotes.dao.landlord;

import cn.ericallen.travelnotes.landlord.model.TravelNoteLandlordApply;

public interface TravelNoteLandlordApplyMapper {
    int deleteByPrimaryKey(Long id);

    int insert(TravelNoteLandlordApply record);

    int insertSelective(TravelNoteLandlordApply record);

    TravelNoteLandlordApply selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TravelNoteLandlordApply record);

    int updateByPrimaryKey(TravelNoteLandlordApply record);
}