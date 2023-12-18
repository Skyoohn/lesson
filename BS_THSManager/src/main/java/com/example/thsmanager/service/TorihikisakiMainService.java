package com.example.thsmanager.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.thsmanager.entity.TorihikisakiMain;
import com.example.thsmanager.mapper.TorihikisakiMainMapper;

public class TorihikisakiMainService {
	
	@Autowired
	private TorihikisakiMainMapper torihikisakiMainMapper;
	
	public List<TorihikisakiMain> selectTorihikisakiMains(){
		List<TorihikisakiMain> torihikisakiMains = torihikisakiMainMapper.selectTorihikisakiMains();
		return torihikisakiMains;
	}
	public TorihikisakiMain selectTorihikisakiMain(Integer ID) {
		return torihikisakiMainMapper.selectTorihikisakiMain(ID);
	}
	public void addTorihikisakiMain(TorihikisakiMain torihikisakiMain) {
		torihikisakiMainMapper.addTorihikisakiMain(torihikisakiMain);
	}
	public void updTorihikisakiMain(TorihikisakiMain torihikisakiMain) {
		torihikisakiMainMapper.updateTorihikisakiMain(torihikisakiMain);
	}
	public void delTorihikisakiMain(Integer ID) {
		torihikisakiMainMapper.delTorihikisakiMain(ID);
	}

}
