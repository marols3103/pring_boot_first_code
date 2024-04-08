package com.openclassroom.api.repository;

import org.springframework.data.repository.CrudRepository;
import com.openclassroom.api.model.Employee;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpoyeeRepository extends CrudRepository<Employee,Long> {
}
