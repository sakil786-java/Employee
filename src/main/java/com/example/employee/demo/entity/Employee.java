package com.example.employee.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

//@Data


@NoArgsConstructor
@AllArgsConstructor
//@Getter
//@Setter
public class Employee {

private @Getter @Setter String empid;
private @Getter @Setter  String empname;
private  @Getter @Setter  double empsal;

}