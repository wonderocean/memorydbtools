package com.xqtools.memorydbtools;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.xqtools.memorydbtools.dao")
public class MemoryDBToolsApplication {

	public static void main(String[] args) {
		SpringApplication.run(MemoryDBToolsApplication.class, args);
	}

}
