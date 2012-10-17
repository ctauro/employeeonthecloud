package com.clarence.employeeonthecloud.controller;

import com.clarence.employeeonthecloud.Employee;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/employees")
@org.springframework.stereotype.Controller
@RooWebScaffold(path = "employees", formBackingObject = Employee.class)
public class Controller {
}
