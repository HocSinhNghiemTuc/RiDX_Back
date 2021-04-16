package com.hust.entity.v1.user;

import com.hust.entity.v1.BaseEntity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "role")
public class RoleEntity extends BaseEntity {

    @Enumerated(EnumType.STRING)
    @Column(length = 20)
    private ERole name;

    public RoleEntity(){

    }
    public RoleEntity(ERole name) {
        this.name = name;
    }


    public ERole getName() {
        return name;
    }

    public void setName(ERole name) {
        this.name = name;
    }

}
