package com.hust.service.v1.asset;

import com.hust.entity.v1.asset.AssetEntity;

public interface IAsset {
    AssetEntity create(AssetEntity assetEntity);
    void delete(long id);
}
