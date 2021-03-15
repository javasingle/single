package com.single.controller;

import com.single.domain.Employee;
import com.single.service.EmployService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @Autowired
    EmployService employService;

    @GetMapping("/emp/{id}")
    public Employee getEmpById(@PathVariable("id") Integer id) {
        Employee empById = employService.getEmpById(id);

        return empById;
    }

    @GetMapping("/emp")
    public Employee updateEmp(Employee employee){
        Employee emp = employService.updateEmp(employee);

        return  emp;
    }

}
