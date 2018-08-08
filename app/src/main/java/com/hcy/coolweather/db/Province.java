package com.hcy.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by huangchunyu on 2018/8/8.
 */

public class Province extends DataSupport {

    private int id;//主键

    private String provinceName;//记录省的名字

    private int provinceCode;//记录省的代码

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
