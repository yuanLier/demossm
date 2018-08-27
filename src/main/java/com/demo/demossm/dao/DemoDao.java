package com.demo.demossm.dao;

import com.demo.demossm.model.Demo;
import org.springframework.stereotype.Repository;

@Repository
public interface DemoDao {
    int deleteByPrimaryKey(Demo key);

    int insert(Demo record);

    Demo selectByPrimaryKey(Demo key);

    int updateByPrimaryKey(Demo record);
}
