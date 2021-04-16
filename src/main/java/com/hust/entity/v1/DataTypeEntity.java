package com.hust.entity.v1;

import javax.persistence.*;

@Entity
@Table(name = "data_type")
public class DataTypeEntity extends BaseEntity{
    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private EDataType name;
}
