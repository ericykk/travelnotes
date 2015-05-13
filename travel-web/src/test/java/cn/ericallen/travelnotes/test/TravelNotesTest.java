package cn.ericallen.travelnotes.test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.util.CollectionUtils;

import cn.ericallen.travelnotes.notes.model.TravelNotes;
import cn.ericallen.travelnotes.notes.service.ITravelNotesService;

public class TravelNotesTest {

	private ITravelNotesService travelNotesService;

	@Before
    public void before(){
        @SuppressWarnings("resource")
        ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{
                "classpath:conf/spring-mybatis.xml"});
        travelNotesService = (ITravelNotesService) context.getBean("travelNotesService");
    }

	@Test
	public void saveTravelNotes(){
		TravelNotes notes = new TravelNotes();
		notes.setPkTravelNote("uuid");
		notes.setOpenId("XXXXXXXX");
		notes.setCreateTime(new Date());
		notes.setReleaseTime(new Date());
		notes.setTravelContent("my travel trip,it's so nice!");
		notes.setTravelerNumber(5);
		notes.setTravelCost(500);
		notes.setTravelPlace("苏州");
		notes.setTravelLabel("人文,自然");
		notes.setTravelReminder("注意安全，小心蚊虫！");
		notes.setTravelFeature("经济，舒适，悠闲，消费低！");
		notes.setTravelTime(new Date());
		travelNotesService.saveTravelNotes(notes);
	}


	@Test
	public void  getTravelNotesByCondition(){
		List<TravelNotes> notesList =  new ArrayList<TravelNotes>();
		TravelNotes notes = new  TravelNotes();
		notes.setOpenId("XXXXXXXX");

		notesList = travelNotesService.getTravelNotesByCondition(notes);
		if(!CollectionUtils.isEmpty(notesList)){
			notes = notesList.get(0);
			System.out.println(notes.getTravelContent());
		}else{
			System.out.println("没有查询到对应的游记！");
		}
	}

	@Test
	public void updateTravelNotes(){
		TravelNotes notes = new  TravelNotes();
		notes.setPkTravelNote("94d0e355-f948-11e4-b866-7429af55b478");
		notes.setTravelPlace("阿尔卑斯山");
		travelNotesService.updateTravelNotes(notes);

	}
}
