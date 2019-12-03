package com.st.crm.service;

import java.util.List;

import com.st.crm.pojo.SysRole;

public interface IRoleService {

	List getAll();

	int add(SysRole role);

}
