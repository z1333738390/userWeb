package com.xy.dao;

//import org.apache.ibatis.annotations.Mapper;

import com.xy.dto.AbsNgariLoanResult;

//@Mapper
public interface AbsNgariLoanResultMapper {
    int deleteByPrimaryKey(String id);

    int insert(AbsNgariLoanResult record);

    int insertSelective(AbsNgariLoanResult record);

    AbsNgariLoanResult selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(AbsNgariLoanResult record);

    int updateByPrimaryKey(AbsNgariLoanResult record);
}