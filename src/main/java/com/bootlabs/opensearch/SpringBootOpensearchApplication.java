package com.bootlabs.opensearch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.elasticsearch.ElasticsearchDataAutoConfiguration;

@SpringBootApplication(exclude = {ElasticsearchDataAutoConfiguration.class})
public class SpringBootOpensearchApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootOpensearchApplication.class, args);
	}

}
