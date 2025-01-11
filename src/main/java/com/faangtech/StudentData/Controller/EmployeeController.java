package com.faangtech.StudentData.Controller;

import com.faangtech.StudentData.Entity.Employee;
import com.faangtech.StudentData.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class EmployeeController {
    @Autowired
    EmployeeService service;
    @PostMapping("/insert")
    public  String insertRecord(@RequestBody Employee e ){
        service.insertRecord(e);
        return "Record is Inserted---->"+e.getEno();
    }

    @PutMapping("/update")
    public String updateRecord(@RequestBody Employee e){
        service.updateRecord(e);
        return "Update is Updated---->"+e.getEno();
    }
    @GetMapping("/getSingle")
    public Optional<Employee> getSingleRecord(@RequestParam("eno")Integer eno){
        return  service.getSingleRecord(eno);
    }
    @GetMapping("/getAll")
    public Iterable<Employee>getAllRecord(){
        return  service.getAllRecord();
    }
    @DeleteMapping("/deleteSingle")
    public String deleteSingleRecord(@RequestParam("eno")Integer eno){
        service.deleteSingleRecord(eno);
        return "The Record is Deleted--->"+eno;
    }
    @DeleteMapping("/deleteAll")
    public String deleteAllRecords(){
        service.deleteAllRecord();
        return "All Records has Been Deleted--->";
    }

}
