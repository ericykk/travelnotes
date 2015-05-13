package cn.ericallen.travelnotes.serviceImpl.notes;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.ericallen.travelnotes.dao.notes.ITravelNotesDao;
import cn.ericallen.travelnotes.notes.model.TravelNotes;
import cn.ericallen.travelnotes.notes.service.ITravelNotesService;

@Service("travelNotesService")
public class TravelNotesServiceImpl implements ITravelNotesService{

	@Autowired
	private ITravelNotesDao travelNotesDao;

	/**
	 *保存游记信息
	 */
	@Override
	public void saveTravelNotes(TravelNotes saveEntity) {

		travelNotesDao.saveTravelNotes(saveEntity);

	}

	/**
	 *根据条件查询游记信息
	 */
	@Override
	public List<TravelNotes> getTravelNotesByCondition(
			TravelNotes getTravelNotesEntity) {
		return travelNotesDao.getTravelNotesByCondition(getTravelNotesEntity);
	}

	/**
	 *更新游记信息
	 */
	@Override
	public void updateTravelNotes(TravelNotes updateTravelNotesEntity) {
		 travelNotesDao.updateTravelNotes(updateTravelNotesEntity);
	}

}
