package com.boding.sysfunc.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.boding.base.BaseController;
import com.boding.sysfunc.mapper.domain.SysFunction;
import com.boding.sysfunc.service.SysFunctionService;

@Controller
@RequestMapping("/control/sysfunc")
public class SysFunctionController extends BaseController {
	
	@Autowired
	private SysFunctionService functionService;
	
	@RequestMapping(value="manage",method=RequestMethod.GET)
	public ModelAndView manage(HttpServletRequest request){
		List<SysFunction> list = functionService.getList();
		return new ModelAndView("sysfunc/index").addObject("funclist", list);
	}

}
