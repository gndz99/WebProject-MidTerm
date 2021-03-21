package com19.midterm.cs208midterm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@SpringBootApplication
@Controller
public class Cs208midtermApplication {
    @Autowired
    private DatalarRepository repo;

    public static void main(String[] args) {
        SpringApplication.run(Cs208midtermApplication.class, args);
    }

    @GetMapping("/")
    public String index(Model model){
        model.addAttribute("datalar",repo.findAll());
        return "index";
    }
    @GetMapping("/aboutapi")
    public String aboutapi(){
        return "aboutapi";
    }

}

