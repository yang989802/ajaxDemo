package com.springapp.controller;

import com.springapp.model.UserInfoEntity;
import com.springapp.repository.UserInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/")
public class HelloController {
	@Autowired
	UserInfoRepository userInfoRepository;

	@RequestMapping(method = RequestMethod.GET)
	public String printWelcome(ModelMap model) {
		model.addAttribute("message", "Hello world!");
		return "hello";
	}
	@RequestMapping("/ajaxpage")
	public String ajaxpage(ModelMap model){
		model.addAttribute("message", "syy");
		return "hello";
	}
	@RequestMapping("/ajax")
	public void ajax(){

	}
	@RequestMapping(value="/userlist",method = RequestMethod.GET)
	public @ResponseBody
	String getUser(){
		// ≤È—Øuser±Ì
		UserInfoEntity a= userInfoRepository.findByObjectId("A1");
		return "{ \"nickname\": \"" +a.getNickname()+"\"}";
	}
}
