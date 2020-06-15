# junitdemo
springboot junit5 mybatisplus demo

# spring和junit5环境下的测试
&emsp;&emsp;不是用junit写的测试都叫做单元测试。单元测试必须简单，没有依赖外部数据源。有依赖到数据库之类的，可以按大、中、小的角度划分，叫大测试、中测试、小测试，这样不会那么别扭。这里展示一些springboot环境下使用junit5进行各层测试的例子，仅供参考。  
&emsp;&emsp;完整代码示例：https://github.com/classyex/junitdemo

## 单元测试

```java
class Demo {
    @Test
    public void should_get_message_and_data() {
        Result<String> result = new Result<>(1, "msg", "data");
        Assertions.assertEquals(1, result.getCode());
        Assertions.assertEquals("msg", result.getMsg());
        Assertions.assertEquals("data", result.getData());
    }
}
```

## dao层测试
```java
class Demo {
    @Test
    public void should_list_user_age_rank() {
        List<User> list = userDao.listUserAgeRank();
        Assertions.assertEquals(4, list.get(2).getId());
        Assertions.assertEquals(3, list.get(4).getId());
    }
}    
```

## service层测试

```java
class Demo {
    @Test
    public void should_get_user_age_rank() {
        int rank = userRankService.getUserAgeRank(3L);
        Assertions.assertEquals(5, rank);
    }
}
```

## controller层测试

```java
class Demo {
    @Test
    public void should_get_user_by_id() throws Exception {
        ResultActions resultActions = performWithJson(
                MockMvcRequestBuilders.get("/users/{id}", 1));
        TestAssistant.assertSuccess(resultActions)
                .andExpect(MockMvcResultMatchers.jsonPath("$.data.name").value("Jone"));
    }
}
```

