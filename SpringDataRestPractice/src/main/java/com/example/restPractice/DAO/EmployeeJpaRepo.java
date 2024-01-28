package com.example.restPractice.DAO;

import com.example.restPractice.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//@RepositoryRestResource(path = "members")
public interface EmployeeJpaRepo extends JpaRepository<Employee, Integer> {

}
