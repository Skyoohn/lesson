package com.example.thsmanager.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.thsmanager.entity.User;
import com.example.thsmanager.mapper.UserMapper;

@Service
public class MainService {
	
	@Autowired
	private UserMapper userMapper;
	
	public List<User> selectUsers(){
		List<User> user = userMapper.selectByExample(null);
		return user;
	}
	public User selectUser(Long ID) {
		return userMapper.selectByPrimaryKey(ID);
	}
	public void insert(User user) {
		userMapper.insert(user);
	}
	public void updateByExample(User user) {
		userMapper.updateByExample(user, null);
	}
	public void deleteByPrimaryKey(Long ID) {
		userMapper.deleteByPrimaryKey(ID);
	}

}
