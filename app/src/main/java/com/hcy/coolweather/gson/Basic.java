package com.hcy.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by huangchunyu on 2018/8/15.
 */

public class Basic {

    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update {

        @SerializedName("loc")
//        public String updateTime;
        public String updateTime;
    }
}
