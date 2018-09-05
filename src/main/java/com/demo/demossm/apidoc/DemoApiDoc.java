package com.demo.demossm.apidoc;

import com.demo.demossm.model.Demo;
import com.demo.demossm.util.ConstantValue;
import com.demo.demossm.util.Pager;
import com.demo.demossm.util.ToMap;

import java.util.ArrayList;
import java.util.List;
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

//    记得加上@
//    /**
//     *   api {DELETE} demo 删除单个成员信息
//     *   apiDescription 根据编号删除信息
//     *   apiGroup DEMO-DELETE
//     *   apiParam  {String} id 编号
//     *   apiSuccessExample {json} Success-Response:
//     *       HTTP/1.1 200 OK
//     *       {
//     *         "msg": "success"
//     *         "code": "1",
//     *         "object": 1
//     *       }
//     */
//    public Map deleteOneDemo(Demo demo){
//        return ToMap.toMap(ConstantValue.SUCCESS_CODE,ConstantValue.SUCCESS,null);
//    }

    /**
     *   @api {DELETE} demo (批量)删除成员信息
     *   @apiDescription 根据num组删除成员信息，返回成功删除的成员个数
     *   @apiGroup DEMO-DELETE
     *   @apiParam  {List} idList 学号
     *   @apiSuccessExample {json} Success-Response:
     *       HTTP/1.1 200 OK
     *       {
     *         "code": "1",
     *         "msg": "success"
     *         "object": 3
     *       }
     */
    public Map deleteByIds(List<String> idList){
        return ToMap.toMap(ConstantValue.SUCCESS_CODE,ConstantValue.SUCCESS,0);
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
     *              "name": "小黑",
     *              "tel": "111"
     *          }
     *       }
     */
    public Map selectOneDemo(Demo demo){
        return ToMap.toMap(ConstantValue.SUCCESS_CODE,ConstantValue.SUCCESS,new Demo());
    }

    /**
     *   @api {GET} demo/all 获取成员列表
     *   @apiDescription 分页获取全部成员信息
     *   @apiGroup DEMO-QUERY
     *   @apiParam  {Integer} page 当前页码
     *   @apiParam  {Integer} size 每页数量
     *   @apiSuccessExample {json} Success-Response:
     *       HTTP/1.1 200 OK
     *       {
     *          "msg": "success",
     *          "code": 1,
     *          "object": [
     *              {
     *                  "id": "001",
     *                  "name": "小黑",
     *                  "tel": "111"
     *              },
     *              {
     *                  "id": "002",
     *                  "name": "小白",
     *                  "tel": "222"
     *              }
     *          ]
     *       }
     */
    public Map getAllDemos(Integer page, Pager<Demo> pager){
        return ToMap.toMap(ConstantValue.SUCCESS_CODE,ConstantValue.SUCCESS,new ArrayList<Demo>());
    }

    /**
     *   @api {POST} demo/filter 筛选成员信息
     *   @apiDescription 根据表单数据筛选成员信息
     *   @apiGroup DEMO-QUERY
     *   @apiParam  {Integer} page 当前页码
     *   @apiParam  {Integer} size 每页数量
     *   @apiParam  {Demo} demo 表单获取到的成员信息
     *   @apiSuccessExample {json} Success-Response:
     *       HTTP/1.1 200 OK
     *       {
     *          "msg": "success",
     *          "code": 1,
     *          "object": [
     *              {
     *                  "id": "001",
     *                  "name": "小黑",
     *                  "tel": "111"
     *              },
     *              {
     *                  "id": "002",
     *                  "name": "小白",
     *                  "tel": "222"
     *              }
     *          ]
     *       }
     */
    public Map demoFilter(String grade, Integer page, Pager<Demo> pager){
        return ToMap.toMap(ConstantValue.SUCCESS_CODE,ConstantValue.SUCCESS,new ArrayList<Demo>());
    }

}
