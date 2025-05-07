package com.example.demo.entity;
import javax.persistence.*;

@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String position;
    
    @ManyToOne
    @JoinColumn(name = "department_id")
    private Department department;
    
    // Getters, Setters, Constructors
}