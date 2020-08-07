package com.xiaopy.mongdbdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.elasticsearch.ElasticsearchDataAutoConfiguration;

@SpringBootApplication(exclude = { ElasticsearchDataAutoConfiguration.class})
public class MongdbDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(MongdbDemoApplication.class, args);
    }

}
