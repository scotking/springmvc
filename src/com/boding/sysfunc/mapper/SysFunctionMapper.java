package com.boding.sysfunc.mapper;

import com.boding.sysfunc.mapper.domain.SysFunction;
import com.boding.sysfunc.mapper.domain.SysFunctionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysFunctionMapper {
    int countByExample(SysFunctionExample example);

    int deleteByExample(SysFunctionExample example);

    int deleteByPrimaryKey(String funcId);

    int insert(SysFunction record);

    int insertSelective(SysFunction record);

    List<SysFunction> selectByExample(SysFunctionExample example);

    SysFunction selectByPrimaryKey(String funcId);

    int updateByExampleSelective(@Param("record") SysFunction record, @Param("example") SysFunctionExample example);

    int updateByExample(@Param("record") SysFunction record, @Param("example") SysFunctionExample example);

    int updateByPrimaryKeySelective(SysFunction record);

    int updateByPrimaryKey(SysFunction record);
}