package com.ssm.demo.dao;

import com.ssm.demo.entity.Donor;
import com.ssm.demo.entity.DonorExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DonorMapper {
    long countByExample(DonorExample example);

    int deleteByExample(DonorExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Donor record);

    int insertSelective(Donor record);

    List<Donor> selectByExample(DonorExample example);

    Donor selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Donor record, @Param("example") DonorExample example);

    int updateByExample(@Param("record") Donor record, @Param("example") DonorExample example);

    int updateByPrimaryKeySelective(Donor record);

    int updateByPrimaryKey(Donor record);
}