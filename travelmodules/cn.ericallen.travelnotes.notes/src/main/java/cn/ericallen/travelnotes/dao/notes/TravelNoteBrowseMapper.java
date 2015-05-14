package cn.ericallen.travelnotes.dao.notes;

import cn.ericallen.travelnotes.notes.model.TravelNoteBrowse;

public interface TravelNoteBrowseMapper {
    int deleteByPrimaryKey(Long id);

    int insert(TravelNoteBrowse record);

    int insertSelective(TravelNoteBrowse record);

    TravelNoteBrowse selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TravelNoteBrowse record);

    int updateByPrimaryKey(TravelNoteBrowse record);
}