package com.example.lawtech.coolweather.model;

/**
 * Created by lawtech on 16/8/26.
 */
public class District {
    private int id;
    private String districtName;
    private int cityId;

    public String getDistrictName() {
        return districtName;
    }

    public int getId() {
        return id;
    }

    public int getCityId() {
        return cityId;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDistrictName(String districtName) {
        this.districtName = districtName;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }
}
