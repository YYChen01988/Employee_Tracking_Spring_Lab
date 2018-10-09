package com.example.codeclan.employeetracking.repositories;

import com.example.codeclan.employeetracking.models.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Long> {
}
