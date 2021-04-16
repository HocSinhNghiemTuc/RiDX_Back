package com.hust.payload.request;


import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.*;

@Validated
public class AssetRequest {
    @NotBlank(message = "Please provide a asset category")
    private String category;
    private float confidentiality;
    private float integrity;
    private float availability;
    @NotBlank(message = "Please provide a asset name")
    private String name;

    public AssetRequest(@NotBlank(message = "Please provide a asset category") String category, float confidentiality, float integrity, float availability, @NotBlank(message = "Please provide a asset name") String name) {
        this.category = category;
        this.confidentiality = confidentiality;
        this.integrity = integrity;
        this.availability = availability;
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
