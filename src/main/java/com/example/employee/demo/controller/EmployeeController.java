package com.example.employee.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.employee.demo.entity.Employee;
import com.example.employee.demo.service.EmployeeService;

@RestController
@RequestMapping("emp")
public class EmployeeController {

@Autowired
EmployeeService eService;


//http://localhost:8080/emp/showall
@GetMapping("/showall")
public List<Employee> showall()
{
return eService.selectall();
}

//http://localhost:8080/emp/show/1001
@GetMapping("/show/{id}")
public Employee show(@PathVariable("id") String empid)
{
return eService.select(empid);
}

//http://localhost:8080/emp/delete/1001
@GetMapping("/delete/{id}")
public void deleteById(@PathVariable("id") String empid)
{
eService.delete(empid);
}

}
