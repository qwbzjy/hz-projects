package com.service;

import com.model.MUser;

import java.util.List;

/**
 * @author created by qwb on 2018/9/18 18:30
 */
public interface MUserServiceI {
    List<MUser> getAll();

    MUser selectByPrimaryKey(String id);

    int insert(MUser muser);

    int update(MUser muser);

    int delete(String id);
}
