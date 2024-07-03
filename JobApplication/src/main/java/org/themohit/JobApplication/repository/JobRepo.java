package org.themohit.JobApplication.repository;

import org.springframework.stereotype.Repository;
import org.themohit.JobApplication.model.JobPost;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class JobRepo {
    private List<JobPost> jobs=new ArrayList<>(Arrays.asList(
            new JobPost("Full Stack Dev",21,"you should know all",5,new ArrayList<String>(Arrays.asList("Java","Docker","HTML","CSS"))),
            new JobPost("Full Stack Dev",21,"you should know all",5,new ArrayList<String>(Arrays.asList("Java","Docker","HTML","CSS"))),
            new JobPost("Full Stack Dev",21,"you should know all",5,new ArrayList<String>(Arrays.asList("Java","Docker","HTML","CSS"))),
            new JobPost("Full Stack Dev",21,"you should know all",5,new ArrayList<String>(Arrays.asList("Java","Docker","HTML","CSS"))))
    );

    public List<JobPost> getAllJobs(){
        return jobs;
    }

    public void addJob(JobPost jobPost){
        jobs.add(jobPost);
        for(JobPost job:jobs){
            System.out.println(job);
        }
    }
}
