package com.hust.entity;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Role extends BaseEntity{

    @Column
    private String roleName;
}
