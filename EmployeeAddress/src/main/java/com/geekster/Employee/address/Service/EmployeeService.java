package com.geekster.Employee.address.Service;

import com.geekster.Employee.address.Irepo.IEmployeeRepo;
import com.geekster.Employee.address.Model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {
    @Autowired
    IEmployeeRepo iEmployeeRepo;

    public String addEmployee(Employee newemp) {
    iEmployeeRepo.save(newemp);
    return "added";
    }

    public List<Employee> getAllAddress() {
        return iEmployeeRepo.findAll();
    }

    public Optional<Employee> getData(Long id) {
        Optional<Employee>list=iEmployeeRepo.findById(id);
        return list;

    }

    public String updateId(Long id, String firstName) {
        Employee employee=iEmployeeRepo.findById(id).orElse(null);
        if(employee !=null){
            employee.setFirstName(firstName);
            iEmployeeRepo.save(employee);
            return "Update FirstName Successfully";
        }
        return "Not Match Id";

    }

    public String DeleteId(Long id) {
        iEmployeeRepo.deleteById(id);
        return "Successfully Delete";
    }
}
