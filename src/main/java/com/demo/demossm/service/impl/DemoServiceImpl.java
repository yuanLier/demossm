package com.demo.demossm.service.impl;

import com.demo.demossm.dao.DemoDao;
import com.demo.demossm.exception.InfoNotFullyException;
import com.demo.demossm.model.Demo;
import com.demo.demossm.service.DemoService;
import com.demo.demossm.util.ObjectNotEmptyUtil;
import com.demo.demossm.util.Pager;
import com.demo.demossm.util.StringUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class DemoServiceImpl implements DemoService {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Resource
    private DemoDao demoDao;

    @Override
    public int insert(Demo record) throws RuntimeException{
        if(StringUtil.notEmpty(record.getId())){
            int stateNum = demoDao.insert(record);
            if(stateNum > 0){
                logger.info("添加成功");
                return stateNum;
            } else {
                logger.info("添加失败");
                throw new RuntimeException("添加失败");
            }
        } else {
            logger.info("主键信息为空");
            throw new InfoNotFullyException("主键信息为空");
        }
    }

    @Override
    public int deleteByPrimaryKey(Demo key) throws RuntimeException{
        if(StringUtil.notEmpty(key.getId())){
            int stateNum = demoDao.deleteByPrimaryKey(key);
            if(stateNum > 0){
                logger.info("删除成功");
                return stateNum;
            } else {
                logger.info("删除失败");
                throw new RuntimeException("删除失败");
            }
        } else {
            logger.info("主键信息为空");
            throw new InfoNotFullyException("主键信息为空");
        }
    }

    @Override
    public int updateByPrimaryKey(Demo record) throws RuntimeException{
        if(StringUtil.notEmpty(record.getId())){
            int stateNum = demoDao.updateByPrimaryKey(record);
            if(stateNum > 0){
                logger.info("更新成功");
                return stateNum;
            } else {
                logger.info("更新失败");
                throw new RuntimeException("更新失败");
            }
        } else {
            logger.info("主键信息为空");
            throw new InfoNotFullyException("主键信息为空");
        }
    }

    @Override
    public Demo selectByPrimaryKey(Demo key) throws RuntimeException{
        Demo demo = demoDao.selectByPrimaryKey(key);
        if(demo != null){
            logger.info("查找成功");
            return demo;
        } else {
            logger.info("该成员不存在");
            throw new NullPointerException("该成员不存在");
        }
    }

    @Override
    public int deleteByIds(List<String> idList) {
        if(!idList.equals(new ArrayList<String>())){
            int stateNum = demoDao.deleteByIds(idList);
            if(stateNum > 0){
                logger.info("成功删除" + stateNum + "名成员信息");
                return stateNum;
            } else {
                logger.info("信息删除失败");
                throw new RuntimeException("信息删除失败");
            }
        } else {
            logger.info("传入学号为空");
            throw new InfoNotFullyException("传入学号为空");
        }
    }

    @Override
    public List<Demo> getAllDemos(Pager<Demo> pager) {
        return demoDao.getAllDemos(pager);
    }

    @Override
    public List<Demo> demoFilter(Pager<Demo> pager, Demo demo) throws RuntimeException{
        if (ObjectNotEmptyUtil.notEmpty(demo)) {
            return demoDao.demoFilter(pager,demo);
        } else {
            logger.info("未填写过滤条件");
            throw new InfoNotFullyException("未填写过滤条件");
        }
    }
}
