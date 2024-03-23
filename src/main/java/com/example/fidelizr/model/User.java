package com.example.fidelizr.model;

import jakarta.persistence.Entity;

import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.ToString;

@Data
@Entity
@ToString
@Table(name = "user")
public class User {

    @Id
    private String documentId;
    private String name;
    private String lastName;
    private String email;
    private String cellphone;
}
