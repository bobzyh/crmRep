package com.st.crm.service;

import java.util.List;

import com.st.crm.pojo.User;

public interface IUserService {
	User login(User user);

	List getAll();

	int add(User user);

	User getById(Integer id);

	List getRole(Integer user_id);
}
