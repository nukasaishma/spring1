package com.example.employee.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.employee.model.Employee;
@Repository
public interface Employeerepo extends JpaRepository<Employee, Long>{

}
