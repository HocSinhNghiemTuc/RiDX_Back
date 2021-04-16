package com.hust.entity.v1.asset;

import com.hust.entity.v1.BaseEntity;
import com.hust.entity.v1.user.UserEntity;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;

@Entity
@EntityListeners(AuditingEntityListener.class)
@Table(name = "asset")
public class AssetEntity extends BaseEntity {

    @Column(nullable = false)
    private String name;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private AssetCategoryEntity category;

    @Column(updatable = false)
    @CreatedDate
    private Timestamp createdAt;

    @Column
    @LastModifiedDate
    private Timestamp updatedAt;

    @ManyToOne
    @JoinColumn(name = "created_by")
    @CreatedBy
    private UserEntity createdBy;

    @ManyToOne
    @JoinColumn(name = "updated_by")
    @LastModifiedBy
    private UserEntity updatedBy;


    @Column
    private float confidentiality;

    @Column
    private float integrity;

    @Column
    private float availability;


    public AssetEntity(String name,float confidentiality, float integrity, float availability){
        this.name = name;
        this.confidentiality = confidentiality;
        this.integrity = integrity;
        this.availability = availability;
    }

    public AssetEntity() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AssetCategoryEntity getAssetCategory() {
        return category;
    }

    public void setAssetCategory(AssetCategoryEntity category) {
        this.category = category;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    public Timestamp getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Timestamp updatedAt) {
        this.updatedAt = updatedAt;
    }

    public UserEntity getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(UserEntity createdBy) {
        this.createdBy = createdBy;
    }

    public UserEntity getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(UserEntity updatedBy) {
        this.updatedBy = updatedBy;
    }

    public float getConfidentiality() {
        return confidentiality;
    }

    public void setConfidentiality(float confidentiality) {
        this.confidentiality = confidentiality;
    }

    public float getIntegrity() {
        return integrity;
    }

    public void setIntegrity(float integrity) {
        this.integrity = integrity;
    }

    public float getAvailability() {
        return availability;
    }

    public void setAvailability(float availability) {
        this.availability = availability;
    }
}

