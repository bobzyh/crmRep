package com.st.crm.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.st.crm.pojo.User;

@Mapper
public interface UserMapper {
	User select(User user);

	List<User> selectAll();

	int insert(User user);

	User selectById(Integer id);

	List<Map> selectRole(Integer user_id);
}
