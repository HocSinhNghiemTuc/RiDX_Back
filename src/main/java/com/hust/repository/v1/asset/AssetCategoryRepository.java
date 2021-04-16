package com.hust.repository.v1.asset;

import com.hust.entity.v1.asset.AssetCategoryEntity;
import com.hust.entity.v1.asset.EAssetCategory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AssetCategoryRepository extends JpaRepository<AssetCategoryEntity, Long> {
    Optional<AssetCategoryEntity> findByName(EAssetCategory name);
}
