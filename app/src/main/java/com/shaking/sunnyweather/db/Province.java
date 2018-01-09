package com.shaking.sunnyweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by 悦 on 2018/1/9.
 * 省
 */

public class Province extends DataSupport{
    //id对应表中的行号，provinceName记录省的名字，provinceCode记录省的编号
    private int id;
    private String provinceName;
    private int provinceCode;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }

}
