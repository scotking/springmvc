package com.boding.sysrolefunc.mapper;

import com.boding.sysrolefunc.mapper.domain.SysRoleFunction;
import com.boding.sysrolefunc.mapper.domain.SysRoleFunctionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysRoleFunctionMapper {
    int countByExample(SysRoleFunctionExample example);

    int deleteByExample(SysRoleFunctionExample example);

    int deleteByPrimaryKey(String uuid);

    int insert(SysRoleFunction record);

    int insertSelective(SysRoleFunction record);

    List<SysRoleFunction> selectByExample(SysRoleFunctionExample example);

    SysRoleFunction selectByPrimaryKey(String uuid);

    int updateByExampleSelective(@Param("record") SysRoleFunction record, @Param("example") SysRoleFunctionExample example);

    int updateByExample(@Param("record") SysRoleFunction record, @Param("example") SysRoleFunctionExample example);

    int updateByPrimaryKeySelective(SysRoleFunction record);

    int updateByPrimaryKey(SysRoleFunction record);
}