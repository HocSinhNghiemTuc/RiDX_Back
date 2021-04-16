package com.hust.service.v1.asset;

import com.hust.entity.v1.asset.AssetCategoryEntity;
import com.hust.entity.v1.asset.EAssetCategory;
import com.hust.repository.v1.asset.AssetCategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AssetCategoryService implements IAssetCategory{

    @Autowired
    private AssetCategoryRepository assetCategoryRepository;

    @Override
    public List<AssetCategoryEntity> findAll() {
        return assetCategoryRepository.findAll();
    }

    @Override
    public Optional<AssetCategoryEntity> findByName(EAssetCategory name) {
        return assetCategoryRepository.findByName(name);
    }
}
