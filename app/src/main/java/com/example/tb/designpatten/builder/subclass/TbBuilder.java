package com.example.tb.designpatten.builder.subclass;

import com.example.tb.designpatten.builder.base.Builder;
import com.example.tb.designpatten.builder.base.House;

/**
 * Created by TianBin on 2018/1/13 17:42.
 * Description :构造我的房子的Builder
 */

public class TbBuilder extends Builder {
    private TbHouse tbHouse=new TbHouse();
    @Override
    public void setHost() {
        tbHouse.setHost();
    }

    @Override
    public void setHouseNum(int houseNum) {
        tbHouse.setHouseNum(houseNum);
    }

    @Override
    public void setStyle(String style) {
        tbHouse.setStyle(style);
    }

    @Override
    public void setAddress(String address) {
        tbHouse.setAddress(address);
    }

    @Override
    public House create() {
        return tbHouse;
    }
}
