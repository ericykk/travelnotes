package cn.ericallen.travelnotes.serviceImpl.notes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.ericallen.travelnotes.dao.notes.ITravelNotesStatisticDao;
import cn.ericallen.travelnotes.notes.model.TravelNotesStatistic;
import cn.ericallen.travelnotes.notes.service.ITravelNotesStatisticService;

@Service("travelNotesStatisticService")
public class TravelNotesStatisticServiceImpl implements
		ITravelNotesStatisticService {

	@Autowired
	private ITravelNotesStatisticDao travelNotesStatisticDao;

	//保存游记统计信息
	@Override
	public void saveTravelNotesStatistic(TravelNotesStatistic saveEntity) {
		travelNotesStatisticDao.saveTravelNotesStatistic(saveEntity);
	}
	//更新游记统计信息
	@Override
	public void updateTravelNotesStatistic(
			TravelNotesStatistic updateEntity) {
		 travelNotesStatisticDao.updateTravelNotesStatistic(updateEntity);
	}
	//获取游记统计信息
	@Override
	public List<TravelNotesStatistic> getTravelNotesStatistic(TravelNotesStatistic searchEntity) {
		return travelNotesStatisticDao.getTravelNotesStatisticByCondition(searchEntity);
	}

}
