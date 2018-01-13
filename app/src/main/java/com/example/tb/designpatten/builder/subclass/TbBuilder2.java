package com.example.tb.designpatten.builder.subclass;

import com.example.tb.designpatten.builder.base.Builder;
import com.example.tb.designpatten.builder.base.Builder2;
import com.example.tb.designpatten.builder.base.House;

/**
 * Created by TianBin on 2018/1/13 17:42.
 * Description :构造我的房子的Builder
 */

public class TbBuilder2 extends Builder2 {
    private TbHouse tbHouse=new TbHouse();
    @Override
    public TbBuilder2 setHost() {
        tbHouse.setHost();
        return this;
    }

    @Override
    public TbBuilder2 setHouseNum(int houseNum) {
        tbHouse.setHouseNum(houseNum);
        return this;
    }

    @Override
    public TbBuilder2 setStyle(String style) {
        tbHouse.setStyle(style);
        return this;
    }

    @Override
    public TbBuilder2 setAddress(String address) {
        tbHouse.setAddress(address);
        return this;
    }

    @Override
    public House create() {
        return tbHouse;
    }
}
