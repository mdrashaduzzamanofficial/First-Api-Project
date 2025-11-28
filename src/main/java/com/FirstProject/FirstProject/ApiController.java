package com.FirstProject.FirstProject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class ApiController {
    @GetMapping
    public String GetGratings() {
        return "Hello";
    }
}
