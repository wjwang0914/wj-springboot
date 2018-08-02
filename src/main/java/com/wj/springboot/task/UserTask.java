package com.wj.springboot.task;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class UserTask {

    @Scheduled(fixedRate = 10000)
    public void testTask1() {
        log.info("每10秒执行一次");
    }

    @Scheduled(cron = "0 0 9 * * ?")
    public void testTask2() {
        log.info("每天早上9点触发");
    }
}
