package com.example.codeclan.employeetracking.controllers;

import com.example.codeclan.employeetracking.models.Department;
import com.example.codeclan.employeetracking.repositories.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/departments")
public class DepartmentController {

    @Autowired
    DepartmentRepository departmentRepository;

    @GetMapping
    public List<Department> getAllDepartments(){
        return departmentRepository.findAll();
    }
}
