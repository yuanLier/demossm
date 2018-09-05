package com.demo.demossm.dao;

import com.demo.demossm.model.Demo;
import com.demo.demossm.util.Pager;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DemoDao {

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
     * 多条件过滤（即多属性的模糊分页查询）
     * 将传入单个属性改为了传入整个对象
     * @param pager
     * @param demo
     * @return
     */
    List<Demo> demoFilter(@Param("pager") Pager<Demo> pager, @Param("demo") Demo demo);
}
