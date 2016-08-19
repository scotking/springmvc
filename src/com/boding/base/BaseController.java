package com.boding.base;

import java.io.PrintWriter;
import java.util.UUID;

import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;

public class BaseController {
	public static String RESULT = "result";
	
	public static void main(String[] args) {
		System.out.println(getUUID());
	}
	
	public static String getUUID(){
		return UUID.randomUUID().toString().replaceAll("-", "").toUpperCase();
	}
	
	public static String toJson(Object object){
		String json = JSON.toJSONString(object);
		return json;
	}
	
	public static String toJsonWithDateFormate(Object object,String dateformate){
		String json = JSON.toJSONStringWithDateFormat(object, dateformate, SerializerFeature.WriteDateUseDateFormat);
		return json;
	}
	
	public static void renderJson(String json,HttpServletResponse response){
		PrintWriter out = null;
		try{
			response.setHeader("Content-type", "text/html;charset=UTF-8");
			response.setCharacterEncoding("UTF-8");
			out = response.getWriter();
			out.write(json);
		}
		catch(Exception e){
			e.printStackTrace();
		}
		finally{
			out.close();
		}
	}

}
