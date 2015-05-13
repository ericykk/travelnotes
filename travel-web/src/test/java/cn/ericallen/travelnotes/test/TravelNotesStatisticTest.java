package cn.ericallen.travelnotes.test;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.enterprise.inject.New;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.util.CollectionUtils;

import cn.ericallen.travelnotes.notes.model.TravelNotesStatistic;
import cn.ericallen.travelnotes.notes.service.ITravelNotesStatisticService;

public class TravelNotesStatisticTest {

	private ITravelNotesStatisticService travelNotesStatisticService;

	@Before
    public void before(){
        @SuppressWarnings("resource")
        ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{
                "classpath:conf/spring-mybatis.xml"});
        travelNotesStatisticService = (ITravelNotesStatisticService) context.getBean("travelNotesStatisticService");
    }

	@Test
	public void saveTravelNotesStatistic(){
		TravelNotesStatistic saveEntity = new TravelNotesStatistic();
		saveEntity.setPkTravelNote("94d0e355-f948-11e4-b866-7429af55b478");
		saveEntity.setBrowseNumber(1);
		saveEntity.setCreateTime(new Date());
		travelNotesStatisticService.saveTravelNotesStatistic(saveEntity);
	}

	@Test
	public void updateTravelNotesStatistic(){
		TravelNotesStatistic updateEntity = new TravelNotesStatistic();
		updateEntity.setPkTravelNote("94d0e355-f948-11e4-b866-7429af55b478");
		updateEntity.setBrowseNumber(1);
		travelNotesStatisticService.updateTravelNotesStatistic(updateEntity);
	}

	@Test
	public void getTravelNotesStatisticByCondition(){
		List<TravelNotesStatistic> list = new ArrayList<TravelNotesStatistic>();
		TravelNotesStatistic searchEntity = new TravelNotesStatistic();
		searchEntity.setPkTravelNote("94d0e355-f948-11e4-b866-7429af55b478");
		list = travelNotesStatisticService.getTravelNotesStatistic(searchEntity);
		if(CollectionUtils.isEmpty(list)){
			System.out.println("没有查询到相应的记录！");
		}else{
			searchEntity = list.get(0);
			System.out.println(searchEntity.getBrowseNumber());
		}


	}
}
