package com.boding.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boding.main.mapper.NewsMapper;
import com.boding.main.mapper.domain.News;
import com.boding.main.mapper.domain.NewsExample;

@Service
public class MainService {
	
	@Autowired
	private NewsMapper newsMapper;
	
	public List<News> getList(){
		NewsExample example = new NewsExample();
		List<News> list = newsMapper.selectByExample(example);
		return list;
	}

}
