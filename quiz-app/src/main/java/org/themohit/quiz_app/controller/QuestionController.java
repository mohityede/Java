package org.themohit.quiz_app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.themohit.quiz_app.model.Question;
import org.themohit.quiz_app.service.QuestionService;

import java.util.List;

@RestController
@RequestMapping("/question")
public class QuestionController {
    @Autowired
    private QuestionService service;
    @GetMapping("/allQuestion")
    public ResponseEntity<List<Question>> getHome(){
        return service.getAllQues();
    }

    @GetMapping("/category/{cat}")
    public ResponseEntity<List<Question>> getQuesByCat(@PathVariable(name = "cat") String category){
        return service.getQuestionByCat(category);
    }

    @PostMapping("/add")
    public ResponseEntity<Question> addQuestion(@RequestBody Question question){
        return service.addQuestion(question);
    }

    @PutMapping("/update")
    public ResponseEntity<String> updateQuestion(@RequestBody Question question){
        return service.updateQuestions(question);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteQuestion(@PathVariable int id){
        return service.deleteQuestionById(id);
    }
}
