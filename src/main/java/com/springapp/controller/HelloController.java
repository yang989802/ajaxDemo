package com.springapp.controller;

import com.springapp.model.UserInfoEntity;
import com.springapp.repository.UserInfoRepository;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import net.sf.json.util.JSONStringer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;


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
		System.out.println("enter ajaxpage");
		return "hello";
	}
	@RequestMapping("/ajax")
	public void ajax(){

	}
	@RequestMapping(value="/userlist",method = RequestMethod.GET)
	public @ResponseBody
	String getUser(){
		// 查询user表
		System.out.println("enter userlist");
		UserInfoEntity a= userInfoRepository.findByObjectId("A1");
		return "{ \"nickname\": \"" +a.getNickname()+"\"}";
	}
	@RequestMapping(method = RequestMethod.GET, value = "/travelList", produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody
	String getL(){
		Calendar now = Calendar.getInstance();
		System.out.println(now.getTime()+"  enter travelList");
		List<String> userId =new ArrayList<>();
		userId.add("a");
		userId.add("b");
		JSONObject data =new JSONObject();
		JSONObject aDD = new JSONObject();


		aDD.put("joinMax","10");
		aDD.put("clicks",2393);
		aDD.put("content", "");
		aDD.put("travelPic","http://ac-afkydcqq.clouddn.com/f7a0443a710ceded28ef.jpg");
		JSONObject endTimeQ = new JSONObject();
		endTimeQ.put("__type","Date");
		endTimeQ.put("iso", "2017-03-28T05:41:00.000Z");
		aDD.put("endTimes", endTimeQ);
		aDD.put("joinNum", 0);
		aDD.put("joinUser", userId);
		aDD.put("title", "庐山游");
		aDD.put("releaseUsername", "哈哈哈");
		aDD.put("releaseUserId", "a");
		JSONObject cantJoinTimeQ = new JSONObject();
		cantJoinTimeQ.put("__type", "Date");
		cantJoinTimeQ.put("iso", "2017-03-28T05:41:00.000Z");
		aDD.put("cantJoinTime", cantJoinTimeQ);

		JSONArray add = new JSONArray();
		add.add(aDD);


		data.put("data",add);
		data.put("success",true);

		return data.toString();
	}
	@RequestMapping(method = RequestMethod.POST, value = "/travelListPost", produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody
	String postL(){
		Calendar now = Calendar.getInstance();
		System.out.println(now.getTime()+"  enter travelListPost");
		List<String> userId =new ArrayList<>();
		userId.add("a");
		userId.add("b");
		JSONObject data =new JSONObject();
		JSONObject aDD = new JSONObject();


		aDD.put("joinMax","10");
		aDD.put("clicks",2393);
		aDD.put("content", "");
		aDD.put("travelPic","http://ac-afkydcqq.clouddn.com/f7a0443a710ceded28ef.jpg");
		JSONObject endTimeQ = new JSONObject();
		endTimeQ.put("__type","Date");
		endTimeQ.put("iso", "2017-03-28T05:41:00.000Z");
		aDD.put("endTimes", endTimeQ);
		aDD.put("joinNum", 0);
		aDD.put("joinUser", userId);
		aDD.put("title", "庐山游");
		aDD.put("releaseUsername", "哈哈哈");
		aDD.put("releaseUserId", "a");
		JSONObject cantJoinTimeQ = new JSONObject();
		cantJoinTimeQ.put("__type", "Date");
		cantJoinTimeQ.put("iso", "2017-03-28T05:41:00.000Z");
		aDD.put("cantJoinTime", cantJoinTimeQ);

		JSONArray add = new JSONArray();
		add.add(aDD);


		data.put("data",add);
		data.put("success",true);

		return data.toString();
	}
}
