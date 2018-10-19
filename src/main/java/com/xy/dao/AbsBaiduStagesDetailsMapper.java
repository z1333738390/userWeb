package com.xy.dao;

//import org.apache.ibatis.annotations.Mapper;

import com.xy.dto.AbsBaiduStagesDetails;

//@Mapper
public interface AbsBaiduStagesDetailsMapper {
    int deleteByPrimaryKey(String id);

    int insert(AbsBaiduStagesDetails record);

    int insertSelective(AbsBaiduStagesDetails record);

    AbsBaiduStagesDetails selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(AbsBaiduStagesDetails record);

    int updateByPrimaryKey(AbsBaiduStagesDetails record);
}