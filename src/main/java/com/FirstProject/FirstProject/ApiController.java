package com.FirstProject.FirstProject;

import com.FirstProject.FirstProject.service.PrimeCheck;
import lombok.AllArgsConstructor;
import lombok.extern.java.Log;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
@RequestMapping("hello")
public class ApiController {
    private PrimeCheck primecheck;

    @GetMapping
    public String GetGratings() {
        return "Hello";
    }
    @GetMapping("primecheck/{number}")
    public String PrimeCheck(@PathVariable Integer number) {
        return number+" is prime "+ primecheck.primecheck(number);
    }
}
