package com.hust.api.v1.asset;

import com.hust.entity.v1.asset.AssetCategoryEntity;
import com.hust.service.v1.asset.AssetCategoryService;
import com.hust.service.v1.asset.IAssetCategory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/v1/test/asset_category")
public class AssetCategoryAPI {
    @Autowired
    private AssetCategoryService assetCategoryService;

    @GetMapping()
    public List<AssetCategoryEntity> getAll(){
        return assetCategoryService.findAll();
    }
}
