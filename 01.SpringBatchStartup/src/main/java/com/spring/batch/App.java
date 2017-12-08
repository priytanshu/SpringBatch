package com.spring.batch;

import org.springframework.batch.core.configuration.JobRegistry;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.batch.core.repository.JobRepository;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		ApplicationContext ctx = new GenericXmlApplicationContext("beanConfig.xml");

		JobRegistry jobRegistry = ctx.getBean("jobRegistry", JobRegistry.class);
		JobLauncher jobLauncher = ctx.getBean("jobLauncher", JobLauncher.class);
		JobRepository jobRepository = ctx.getBean("jobRepository", JobRepository.class);

		System.out.println("JobRegistry: " + jobRegistry);
		System.out.println("JobLauncher: " + jobLauncher);
		System.out.println("JobRepository: " + jobRepository);

		System.out.println("Hello World!");
	}
}
