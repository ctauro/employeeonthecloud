package com.clarence.employeeonthecloud;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;

@RooJavaBean
@RooToString
@RooJpaActiveRecord(finders = { "findEmployeesByEmployeeNameLike", "findEmployeesByEmployeeId" })
public class Employee {

    @NotNull
    private int employeeId;

    @Size(min = 2, max = 30)
    private String employeeName;

    @Min(1000L)
    @Max(40000L)
    private float employeeSalary;
}
