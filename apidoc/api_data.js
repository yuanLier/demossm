define({ "api": [
  {
    "type": "GET",
    "url": "demo",
    "title": "查找单个成员信息",
    "description": "<p>根据id找成员信息</p>",
    "group": "DEMO_QUERY",
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "id",
            "description": "<p>成员id</p>"
          }
        ]
      }
    },
    "success": {
      "examples": [
        {
          "title": "Success-Response:",
          "content": "HTTP/1.1 200 OK\n{\n  \"id\": \"001\",\n  \"name\": \"小明\"\n}",
          "type": "json"
        }
      ]
    },
    "version": "0.0.0",
    "filename": "src/main/java/com/demo/demossm/apidoc/DemoApiDoc.java",
    "groupTitle": "DEMO_QUERY",
    "name": "GetDemo"
  }
] });