package cn.ericallen.travelnotes.notes.service;

import java.util.List;

import cn.ericallen.travelnotes.notes.model.TravelNotesStatistic;

public interface ITravelNotesStatisticService {
	//第一次浏览时初始化统计信息
	public void saveTravelNotesStatistic(TravelNotesStatistic saveEntity);
    //更新统计信息
	public void updateTravelNotesStatistic(TravelNotesStatistic updateEntity);
	//根据条件获取游记统计信息
	public List<TravelNotesStatistic> getTravelNotesStatistic(TravelNotesStatistic searchEntity);
}
