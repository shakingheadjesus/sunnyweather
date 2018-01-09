package com.shaking.sunnyweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by 悦 on 2018/1/9.
 * 市
 */

public class City extends DataSupport{
    //分别记录表中行号、城市名字、城市编号、城市所属的省的编号
    private int id;
    private String cityName;
    private int cityCode;
    private int provinceId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getCityCode() {
        return cityCode;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public int getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }

}
