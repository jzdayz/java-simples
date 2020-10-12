package io.github.jzdayz.boot.scheduler;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@EnableScheduling
@SpringBootApplication
public class Demo {
    public static void main(String[] args) {
        SpringApplication.run(Demo.class);
    }

    @Scheduled(cron = "* * * * * ?",initialDelayString = "${test.schedule.delay}")
    public void test(){
        System.out.println(1);
    }
}
