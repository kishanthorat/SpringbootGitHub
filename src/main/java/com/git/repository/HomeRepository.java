package com.git.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.git.model.Employee;

@Repository
public interface HomeRepository extends JpaRepository<Employee, Integer>{

}
