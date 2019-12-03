package com.st.crm.pojo;

import java.util.List;

public class SysRole {
	private Integer id;
	private String role;
	private String dscb;
	
	// 权限
	private List<SysPremission> premissions;
	
	public List<SysPremission> getPremissions() {
		return premissions;
	}
	public void setPremissions(List<SysPremission> premissions) {
		this.premissions = premissions;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getDscb() {
		return dscb;
	}
	public void setDscb(String dscb) {
		this.dscb = dscb;
	}	
}
