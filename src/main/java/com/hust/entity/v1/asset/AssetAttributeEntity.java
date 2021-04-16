package com.hust.entity.v1.asset;

import com.hust.entity.v1.BaseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "asset_attribute")
public class AssetAttributeEntity extends BaseEntity {
    @Column(nullable = false)
    private String name;

    @OneToMany(mappedBy = "assetAttribute")
    private Set<AssetCategoryAttributeEntity> assetCategoryAttribute;

    public Set<AssetCategoryAttributeEntity> getAssetCategoryAttribute() {
        return assetCategoryAttribute;
    }

    public void setAssetCategoryAttribute(Set<AssetCategoryAttributeEntity> assetCategoryAttribute) {
        this.assetCategoryAttribute = assetCategoryAttribute;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
