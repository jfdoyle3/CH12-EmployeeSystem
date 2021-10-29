package com.careerdevs.employeesystem.controller;

import com.careerdevs.employeesystem.model.Employee;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
    //    private final EmployeeRepository repository;
    private AtomicLong idCounter = new AtomicLong();
    //
//    public EmployeeController(EmployeeRepository repository) {
//        this.repository = repository;
//    }
    Map<Long, Employee> employees = new HashMap<>();

    public EmployeeController() {
        employees.put(idCounter.incrementAndGet(), new Employee(idCounter.get(),"Jim", 56, "Developer"));
    }


    @GetMapping
    public List<Employee> all() {
        return new ArrayList<Employee>(employees.values());
    }

    @PostMapping
    public Employee newEmployee(@RequestBody Employee newEmployee) {
        Long id = idCounter.incrementAndGet();
        newEmployee.setId(id);

        employees.put(id, newEmployee);

        return newEmployee;

    }

    @GetMapping("/{id}")
    public Employee employee(@PathVariable Long id)  {
        return employees.get(id);
    }


}
