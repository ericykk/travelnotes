package cn.ericallen.travelnotes.dao.notes;

import cn.ericallen.travelnotes.notes.model.TravelNotesBrowse;

public interface ITravelNotesBrowseDao {
    int deleteByPrimaryKey(Long id);

    int insert(TravelNotesBrowse record);

    int insertSelective(TravelNotesBrowse record);

    TravelNotesBrowse selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TravelNotesBrowse record);

    int updateByPrimaryKey(TravelNotesBrowse record);
}