package com.st.crm.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.st.crm.pojo.SysPremission;

@Mapper
public interface PremissionMapper {
	List<SysPremission> selectAll();

	int insert(SysPremission premission);
}
