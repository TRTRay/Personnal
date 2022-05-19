## 获取用户信息

**接口地址**: /api/users/{userPhone}

**请求方式**: GET

**consumes**: ["application/json"]

**produces**: ["\*/\*"]

**路径参数**：

| 参数名称  | 参数说明   | 是否必须 | 数据类型 |
| :-------- | :--------- | -------- | -------- |
| userPhone | 用户手机号 | true     | string   |

 **响应示例**:

``` JSON
{
    "status": 200,
    "message":"success!",
    "success":true,
    "data":{
        "userPhone" : "10086",
        "userName" : "Happy",
        "userBirthdate" : "2021-10-21",
        "userEmail" : "2341@163.com",
        "userAddress" : "first ring road of Beijing"
    }
}
```

**data响应参数**:

| 参数名称      | 参数说明             | 类型   |
| ------------- | -------------------- | ------ |
| userPhone     | 用户手机号           | string |
| userName      | 用户名               | string |
| userBirthdata | 用户生日(YYYY-MM-DD) | string |
| userEmail     | 用户邮箱             | string |
| userAddress   | 用户地址             | string |

## 修改用户信息

**接口地址**: /api/users/{userPhone}

**请求方式**: PUT

**consumes**: ["application/json"]

**produces**: ["\*/\*"]

**路径参数**：

| 参数名称  | 参数说明   | 是否必须 | 数据类型 |
| :-------- | :--------- | -------- | -------- |
| userPhone | 用户手机号 | true     | string   |

**请求参数**：

| 参数名称      | 参数说明             | 是否必须 | 类型   |
| ------------- | -------------------- | -------- | ------ |
| userName      | 用户名               | false    | string |
| userBirthdata | 用户生日(YYYY-MM-DD) | false    | string |
| userEmail     | 用户邮箱             | false    | string |
| userAddress   | 用户地址             | false    | string |

 **响应示例**:

``` JSON
{
    "status": 200,
    "message":"success!",
    "success":true,
    "data":{}
}
```
