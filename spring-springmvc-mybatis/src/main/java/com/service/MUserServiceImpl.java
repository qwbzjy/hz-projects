package com.service;

import com.dao.MUserMapper;
import com.model.MUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author created by qwb on 2018/9/18 18:30
 */
@Service
public class MUserServiceImpl implements MUserServiceI {

    @Autowired
    private MUserMapper muserMapper;

//    public MUserMapper getMuserMapper() {
//        return muserMapper;
//    }


//    public void setMuserMapper(MUserMapper muserMapper) {
//        this.muserMapper = muserMapper;
//    }

    public List<MUser> getAll() {

        return muserMapper.getAll();
    }

    public int insert(MUser muser) {

        return muserMapper.insert(muser);
    }

    public int update(MUser muser) {

        return muserMapper.updateByPrimaryKey(muser);
    }


    public int delete(String id) {

        return muserMapper.deleteByPrimaryKey(id);
    }

    public MUser selectByPrimaryKey(String id) {

        return muserMapper.selectByPrimaryKey(id);
    }
}
