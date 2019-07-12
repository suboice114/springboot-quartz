package com.su.springbootquartz.service.impl;

import com.su.springbootquartz.service.ITaskInfoService;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Date;

@Service("taskInfo")
@Transactional
public class TaskInfoServiceImpl implements ITaskInfoService{
    @Override
    public void execute() {
        System.out.println("任务执行开始===============任务执行开始");
        System.out.println(new Date());
        System.out.println("任务执行结束===============任务执行结束");
    }
}
