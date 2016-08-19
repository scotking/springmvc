package com.boding.main.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.boding.base.BaseController;
import com.boding.main.mapper.domain.News;
import com.boding.main.service.MainService;

@Controller
@RequestMapping("/control/main")
public class MainController extends BaseController {
	
	@Autowired
	private MainService mainService;

	@SuppressWarnings("unused")
	@RequestMapping(value="index",method=RequestMethod.GET)
	public ModelAndView index(HttpServletRequest request){
		List<News> list = mainService.getList();
		String json = toJsonWithDateFormate(list, "yyyy-MM-dd HH:mm:ss");
		return new ModelAndView("main/index");
	}
	
	@RequestMapping(value="jsontest",method=RequestMethod.GET)
	public ModelAndView jsontest(HttpServletRequest request){
		List<News> list = mainService.getList();
		String json = toJsonWithDateFormate(list, "yyyy-MM-dd HH:mm:ss");
		return new ModelAndView(RESULT).addObject(RESULT, json);
	}
	
	@RequestMapping(value="getjson",method=RequestMethod.GET)
	public void jsontest(HttpServletRequest request,HttpServletResponse response){
		List<News> list = mainService.getList();
		String json = toJsonWithDateFormate(list, "yyyy-MM-dd HH:mm:ss");
		
		renderJson(json, response);
	}
}
