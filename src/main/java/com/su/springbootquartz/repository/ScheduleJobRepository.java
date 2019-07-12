package com.su.springbootquartz.repository;

import com.su.springbootquartz.domain.ScheduleJob;

import java.util.List;

public interface ScheduleJobRepository extends BaseRepository<ScheduleJob,Long>{

    List<ScheduleJob> findAllByJobStatus(String jobStatus);
}
