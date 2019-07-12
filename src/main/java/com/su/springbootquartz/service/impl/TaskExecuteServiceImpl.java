package com.su.springbootquartz.service.impl;

import com.su.springbootquartz.service.ITaskExecuteService;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Date;

@Service
@Transactional
public class TaskExecuteServiceImpl implements ITaskExecuteService{

    @Scheduled(cron = "30 * * * * ?")
    @Override
    public void execute() {
        System.out.println("注解执行开始==============注解执行开始");
        System.out.println(new Date());
        System.out.println("注解执行结束==============注解执行结束");
    }
}
