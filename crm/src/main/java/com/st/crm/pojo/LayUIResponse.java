package com.st.crm.pojo;

import java.util.HashMap;
import java.util.Map;

public class LayUIResponse {

	private Integer code = 0;
	private String msg = "";
	private Long count = 0L;
	private Object data;
	
	
	public Long getCount() {
		return count;
	}
	public void setCount(Long count) {
		this.count = count;
	}
	public Integer getCode() {
		return code;
	}
	public void setCode(Integer code) {
		this.code = code;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	public void setData(String key, String value) {
		if (this.data == null) {
			this.data = new HashMap<String, String>();
		}
		((Map)this.data).put(key, value);		
	}
	
	
}
