package cn.ericallen.travelnotes.dao.notes;


import java.util.List;

import cn.ericallen.travelnotes.notes.model.TravelNotesStatistic;

public interface ITravelNotesStatisticDao{

	//第一次浏览时初始化统计信息
	void saveTravelNotesStatistic(TravelNotesStatistic saveEntity);
    //更新统计信息
	void updateTravelNotesStatistic(TravelNotesStatistic updateEntity);
	//根据条件查询游记统计信息
	List<TravelNotesStatistic> getTravelNotesStatisticByCondition(TravelNotesStatistic searchEntity);


}
