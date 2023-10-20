package com.geekster.Employee.address.Controller;

import com.geekster.Employee.address.Model.Employee;
import com.geekster.Employee.address.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;
@PostMapping("post")
public String addEmployee( @RequestBody Employee newemp){
   return  employeeService.addEmployee(newemp);

}
@GetMapping("get")
public List<Employee>getAllAddress(){
    return employeeService.getAllAddress();
}
@GetMapping("get/id")
public Optional<Employee> getData(@RequestParam Long id){
    return employeeService.getData(id);

}
@PutMapping("Update")
public String updateId(@RequestParam Long id,@RequestParam String  FirstName){
    return employeeService.updateId(id,FirstName);
}
@DeleteMapping("Delete")
    public String DeleteId(@RequestParam Long Id){
    return employeeService.DeleteId(Id);
}
}
