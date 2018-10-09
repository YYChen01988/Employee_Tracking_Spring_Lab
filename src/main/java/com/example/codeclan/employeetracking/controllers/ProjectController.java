package com.example.codeclan.employeetracking.controllers;

import com.example.codeclan.employeetracking.models.Project;
import com.example.codeclan.employeetracking.repositories.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/projects")
public class ProjectController {

    @Autowired
    ProjectRepository projectRepository;

    @GetMapping
    public List<Project> getAllProjects(){
        return this.projectRepository.findAll();
    }
}
