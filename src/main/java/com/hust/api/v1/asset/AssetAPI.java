package com.hust.api.v1.asset;

import com.hust.entity.v1.asset.AssetCategoryEntity;
import com.hust.entity.v1.asset.AssetEntity;
import com.hust.entity.v1.asset.EAssetCategory;
import com.hust.payload.request.AssetRequest;
import com.hust.payload.responce.MessageResponse;
import com.hust.service.v1.asset.AssetCategoryService;
import com.hust.service.v1.asset.AssetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/v1/asset")
public class AssetAPI {
    @Autowired
    private AssetService assetService;

    @Autowired
    private AssetCategoryService assetCategoryService;

    @PostMapping()
    public ResponseEntity<?> create(@Valid @RequestBody AssetRequest assetRequest){
        AssetEntity assetEntity = new AssetEntity();
        assetEntity.setName(assetRequest.getName());
        assetEntity.setConfidentiality(assetRequest.getConfidentiality());
        assetEntity.setIntegrity(assetRequest.getIntegrity());
        assetEntity.setAvailability(assetRequest.getIntegrity());
        AssetCategoryEntity assetCategoryEntity = new AssetCategoryEntity();
        switch (assetRequest.getCategory()){
            case "NETWORK":
                assetCategoryEntity = assetCategoryService.findByName(EAssetCategory.NETWORK)
                        .orElseThrow(() -> new RuntimeException("Entity AssetCategory: "+EAssetCategory.NETWORK +" doesn't exist"));
                break;
            case "APPLICATION":
                assetCategoryEntity = assetCategoryService.findByName(EAssetCategory.APPLICATION)
                        .orElseThrow(() -> new RuntimeException("Entity AssetCategory: "+EAssetCategory.APPLICATION +" doesn't exist"));
                break;
            case "DATA":
                assetCategoryEntity = assetCategoryService.findByName(EAssetCategory.DATA)
                        .orElseThrow(() -> new RuntimeException("Entity AssetCategory: "+EAssetCategory.DATA +" doesn't exist"));
                break;
            case "SERVER":
                assetCategoryEntity = assetCategoryService.findByName(EAssetCategory.SERVER)
                        .orElseThrow(() -> new RuntimeException("Entity AssetCategory: "+EAssetCategory.SERVER +" doesn't exist"));
                break;
            default:
                return ResponseEntity.badRequest().body(new MessageResponse("Asset category '" + assetRequest.getCategory() + "' not found"));
        }
        assetEntity.setAssetCategory(assetCategoryEntity);
        return ResponseEntity.ok(assetService.create(assetEntity));
    }
}
