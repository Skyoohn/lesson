package com.example.thsmanager.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.thsmanager.entity.TorihikisakiTantou;
import com.example.thsmanager.mapper.TorihikisakiTantouMapper;

@Service
@Transactional
public class TantouService {
	
	@Autowired
	private TorihikisakiTantouMapper torihikiTantoumapper;
	
	public List<TorihikisakiTantou> selectTorihikisakiTantous(){
		List<TorihikisakiTantou> torihikisakiTantous = torihikiTantoumapper.selectTorihikisakiTantous();
		return torihikisakiTantous;
	}
	public TorihikisakiTantou selectTorihikisakiTantou(Integer tantouId) {
		return torihikiTantoumapper.selectTorihikisakiTantou(tantouId);
	}
	public void addTorihikisakiTantou(TorihikisakiTantou torihikisakiTantou) {
		torihikiTantoumapper.addTorihikisakiTantou(torihikisakiTantou);
	}
	public void updateTorihikisakiTantou(TorihikisakiTantou torihikisakiTantou) {
		torihikiTantoumapper.updateTorihikisakiTantou(torihikisakiTantou);
	}
	public void delTorihikisakiTantou(Integer tantouId) {
		torihikiTantoumapper.delTorihikisakiTantou(tantouId);
	}

}
