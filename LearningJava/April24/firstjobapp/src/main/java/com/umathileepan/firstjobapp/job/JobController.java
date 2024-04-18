package com.umathileepan.firstjobapp.job;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class JobController {
    private JobService jobService;

    //Loosely coupling : create interface then add service annotation in service implement then add constructor to initialize
    public JobController(JobService jobService) {
        this.jobService = jobService;
    }

    @GetMapping("/jobs")
    //Get all jobs
    public List<Job> findAll(){

        return jobService.findAll();
    }

    @PostMapping("/jobs")
    public String createJob(@RequestBody Job job){
        jobService.createJob(job);
        return "Job added successfully";
    }

    @GetMapping("/jobs/{id}")
    public Job getJobById(@PathVariable Long id){
        Job job = jobService.getJobById(id);
        if(job != null)
        return job;
        return new Job(1L,"TestJob","Test","20000","20000","Loc");
    }
}
