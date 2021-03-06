package com.demo.demossm.service;

import com.demo.demossm.model.Demo;
import com.demo.demossm.util.Pager;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DemoService {
    /**
     * 增
     * @param record
     * @return
     */
    int insert(Demo record);

    /**
     * 删
     * @param key
     * @return
     */
    int deleteByPrimaryKey(Demo key);

    /**
     * 改
     * @param record
     * @return
     */
    int updateByPrimaryKey(Demo record);

    /**
     * 查
     * @param key
     * @return
     */
    Demo selectByPrimaryKey(Demo key);

    /**
     * 根据id的批量删除
     * @param idList
     * @return
     */
    int deleteByIds(List<String> idList);

    /**
     * 分页获取全部成员
     * @param pager
     * @return
     */
    List<Demo> getAllDemos(Pager<Demo> pager);

    /**
     * 多条件过滤
     * @param pager
     * @param demo
     * @return
     */
    List<Demo> demoFilter(@Param("pager") Pager<Demo> pager, @Param("demo") Demo demo);
}
