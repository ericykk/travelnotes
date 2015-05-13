package cn.ericallen.travelnotes.notes.service;

import java.util.List;

import cn.ericallen.travelnotes.notes.model.TravelNotes;

public interface ITravelNotesService {
	//保存游记信息
	public void saveTravelNotes(TravelNotes saveEntity);
	//查询游记信息
	public List<TravelNotes> getTravelNotesByCondition(TravelNotes getTravelNotesEntity);
	//更新游记信息
	public void updateTravelNotes(TravelNotes updateTravelNotesEntity);
}
