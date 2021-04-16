package com.hust.entity.v1.asset;

import com.hust.entity.v1.BaseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "asset_attribute")
public class AssetAttributeEntity extends BaseEntity {
    @Column(nullable = false)
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
