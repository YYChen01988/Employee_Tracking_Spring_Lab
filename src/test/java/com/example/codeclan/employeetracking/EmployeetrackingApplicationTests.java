package com.example.codeclan.employeetracking;

import com.example.codeclan.employeetracking.models.Employee;
import com.example.codeclan.employeetracking.repositories.EmployeeRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EmployeetrackingApplicationTests {

	@Test
	public void contextLoads() {
	}

	@Autowired
	EmployeeRepository employeeRepository;

	@Test
	public void canCreateEmployee() {
		Employee employee = new Employee("Alice", 30, 001, "alice001@gmail.com");
		employeeRepository.save(employee);
	}
}
