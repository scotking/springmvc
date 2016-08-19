package com.boding.sysfunc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boding.sysfunc.mapper.SysFunctionMapper;
import com.boding.sysfunc.mapper.domain.SysFunction;
import com.boding.sysfunc.mapper.domain.SysFunctionExample;

@Service
public class SysFunctionService {
	@Autowired
	private SysFunctionMapper functionMapper;
	
	public List<SysFunction> getList(){
		SysFunctionExample example = new SysFunctionExample();
		List<SysFunction> list = functionMapper.selectByExample(example);
		return list;
	}

}
