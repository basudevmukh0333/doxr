package com.doxr.Employee.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class EmployeeController {


    @GetMapping("/joinName")
    public String getName(@RequestParam String firstName,
                           @RequestParam String lastName) {
        System.out.println("Inside Controller");

        return "Entered Name is :: "+ " "+ firstName + " " + lastName;
    }

}
