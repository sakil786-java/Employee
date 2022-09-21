package com.example.employee.demo.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Component;

import com.example.employee.demo.entity.Employee;

@Component
public class EmployeeService {
   
   static List<Employee> employees =  new ArrayList();
   
   static
   {
       employees.add(new Employee("1001","Athaulla",23404.45));
       employees.add(new Employee("1002","Sonali",25455.45));
       employees.add(new Employee("1003","Keerthi",89404.45));
       employees.add(new Employee("1004","Raja",123404.45));
       
   }
   
   public List<Employee> selectall()
   {
       return employees;
   }
   
   
   public Employee select(String id)
   {
       for(Employee emp:employees)
       {
           if(emp.getEmpid().equals(id))
           {
               return emp;
           }
           
       }
           return null;
   }
   
   public Employee delete(String id)
   {
    Iterator<Employee> itr=employees.iterator();
   
      while(itr.hasNext())
       {
      Employee emp=itr.next();
           if(emp.getEmpid().equals(id))
           {
            itr.remove();
               return emp;
           }
           
       }
          return null;
   }
   
   
   
   }