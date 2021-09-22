package com.basic.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.basic.entity.EmployeeModel;
@Repository
public interface EmployeeRepo extends JpaRepository<EmployeeModel, Long> {

}
