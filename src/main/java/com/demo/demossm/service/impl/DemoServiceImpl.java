package com.demo.demossm.service.impl;

import com.demo.demossm.dao.DemoDao;
import com.demo.demossm.model.Demo;
import com.demo.demossm.service.DemoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class DemoServiceImpl implements DemoService {
    @Resource
    private DemoDao demoDao;

    @Override
    public int deleteByPrimaryKey(Demo key) {
        return 0;
    }

    @Override
    public int insert(Demo record) {
        return 0;
    }

    @Override
    public Demo selectByPrimaryKey(Demo key) {
        return demoDao.selectByPrimaryKey(key);
    }

    @Override
    public int updateByPrimaryKey(Demo record) {
        return 0;
    }
}
