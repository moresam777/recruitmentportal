package com.tudip;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RecruitmentportalApplication {
	
	public static Logger logger = LoggerFactory.getLogger(RecruitmentportalApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(RecruitmentportalApplication.class, args);
		logger.info("Recruitment Portal is UP.....");
		System.err.println("<--------------Recruitment-Portal-Application-UP-------------->");
		logger.info("Recruitment-Portal-Application-Running.....");
	}

}
