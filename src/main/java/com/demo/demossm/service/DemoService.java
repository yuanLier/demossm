package com.demo.demossm.service;

import com.demo.demossm.model.Demo;

public interface DemoService {
    int deleteByPrimaryKey(Demo key);

    int insert(Demo record);

    Demo selectByPrimaryKey(Demo key);

    int updateByPrimaryKey(Demo record);
}
