package com.faangtech.StudentData.Repo;

import com.faangtech.StudentData.Entity.Employee;
import org.springframework.data.relational.core.sql.In;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepo extends CrudRepository<Employee,Integer> {

}
