package com.cmbc.elasticsearch;

import com.alibaba.fastjson.JSON;
import com.cmbc.elasticsearch.config.GulimallElasticSearchConfig;
import lombok.Data;
import org.elasticsearch.action.index.IndexRequest;
import org.elasticsearch.action.index.IndexResponse;
import org.elasticsearch.client.RestHighLevelClient;
import org.elasticsearch.common.xcontent.XContentType;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.IOException;

@SpringBootTest
class GulimallElasticsearchApplicationTests {
    @Autowired
    private RestHighLevelClient client;
    @Test
    void contextLoads() {
        System.out.println(client);
    }
    @Test
    public void indexData() throws IOException {
        IndexRequest indexRequest = new IndexRequest("users");
        indexRequest.id("1");
        User user = new User();
        user.setUsername("zhangsan");
        user.setGender("女");
        user.setAge(18);
        String s = JSON.toJSONString(user);
        indexRequest.source(s, XContentType.JSON);
        IndexResponse index = client.index(indexRequest,GulimallElasticSearchConfig.COMMON_OPTIONS);
        System.out.println(index);
    }
    @Data
    class User{
        private String username;
        private String gender;
        private Integer age;
    }
}
