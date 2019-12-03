package com.st.crm.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.st.crm.pojo.LayUIResponse;
import com.st.crm.pojo.User;
import com.st.crm.service.IUserService;

@Controller
public class UserController {

	@Autowired
	private IUserService userService;
	
	@RequestMapping("/index")
	public String index() {
		return "index";
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login() {
		return "login";
	}
	
	@RequestMapping(value="/login", method = RequestMethod.POST)
	public ModelAndView login(User user1, HttpSession session) {
		// 调用Service层
		User loginUser = userService.login(user1);
		
		ModelAndView mv = new ModelAndView();
		
		if (loginUser != null) {
			// 保存到Session中
			session.setAttribute("user", loginUser);
			
			
			// 跳转到主页面
			mv.setViewName("redirect:index");
		} else {
			// 提示错误信息
			mv.addObject("error", "账号或密码错误");
			
			mv.setViewName("login");
		}
		
		return mv;
	}
	
	/**
	 * 用户管理页面
	 * 
	 */
	@RequestMapping(value = "user/index", method = RequestMethod.GET)
	public String userIndex() {
		return "user/index";
	}
	
	@RequestMapping(value = "user/index", method = RequestMethod.POST)
	@ResponseBody
	public LayUIResponse userList() {
		// 获取所有的用户
		List users = userService.getAll();
		
		LayUIResponse response = new LayUIResponse();
		response.setData(users);
		
		return response;
	}
	
	@RequestMapping(value = "/user/add", method = RequestMethod.GET)
	public String addUser() {
		return "user/add";
	}
	
	@RequestMapping(value = "/user/add", method = RequestMethod.POST)
	@ResponseBody
	public Map addUser(User user) {
		
		int res = userService.add(user);
		
		Map map = new HashMap<String, Object>();
		map.put("res", res);
		// {"res": 1}
		
		return map;
	}
	
	@RequestMapping(value = "/user/role/edit", method = RequestMethod.GET)
	public ModelAndView roleEdit(Integer id) {
		
		// 获取用户信息
		User user = userService.getById(id);
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("user", user);
		mv.setViewName("user/role");
		
		return mv;
	}
	
	@RequestMapping(value = "/user/role/get", method = RequestMethod.POST)
	@ResponseBody
	public List getRole(Integer id) {
		List roles = userService.getRole(id);
		
		return roles;
	}
}
