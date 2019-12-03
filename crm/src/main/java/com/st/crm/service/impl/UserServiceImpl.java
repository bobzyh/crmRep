package com.st.crm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.st.crm.mapper.UserMapper;
import com.st.crm.pojo.User;
import com.st.crm.service.IUserService;

@Service
public class UserServiceImpl implements IUserService{

	@Autowired
	private UserMapper userMapper;
	
	@Override
	public User login(User user) {
		return userMapper.select(user);
	}

	@Override
	public List getAll() {
		return userMapper.selectAll();
	}

	@Override
	public int add(User user) {
		return userMapper.insert(user);
	}

	@Override
	public User getById(Integer id) {
		return userMapper.selectById(id);
	}

	@Override
	public List getRole(Integer user_id) {
		return userMapper.selectRole(user_id);
	}

}
