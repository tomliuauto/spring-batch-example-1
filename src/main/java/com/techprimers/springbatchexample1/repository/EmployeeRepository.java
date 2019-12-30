package com.techprimers.springbatchexample1.repository;

import com.techprimers.springbatchexample1.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
