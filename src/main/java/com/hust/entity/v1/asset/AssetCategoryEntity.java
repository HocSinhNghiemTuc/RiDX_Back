package com.hust.entity.v1.asset;

import com.hust.entity.v1.BaseEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
@Table(name = "asset_category")
public class AssetCategoryEntity extends BaseEntity {

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private EAssetCategory name;

    public EAssetCategory getName() {
        return name;
    }

    public void setName(EAssetCategory name) {
        this.name = name;
    }
}
