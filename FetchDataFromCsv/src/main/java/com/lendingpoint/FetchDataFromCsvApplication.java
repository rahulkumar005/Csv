package com.lendingpoint;

import net.javacrumbs.shedlock.spring.annotation.EnableSchedulerLock;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableSchedulerLock(defaultLockAtMostFor = "1000L")
public class FetchDataFromCsvApplication {

	public static void main(String[] args) {
		SpringApplication.run(FetchDataFromCsvApplication.class, args);
	}

}
