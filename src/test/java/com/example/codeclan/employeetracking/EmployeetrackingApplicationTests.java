package com.example.codeclan.employeetracking;

import com.example.codeclan.employeetracking.models.Department;
import com.example.codeclan.employeetracking.models.Employee;
import com.example.codeclan.employeetracking.models.Project;
import com.example.codeclan.employeetracking.repositories.DepartmentRepository;
import com.example.codeclan.employeetracking.repositories.EmployeeRepository;
import com.example.codeclan.employeetracking.repositories.ProjectRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EmployeetrackingApplicationTests {


	@Autowired
	EmployeeRepository employeeRepository;

	@Autowired
	DepartmentRepository departmentRepository;

	@Autowired
	ProjectRepository projectRepository;


	@Test
	public void contextLoads() {
	}

	@Test
	public void canCreateEmployeeAndDepartmentThenSave() {
		Department itDepartment = new Department("IT department");
		departmentRepository.save(itDepartment);
		Employee alice = new Employee("Alice", 30, 001, "alice001@gmail.com", itDepartment);
		employeeRepository.save(alice);
	}

	@Test
	public void canCreateEmployeeAndProjectThenSave() {
		Department itDepartment = new Department("IT department");
		departmentRepository.save(itDepartment);
		Employee alice = new Employee("Alice", 30, 001, "alice001@gmail.com", itDepartment);
		employeeRepository.save(alice);
		Project project = new Project("Hello World", 60);
		projectRepository.save(project);

		alice.addProject(project);
		project.addEmployee(alice);
		projectRepository.save(project);
	}
}
