package com.hust.entity.v1.asset;

import com.hust.entity.v1.DataTypeEntity;
import com.hust.entity.v1.mapping.asset.DataType;

import javax.persistence.*;

@Entity
@Table(name = "asset_category_attribute")
public class AssetCategoryAttributeEntity {
    @EmbeddedId
    private AssetCategoryAttributeKey id;

    @ManyToOne
    @MapsId("assetCategoryId")
    @JoinColumn(name = "asset_category_id")
    private AssetCategoryEntity assetCategory;

    @ManyToOne
    @MapsId("assetAttributeId")
    @JoinColumn(name = "asset_attribute_id")
    private AssetAttributeEntity assetAttribute;

    @ManyToOne
    @JoinColumn(name = "data_type_id")
    private DataTypeEntity dataType;
}
