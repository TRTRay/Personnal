## 上传运动记录

**接口地址**: /api/sports/{userPhone}

**请求方式**: POST

**consumes**: ["application/json"]

**produces**: ["\*/\*"]

**路径参数**

| 参数名称  | 参数说明   | 是否必须 | 数据类型 |
| --------- | ---------- | -------- | -------- |
| userPhone | 用户手机号 | true     | string   |

userPhone  用户手机号  true  string

**请求参数**：

| 参数名称  | 参数说明           | 是否必须 | 数据类型  |
| :-------- | :----------------- | -------- | --------- |
| sportType | 活动类型           | true     | integer   |
| date      | 运动开始时间       | true     | timestamp |
| distance  | 运动距离(KM)       | true     | double    |
| time      | 运动持续时间(s)    | true     | integer   |
| calorie   | 运动消耗热量(千卡) | true     | double    |

 **响应示例**:

``` JSON
{
    "status": 200,
    "message":"success!",
    "success":true,
    "data":{}
}
```

## 查询运动记录

**接口地址**: /api/sports/{userPhone}

**请求方式**: GET

**consumes**: ["application/json"]

**produces**: ["\*/\*"]

**路径参数**：

| 参数名称  | 参数说明                | 是否必须 | 数据类型 |
| :-------- | :---------------------- | -------- | -------- |
| userPhone | 用户手机号              | true     | string 

 **响应示例**:

``` JSON
{
    "status": 200,
    "message":"success!",
    "success":true,
    "data":{
        "sportType" : "1",
        "date" : 1630487524,
        "distance" : 2.0,
		"time" : 6000,
        "calorie" : 500.5,
    }
}
```

**响应参数**:

| 参数名称  | 参数说明                | 数据类型 |
| :-------- | :---------------------- | -------- |
| sportType | 活动类型                | integer  |
| date      | 运动开始时间(timestamp) | integer  |
| distance  | 运动距离(KM)            | double   |
| time      | 运动持续时间(s)         | integer  |
| calorie   | 运动消耗热量(千卡)      | double   |

