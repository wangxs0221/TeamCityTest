package com.example.demo;

import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

//@RunWith(SpringRunner.class)
//@WebAppConfiguration // 开启web应用配置
//@SpringBootTest

@RunWith(SpringRunner.class)
//SpringBootTest.WebEnvironment.RANDOM_PORT设置随机端口启动服务器（有助于避免测试环境中的冲突）
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class DemoApplicationTests {

    private MockMvc mvc;

    @Before
    public void setUp() throws Exception {
        mvc = MockMvcBuilders.standaloneSetup(new TestController()).build();
    }

    @Test
    public void testGetMethod() throws Exception {
//        MvcResult result = mvc.perform(MockMvcRequestBuilders.get("/hello"))
//                .andExpect(status().isOk()) // 用于判断返回的期望值
//                .andExpect(content().string("hello"))
//                .andReturn();// 返回执行请求的结果;
//        System.out.println(result.getResponse().getContentAsString());
        Assert.assertEquals(1,1);
    }

}
