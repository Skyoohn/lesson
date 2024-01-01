package com.example.thsmanager.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.thsmanager.entity.TorihikisakiTantou;
import com.example.thsmanager.mapper.TorihikisakiTantouMapper;

@Service
public class TorihikisakiTantouService {
	
	@Autowired
	private TorihikisakiTantouMapper torihikisakiTantouMapper;
	
	public List<TorihikisakiTantou> selectTorihikisakiTantous(){
		List<TorihikisakiTantou> torihikisakiTantou = torihikisakiTantouMapper.selectTorihikisakiTantous();
		return torihikisakiTantou;
	}
	public TorihikisakiTantou selectTorihikisakiTantou(Integer tantouId) {
		return torihikisakiTantouMapper.selectTorihikisakiTantou(tantouId);
	}
	public void addTorihikisakiTantou(TorihikisakiTantou torihikisakiTantou) {
		torihikisakiTantouMapper.addTorihikisakiTantou(torihikisakiTantou);
	}
	public void delTorihikisakiTantou(Integer tantouId) {
		torihikisakiTantouMapper.delTorihikisakiTantou(tantouId);
	}

}
