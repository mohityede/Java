package org.themohit.JobApplication.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Data
//@AllArgsConstructor
@NoArgsConstructor
@Component
public class JobPost {
    private String postProfile;
    private int postId;
    private String postDesc;
    private int reqExperience;
    private List<String> postTechStack;

    public JobPost(String postProfile, int postId, String postDesc, int reqExperience, List<String> postTechStack) {
        this.postProfile = postProfile;
        this.postId = postId;
        this.postDesc = postDesc;
        this.reqExperience = reqExperience;
        this.postTechStack = postTechStack;
    }

    @Override
    public String toString() {
        return "JobPost{" +
                "postProfile='" + postProfile + '\'' +
                ", postId=" + postId +
                ", postDesc='" + postDesc + '\'' +
                ", reqExperience=" + reqExperience +
                ", postTechStack=" + postTechStack +
                '}';
    }
}
