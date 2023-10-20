package com.geekster.Employee.address.Irepo;

import com.geekster.Employee.address.Model.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAddressRepo extends JpaRepository<Address,Long> {

}
