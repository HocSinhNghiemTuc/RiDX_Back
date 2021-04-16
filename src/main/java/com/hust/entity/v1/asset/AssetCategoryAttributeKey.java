package com.hust.entity.v1.asset;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class AssetCategoryAttributeKey implements Serializable {
    @Column
    private Long assetCategoryId;

    @Column
    private Long assetAttributeId;

    public Long getAssetCategoryId() {
        return assetCategoryId;
    }

    public void setAssetCategoryId(Long assetCategoryId) {
        this.assetCategoryId = assetCategoryId;
    }

    public Long getAssetAttributeId() {
        return assetAttributeId;
    }

    public void setAssetAttributeId(Long assetAttributeId) {
        this.assetAttributeId = assetAttributeId;
    }
}
