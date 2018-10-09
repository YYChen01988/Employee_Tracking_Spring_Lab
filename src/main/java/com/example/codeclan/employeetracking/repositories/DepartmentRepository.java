package com.example.codeclan.employeetracking.repositories;

import com.example.codeclan.employeetracking.models.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository <Department, Long> {
}
