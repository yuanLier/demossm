define({ "api": [
  {
    "type": "POST",
    "url": "demo",
    "title": "添加单个成员信息",
    "group": "DEMO_ADD",
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "id",
            "description": "<p>编号</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "name",
            "description": "<p>姓名</p>"
          }
        ]
      }
    },
    "success": {
      "examples": [
        {
          "title": "Success-Response:",
          "content": "HTTP/1.1 200 OK\n{\n  \"msg\": \"success\"\n  \"code\": \"1\",\n  \"object\": 1\n}",
          "type": "json"
        }
      ]
    },
    "version": "0.0.0",
    "filename": "src/main/java/com/demo/demossm/apidoc/DemoApiDoc.java",
    "groupTitle": "DEMO_ADD",
    "name": "PostDemo"
  },
  {
    "type": "DELETE",
    "url": "demo",
    "title": "(批量)删除成员信息",
    "description": "<p>根据num组删除成员信息，返回成功删除的成员个数</p>",
    "group": "DEMO_DELETE",
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "List",
            "optional": false,
            "field": "idList",
            "description": "<p>学号</p>"
          }
        ]
      }
    },
    "success": {
      "examples": [
        {
          "title": "Success-Response:",
          "content": "HTTP/1.1 200 OK\n{\n  \"code\": \"1\",\n  \"msg\": \"success\"\n  \"object\": 3\n}",
          "type": "json"
        }
      ]
    },
    "version": "0.0.0",
    "filename": "src/main/java/com/demo/demossm/apidoc/DemoApiDoc.java",
    "groupTitle": "DEMO_DELETE",
    "name": "DeleteDemo"
  },
  {
    "type": "GET",
    "url": "demo",
    "title": "得到单个成员信息",
    "description": "<p>根据编号得到信息</p>",
    "group": "DEMO_QUERY",
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "id",
            "description": "<p>编号</p>"
          }
        ]
      }
    },
    "success": {
      "examples": [
        {
          "title": "Success-Response:",
          "content": "HTTP/1.1 200 OK\n{\n   \"msg\": \"success\",\n   \"code\": 1,\n   \"object\": {\n       \"id\": \"001\",\n       \"name\": \"小黑\"\n   }\n}",
          "type": "json"
        }
      ]
    },
    "version": "0.0.0",
    "filename": "src/main/java/com/demo/demossm/apidoc/DemoApiDoc.java",
    "groupTitle": "DEMO_QUERY",
    "name": "GetDemo"
  },
  {
    "type": "GET",
    "url": "demo/all/{page}",
    "title": "获取成员列表",
    "description": "<p>分页获取全部成员信息</p>",
    "group": "DEMO_QUERY",
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "Integer",
            "optional": false,
            "field": "page",
            "description": "<p>当前页码</p>"
          }
        ]
      }
    },
    "success": {
      "examples": [
        {
          "title": "Success-Response:",
          "content": "HTTP/1.1 200 OK\n{\n   \"msg\": \"success\",\n   \"code\": 1,\n   \"object\": [\n       {\n           \"id\": \"001\",\n           \"name\": \"小黑\"\n       },\n       {\n           \"id\": \"002\",\n           \"name\": \"小白\"\n       }\n   ]\n}",
          "type": "json"
        }
      ]
    },
    "version": "0.0.0",
    "filename": "src/main/java/com/demo/demossm/apidoc/DemoApiDoc.java",
    "groupTitle": "DEMO_QUERY",
    "name": "GetDemoAllPage"
  },
  {
    "type": "GET",
    "url": "demo/byName/{page}",
    "title": "根据姓名获取成员",
    "description": "<p>根据姓名的模糊分页查询</p>",
    "group": "DEMO_QUERY",
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "Integer",
            "optional": false,
            "field": "page",
            "description": "<p>当前页码</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "name",
            "description": "<p>姓名</p>"
          }
        ]
      }
    },
    "success": {
      "examples": [
        {
          "title": "Success-Response:",
          "content": "HTTP/1.1 200 OK\n{\n   \"msg\": \"success\",\n   \"code\": 1,\n   \"object\": [\n       {\n           \"id\": \"001\",\n           \"name\": \"小黑\"\n       },\n       {\n           \"id\": \"002\",\n           \"name\": \"小白\"\n       }\n   ]\n}",
          "type": "json"
        }
      ]
    },
    "version": "0.0.0",
    "filename": "src/main/java/com/demo/demossm/apidoc/DemoApiDoc.java",
    "groupTitle": "DEMO_QUERY",
    "name": "GetDemoBynamePage"
  },
  {
    "type": "PUT",
    "url": "demo",
    "title": "更新单个成员信息",
    "group": "DEMO_UPDATE",
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "id",
            "description": "<p>编号</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "name",
            "description": "<p>姓名</p>"
          }
        ]
      }
    },
    "success": {
      "examples": [
        {
          "title": "Success-Response:",
          "content": "HTTP/1.1 200 OK\n{\n  \"msg\": \"success\"\n  \"code\": \"1\",\n  \"object\": 1\n}",
          "type": "json"
        }
      ]
    },
    "version": "0.0.0",
    "filename": "src/main/java/com/demo/demossm/apidoc/DemoApiDoc.java",
    "groupTitle": "DEMO_UPDATE",
    "name": "PutDemo"
  }
] });
