package com.demo.demossm.dao;

import com.demo.demossm.model.Demo;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@ContextConfiguration("classpath:spring/spring-config-test.xml")
public class DemoDaoTest {
    @Autowired
    private DemoDao demoDao;

    private Demo demo;

    @Before
    public void setUp() throws Exception {
        demo = Demo.builder()
                .id("002")
                .name("小红")
                .build();
    }

    @Test
    public void testDeleteByPrimaryKey() {
        demo.setId("001");
        Assert.assertEquals(1,demoDao.deleteByPrimaryKey(demo));
    }
}