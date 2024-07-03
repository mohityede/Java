package org.themohit.JobApplication.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.themohit.JobApplication.model.JobPost;
import org.themohit.JobApplication.repository.JobRepo;

import java.util.List;

@Service
public class JobService {
    @Autowired
    private JobRepo repo=new JobRepo();

    public List<JobPost> getAllJobs(){
        return repo.getAllJobs();
    }

    public void addJob(JobPost job){
        repo.addJob(job);
    }
}
