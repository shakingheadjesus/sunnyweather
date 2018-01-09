package com.shaking.sunnyweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by 悦 on 2018/1/9.
 * 县/区
 */

public class County extends DataSupport{
    //分别表示表中行号、县名字、天气编号、县所属的城市编号
    private int id;
    private String countyName;
    private int weatherId;
    private int cityId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public int getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(int weatherId) {
        this.weatherId = weatherId;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }


}
