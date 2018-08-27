package com.demo.demossm.apidoc;

import com.demo.demossm.model.Demo;

public class DemoApiDoc {

    /**
     *   @api {GET} demo 查找单个成员信息
     *   @apiDescription 根据id找成员信息
     *   @apiGroup DEMO-QUERY
     *   @apiParam  {String} id 成员id
     *   @apiSuccessExample {json} Success-Response:
     *       HTTP/1.1 200 OK
     *       {
     *         "id": "001",
     *         "name": "小明"
     *       }
     */
    public Demo selectOne(String id){
        return new Demo();
    }
}
