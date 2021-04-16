package com.hust.entity.v1.asset;

import com.hust.entity.v1.BaseEntity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;


@Entity
@Table(name = "asset_category")
public class AssetCategoryEntity extends BaseEntity{
    @Column(nullable = false)
    private String name;

    @OneToMany(mappedBy = "assetCategory")
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
