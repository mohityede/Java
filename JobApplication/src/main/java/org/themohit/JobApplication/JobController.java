package org.themohit.JobApplication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.batch.BatchProperties;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.themohit.JobApplication.model.JobPost;
import org.themohit.JobApplication.service.JobService;

import java.util.List;

@Controller
public class JobController {
    @Autowired
    private JobService service=new JobService();

    @RequestMapping({"/","home"})
    public String home(){
        System.out.println("home clled");
        return "home";
    }

    @RequestMapping(value = "addjob",method = RequestMethod.GET)
    public String addJob(){
        System.out.println("addJob clled");
        return "addJob";
    }

    @PostMapping("/handleForm")
    public String handleForm(JobPost jobPost){
        System.out.println(jobPost);
        service.addJob(jobPost);
        return "success";
    }

    @GetMapping("/viewalljobs")
    public String getAllJobs(Model m){
        List<JobPost> jobs=service.getAllJobs();
        m.addAttribute("jobPosts",jobs);
        return "viewAllJobs";
    }
}
