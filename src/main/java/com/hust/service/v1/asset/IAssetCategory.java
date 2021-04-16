package com.hust.service.v1.asset;

import com.hust.entity.v1.asset.AssetCategoryEntity;
import com.hust.entity.v1.asset.EAssetCategory;

import java.util.List;
import java.util.Optional;

public interface IAssetCategory {
    List<AssetCategoryEntity> findAll();
    Optional<AssetCategoryEntity> findByName(EAssetCategory name);
}
