package com.geekster.Employee.address.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private String FirstName;
    private String LastName;

    @OneToOne
  @JoinColumn(name="fk_EmptId")
    private Address address;


}
