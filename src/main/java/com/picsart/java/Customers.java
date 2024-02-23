package com.picsart.java;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "customers")
public class Customers {
    @Id
    @Column(name = "customer_id",nullable = false,unique = true)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long customerId;

    @Column(name = "name",nullable = false,length = 20)
    private String name;

    @Column(name = "email",unique = true,length = 60)
    private String email;

    @Column(name = "address",nullable = false,length = 100)
    private String address;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    public Customers() {

    }

    @PrePersist
    protected void onCreate(){
        createdAt = LocalDateTime.now();
    }

    //Constructor
    public Customers(String name, String email, String address) {
        this.name = name;
        this.email = email;
        this.address = address;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
}
