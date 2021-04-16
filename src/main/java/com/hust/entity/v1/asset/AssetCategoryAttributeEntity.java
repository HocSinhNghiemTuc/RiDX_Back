package com.hust.entity.v1.asset;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Lob;
import java.io.Serializable;

@Embeddable
public class AssetCategoryAttributeEntity implements Serializable {
    @Column
    private Long assetCategoryId;

    @Column
    private Long assetAttributeId;


}
