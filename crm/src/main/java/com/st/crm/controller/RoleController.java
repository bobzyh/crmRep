package com.st.crm.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.st.crm.pojo.LayUIResponse;
import com.st.crm.pojo.SysRole;
import com.st.crm.service.IRoleService;

@Controller
@RequestMapping("/role")
public class RoleController {
	
	@Autowired
	private IRoleService roleService;
	
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index() {
		return "role/index";
	}
	
	@RequestMapping(value = "/index", method = RequestMethod.POST)
	@ResponseBody
	public LayUIResponse getAll() {
		List roles = roleService.getAll();
		
		LayUIResponse response = new LayUIResponse();
		response.setData(roles);
		
		return response;
	}
	
	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public String add() {
		return "role/add";
	}
	
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	@ResponseBody
	public Map add(SysRole role) {
		int res = roleService.add(role);
		
		Map map = new HashMap<String, Object>();
		map.put("res", res);
		
		return map;
	}
	
}
