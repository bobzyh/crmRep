package com.st.crm.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.st.crm.pojo.LayUIResponse;
import com.st.crm.pojo.SysPremission;
import com.st.crm.service.IPremissionService;

@Controller
@RequestMapping("/premission")
public class PremissionController {

	@Autowired
	private IPremissionService premissionService;
	
	@RequestMapping(value="/index")
	public String index() {
		return "premission/index";
	}
	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public String add() {
		return "premission/add";
	}
	
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	@ResponseBody
	public Map add(SysPremission premission) {
		
		int res = premissionService.add(premission);
		
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("res", res);
		
		return map;
	}
	
	
	
	@RequestMapping("/getAll")
	@ResponseBody
	public LayUIResponse getAll() {
		
		List list = premissionService.getAll();
		
		LayUIResponse response = new LayUIResponse();
		response.setData(list);
		
		return response;
		
	}
}
