package com.example.thsmanager.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.thsmanager.entity.TorihikisakiMain;
import com.example.thsmanager.mapper.TorihikisakiMainMapper;

@Service
public class TorihikisakiMainService {
	
	@Autowired
	private TorihikisakiMainMapper torihikisakiMainMapper;
	
	public List<TorihikisakiMain> selectTorihikisakiMains(){
		List<TorihikisakiMain> torihikisakiMains = torihikisakiMainMapper.selectTorihikisakiMains();
		return torihikisakiMains;
	}
	public TorihikisakiMain selectTorihikisakiMain(Integer torihikiId) {
		return torihikisakiMainMapper.selectTorihikisakiMain(torihikiId);
	}
	public void addTorihikisakiMain(TorihikisakiMain torihikisakiMain) {
		torihikisakiMainMapper.addTorihikisakiMain(torihikisakiMain);
	}
	public void updateTorihikisakiMain(TorihikisakiMain torihikisakiMain) {
		torihikisakiMainMapper.updateTorihikisakiMain(torihikisakiMain);
	}
	public void delTorihikisakiMain(Integer torihikiId) {
		torihikisakiMainMapper.delTorihikisakiMain(torihikiId);
	}

}
