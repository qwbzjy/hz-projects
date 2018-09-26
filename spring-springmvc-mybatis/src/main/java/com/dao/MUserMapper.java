package com.dao;

import com.model.MUser;

import java.util.List;

/**
 * @author created by qwb on 2018/9/18 18:29
 */
public interface MUserMapper {
    int deleteByPrimaryKey(String id);

    int insert(MUser record);

    int insertSelective(MUser record);

    MUser selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(MUser record);

    int updateByPrimaryKey(MUser record);

    List<MUser> getAll();
}
