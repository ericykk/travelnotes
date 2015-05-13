package cn.ericallen.travelnotes.dao.notes;

import java.util.List;

import cn.ericallen.travelnotes.notes.model.TravelNotes;

public interface ITravelNotesDao {

	//保存游记信息
	public void saveTravelNotes(TravelNotes saveEntity);
	//查询游记信息
	List<TravelNotes> getTravelNotesByCondition(TravelNotes getTravelNotesEntity);
	//更新游记信息
	void updateTravelNotes(TravelNotes updateTravelNotesEntity);
}