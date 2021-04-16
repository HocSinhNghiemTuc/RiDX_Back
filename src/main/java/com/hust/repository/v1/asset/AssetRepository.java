package com.hust.repository.v1.asset;

import com.hust.entity.v1.asset.AssetEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AssetRepository extends JpaRepository<AssetEntity,Long> {

}
