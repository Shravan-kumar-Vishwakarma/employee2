package com.geekster.Employee.address.Controller;

import com.geekster.Employee.address.Model.Address;
import com.geekster.Employee.address.Service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class AddressController {
    @Autowired
    AddressService addressService;
    @PostMapping("posts")
public String addAddress(@RequestBody Address newAddress){
    return addressService.addAddress(newAddress);
}
@GetMapping("gets")
public List<Address> getAllUser(){
        return addressService.getAllUser();
}
@GetMapping("get/Address/id")
public Optional<Address>getDataId(@RequestParam Long id){
        return addressService.getDataId(id);
}
@PutMapping("update/Id/newId")
public String updateId(@RequestParam Long id,@RequestParam String City){
        return addressService.updateId(id,City);
}
@DeleteMapping("Delete/id")
    public String DeleteId(@RequestParam Long id){
        return addressService.DeleteId(id);
    }
}
