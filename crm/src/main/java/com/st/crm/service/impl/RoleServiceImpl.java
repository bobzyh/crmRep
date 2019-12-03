package com.st.crm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.st.crm.mapper.RoleMapper;
import com.st.crm.pojo.SysRole;
import com.st.crm.service.IRoleService;

@Service
public class RoleServiceImpl implements IRoleService {

	@Autowired
	private RoleMapper roleMapper;
	
	@Override
	public List getAll() {
		return roleMapper.selectAll();
	}

	@Override
	public int add(SysRole role) {
		return roleMapper.insert(role);
	}

}
