package com.demo.demossm.service.impl;

import com.demo.demossm.model.Demo;
import com.demo.demossm.service.DemoService;
import com.demo.demossm.util.Pager;
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
public class DemoServiceImplTest {
    @Autowired
    private DemoService demoService;

    private Demo demo;
    private Demo blankDemo;

    private Pager<Demo> pager;

    @Before
    public void setUp() throws Exception {

        demo = Demo.builder()
                .id("002")
                .name("小红")
                .build();

        blankDemo = Demo.builder().build();

        pager = new Pager<Demo>();
        pager.setPageSize(2);
        pager.setCurrentPage(2);
    }

    //这是每个分支都考虑一遍但都这样写总有一天会秃头的测法
    @Test
    public void testDeleteByPrimaryKey() {
        //测试正常
        demo.setId("001");
        Assert.assertEquals(1,demoService.deleteByPrimaryKey(demo));

        //测试异常
        String mag = null;

        try {
            demo.setId("111");
            demoService.deleteByPrimaryKey(demo);
        } catch (Exception e) {
            mag = e.getMessage();
        }
        Assert.assertEquals("删除失败",mag);

        try {
            demoService.deleteByPrimaryKey(blankDemo);
        } catch (Exception e) {
            mag = e.getMessage();
        }
        Assert.assertEquals("主键信息为空",mag);

        try {
            demo.setId("   ");
            demoService.deleteByPrimaryKey(demo);
        } catch (Exception e) {
            mag = e.getMessage();
        }
        Assert.assertEquals("主键信息为空",mag);
    }

    //这是更让人快乐一点的偷懒测试
    @Test(expected = RuntimeException.class)
    public void testDeleteByPrimaryKeyAgain() {
        //测试正常
        demo.setId("001");
        Assert.assertEquals(1,demoService.deleteByPrimaryKey(demo));

        //测试异常
        Assert.assertEquals(0,demoService.deleteByPrimaryKey(blankDemo));
    }


}