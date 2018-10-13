package com.techprudent.scheduler;

import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@SpringBootApplication
@EnableScheduling
public class SchedulerApplication {
	
	@Scheduled(fixedRate=1000)
	void fixedRate() throws InterruptedException {
		Thread.sleep(1000);
		System.out.println(new Date().toString());
	}
	
	@Scheduled(fixedDelay=1000)
	void fixedDelay() throws InterruptedException {
		Thread.sleep(1000);
		System.out.println(new Date().toString());
	}
	
	@Scheduled(cron="20 59 18 * * ?")
	void cron() {
		System.out.println(new Date().toString());
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SchedulerApplication.class, args);
	}
}
