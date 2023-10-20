package com.geekster.Employee.address.Service;

import com.geekster.Employee.address.Irepo.IAddressRepo;
import com.geekster.Employee.address.Model.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Optional;

@Service
public class AddressService {
    @Autowired
    IAddressRepo iAddressRepo;

    public String addAddress(Address newAddress) {
        iAddressRepo.save(newAddress);
        return "Address added";
    }

    public List<Address> getAllUser() {
        return iAddressRepo.findAll();
    }

    public Optional<Address> getDataId(Long id) {
        return iAddressRepo.findById(id);
    }

    public String updateId(Long id, String City) {
    Address address=iAddressRepo.findById(id).orElse(null);
    if(address!=null){
        //address newAddress = new address();
        address.setCity(City);
        iAddressRepo.save(address);
        return "UPDATE ID Successfully";
    }
    return "NOT UPDATE ID";
    }

    public String DeleteId(Long id) {
        iAddressRepo.deleteById(id);
        return "Delete Successfully Id";
    }
}
