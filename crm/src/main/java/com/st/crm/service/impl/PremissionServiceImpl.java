package com.st.crm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.st.crm.mapper.PremissionMapper;
import com.st.crm.pojo.SysPremission;
import com.st.crm.service.IPremissionService;

@Service
public class PremissionServiceImpl implements IPremissionService{

	@Autowired
	private PremissionMapper premissionMapper;
	
	@Override
	public List getAll() {
		return premissionMapper.selectAll();
	}

	@Override
	public int add(SysPremission premission) {
		return premissionMapper.insert(premission);
	}

}
