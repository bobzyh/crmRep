package com.st.crm.service;

import java.util.List;

import com.st.crm.pojo.SysPremission;

public interface IPremissionService {

	List getAll();

	int add(SysPremission premission);
}
