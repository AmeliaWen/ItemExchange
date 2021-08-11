package com.ssm.demo.dao;

import com.ssm.demo.entity.Itemexchangeinfo;
import com.ssm.demo.entity.ItemexchangeinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ItemexchangeinfoMapper {
    long countByExample(ItemexchangeinfoExample example);

    int deleteByExample(ItemexchangeinfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Itemexchangeinfo record);

    int insertSelective(Itemexchangeinfo record);

    List<Itemexchangeinfo> selectByExample(ItemexchangeinfoExample example);

    Itemexchangeinfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Itemexchangeinfo record, @Param("example") ItemexchangeinfoExample example);

    int updateByExample(@Param("record") Itemexchangeinfo record, @Param("example") ItemexchangeinfoExample example);

    int updateByPrimaryKeySelective(Itemexchangeinfo record);

    int updateByPrimaryKey(Itemexchangeinfo record);
}