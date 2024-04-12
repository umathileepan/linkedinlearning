package com.umathileepan.firstjobapp.job;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

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


}
