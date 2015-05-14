package cn.ericallen.travelnotes.serviceImpl.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.ericallen.travelnotes.dao.user.TravelNoteUserMapper;
import cn.ericallen.travelnotes.service.user.ITravelNoteUserService;
import cn.ericallen.travelnotes.user.model.TravelNoteUser;

@Service("travelNoteUserService")
public class TravelNoteUserService implements ITravelNoteUserService {

	@Autowired
	private  TravelNoteUserMapper travelNoteUserMapper;

	@Override
	public int deleteByPrimaryKey(Long id) {
		return travelNoteUserMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int insert(TravelNoteUser record) {
		return travelNoteUserMapper.insert(record);
	}

	@Override
	public int insertSelective(TravelNoteUser record) {
		return travelNoteUserMapper.insertSelective(record);
	}

	@Override
	public TravelNoteUser selectByPrimaryKey(Long id) {
		return travelNoteUserMapper.selectByPrimaryKey(id);
	}

	@Override
	public int updateByPrimaryKeySelective(TravelNoteUser record) {
		return travelNoteUserMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(TravelNoteUser record) {
		return travelNoteUserMapper.updateByPrimaryKey(record);
	}

}
