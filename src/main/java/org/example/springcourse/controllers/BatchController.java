package org.example.springcourse.controllers;

import org.example.springcourse.dao.PersonDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/test-batch-update")
public class BatchController {
    
    private final PersonDAO personDAO;

    @Autowired
    public BatchController(PersonDAO personDAO) {
        this.personDAO = personDAO;
    }


    @GetMapping
    public String index() {
        return "batch/index";
    }
    
    @GetMapping("/without")
    public String withoutBatch(){
        return "redirect:/people";
    }

    @GetMapping("/with")
    public String withBatch(){
        return "redirect:/people";
    }
}
