package com.st.crm.pojo;

public class SysPremission {
	private Integer id;
	private String url;
	private Integer type;
	private String name;
	private String premission;
	private Integer parent;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public Integer getType() {
		return type;
	}
	public void setType(Integer type) {
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPremission() {
		return premission;
	}
	public void setPremission(String premission) {
		this.premission = premission;
	}
	public Integer getParent() {
		return parent;
	}
	public void setParent(Integer parent) {
		this.parent = parent;
	}
}
