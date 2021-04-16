package com.hust.service.v1.asset;

import com.hust.entity.v1.asset.AssetCategoryEntity;
import com.hust.entity.v1.asset.AssetEntity;
import com.hust.repository.v1.asset.AssetCategoryRepository;
import com.hust.repository.v1.asset.AssetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AssetService implements IAsset{
    @Autowired
    private AssetRepository assetRepository;

    @Autowired
    private AssetCategoryRepository assetCategoryRepository;

    @Override
    public AssetEntity create(AssetEntity assetEntity) {
        return assetRepository.save(assetEntity);
    }

    @Override
    public void delete(long id) {

    }
}
