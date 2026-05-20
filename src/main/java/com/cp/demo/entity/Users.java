package com.cp.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jdk.jfr.Enabled;

@Entity
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name ;


    public Users(){}

    public Users(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public Long getId(){
        return id;
    }


}
