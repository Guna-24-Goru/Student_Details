package com.faangtech.StudentData.Service;

import com.faangtech.StudentData.Entity.Employee;
import com.faangtech.StudentData.Repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepo repo;

    public  void insertRecord(Employee e){
        repo.save(e);
    }
    public  void updateRecord(Employee e){
        repo.save(e);
    }
    public Optional<Employee> getSingleRecord(Integer eno){
       return  repo.findById(eno);
    }
    public  Iterable<Employee> getAllRecord(){
        return  repo.findAll();
    }
    public void deleteSingleRecord(Integer eno){
        repo.deleteById(eno);
    }
    public  void deleteAllRecord(){
        repo.deleteAll();
    }
}
