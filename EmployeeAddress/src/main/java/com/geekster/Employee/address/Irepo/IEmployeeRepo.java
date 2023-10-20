package com.geekster.Employee.address.Irepo;

import com.geekster.Employee.address.Model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEmployeeRepo extends JpaRepository<Employee,Long> {
}
