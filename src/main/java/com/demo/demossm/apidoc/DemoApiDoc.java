package com.demo.demossm.apidoc;

import com.demo.demossm.model.Demo;
import com.demo.demossm.util.ConstantValue;
import com.demo.demossm.util.Pager;
import com.demo.demossm.util.ToMap;

import java.util.ArrayList;
import java.util.Map;

public class DemoApiDoc {
    /**
     *   @api {POST} demo 添加单个成员信息
     *   @apiGroup DEMO-ADD
     *   @apiParam  {String} id 编号
     *   @apiParam  {String} name 姓名
     *   @apiSuccessExample {json} Success-Response:
     *       HTTP/1.1 200 OK
     *       {
     *         "msg": "success"
     *         "code": "1",
     *         "object": 1
     *       }
     */
    public Map insertOneWorker(Demo demo){
        return ToMap.toMap(ConstantValue.SUCCESS_CODE,ConstantValue.SUCCESS,null);
    }

    /**
     *   @api {DELETE} demo 删除单个成员信息
     *   @apiDescription 根据编号删除信息
     *   @apiGroup DEMO-DELETE
     *   @apiParam  {String} id 编号
     *   @apiSuccessExample {json} Success-Response:
     *       HTTP/1.1 200 OK
     *       {
     *         "msg": "success"
     *         "code": "1",
     *         "object": 1
     *       }
     */
    public Map deleteOneDemo(Demo demo){
        return ToMap.toMap(ConstantValue.SUCCESS_CODE,ConstantValue.SUCCESS,null);

    }

    /**
     *   @api {PUT} demo 更新单个成员信息
     *   @apiGroup DEMO-UPDATE
     *   @apiParam  {String} id 编号
     *   @apiParam  {String} name 姓名
     *   @apiSuccessExample {json} Success-Response:
     *       HTTP/1.1 200 OK
     *       {
     *         "msg": "success"
     *         "code": "1",
     *         "object": 1
     *       }
     */
    public Map updateOneDemo(Demo demo){
        return ToMap.toMap(ConstantValue.SUCCESS_CODE,ConstantValue.SUCCESS,null);

    }

    /**
     *   @api {GET} demo 得到单个成员信息
     *   @apiDescription 根据编号得到信息
     *   @apiGroup DEMO-QUERY
     *   @apiParam  {String} id 编号
     *   @apiSuccessExample {json} Success-Response:
     *       HTTP/1.1 200 OK
     *       {
     *          "msg": "success",
     *          "code": 1,
     *          "object": {
     *              "id": "001",
     *              "name": "小黑"
     *          }
     *       }
     */
    public Map selectOneDemo(Demo demo){
        return ToMap.toMap(ConstantValue.SUCCESS_CODE,ConstantValue.SUCCESS,new Demo());
    }

    /**
     *   @api {GET} demo/all/{page} 获取成员列表
     *   @apiDescription 分页获取全部成员信息
     *   @apiGroup DEMO-QUERY
     *   @apiParam  {Integer} page 当前页码
     *   @apiSuccessExample {json} Success-Response:
     *       HTTP/1.1 200 OK
     *       {
     *          "msg": "success",
     *          "code": 1,
     *          "object": [
     *              {
     *                  "id": "001",
     *                  "name": "小黑"
     *              },
     *              {
     *                  "id": "002",
     *                  "name": "小白"
     *              }
     *          ]
     *       }
     */
    public Map getAllDemos(Integer page, Pager<Demo> pager){
        return ToMap.toMap(ConstantValue.SUCCESS_CODE,ConstantValue.SUCCESS,new ArrayList<Demo>());
    }

    /**
     *   @api {GET} demo/byName/{page} 根据姓名获取成员
     *   @apiDescription 根据姓名的模糊分页查询
     *   @apiGroup DEMO-QUERY
     *   @apiParam  {Integer} page 当前页码
     *   @apiParam  {String} name 姓名
     *   @apiSuccessExample {json} Success-Response:
     *       HTTP/1.1 200 OK
     *       {
     *          "msg": "success",
     *          "code": 1,
     *          "object": [
     *              {
     *                  "id": "001",
     *                  "name": "小黑"
     *              },
     *              {
     *                  "id": "002",
     *                  "name": "小白"
     *              }
     *          ]
     *       }
     */
    public Map findByName( String name, Integer page, Pager<Demo> pager){
        pager.setCurrentPage(page);
        return ToMap.toMap(ConstantValue.SUCCESS_CODE,ConstantValue.SUCCESS,new ArrayList<Demo>());
    }

}
