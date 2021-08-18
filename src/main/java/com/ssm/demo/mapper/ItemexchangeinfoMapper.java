package com.ssm.demo.mapper;

import com.ssm.demo.entity.Itemexchangeinfo;
import com.ssm.demo.entity.ItemexchangeinfoExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface ItemexchangeinfoMapper {
    //@Select("SELECT COUNT(*) FROM itemExchangeInfo WHERE id = #{id}")
    long countByExample(ItemexchangeinfoExample example);

    @Select("select * from itemExchangeInfo")
    List<Itemexchangeinfo> findAll();

    int deleteByExample(ItemexchangeinfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Itemexchangeinfo record);

    int insertSelective(Itemexchangeinfo record);

    List<Itemexchangeinfo> selectByExample(ItemexchangeinfoExample example);

    @Select("select * from itemExchangeInfo where id = #{id}")
    Itemexchangeinfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Itemexchangeinfo record, @Param("example") ItemexchangeinfoExample example);

    int updateByExample(@Param("record") Itemexchangeinfo record, @Param("example") ItemexchangeinfoExample example);

    int updateByPrimaryKeySelective(Itemexchangeinfo record);

    int updateByPrimaryKey(Itemexchangeinfo record);
}