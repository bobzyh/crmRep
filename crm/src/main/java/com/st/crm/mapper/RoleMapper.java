package com.st.crm.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.st.crm.pojo.SysRole;

@Mapper
public interface RoleMapper {

	List<SysRole> selectAll();

	int insert(SysRole role);

}
