package com.firstProgram.crud.Entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor

@Table(schema = "employee")
public class Employee {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    Long id;

    @Column(name="first-name")
    String firstName;

    @Column(name="last-name")
    String lastName;

    @Column(name="email-id",unique = true,nullable = false)
    String emailId;

}
