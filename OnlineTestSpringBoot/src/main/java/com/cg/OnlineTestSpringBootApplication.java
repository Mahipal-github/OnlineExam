package com.cg;

import java.util.Properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;

import com.cg.onlinetest.util.OnlineConstants;

@SpringBootApplication
public class OnlineTestSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(OnlineTestSpringBootApplication.class, args);
		
	}

}
