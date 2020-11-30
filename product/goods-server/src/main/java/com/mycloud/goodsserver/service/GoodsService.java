package com.mycloud.goodsserver.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.mycloud.goodsapi.pojo.GoodsInfo;

public interface GoodsService extends IService<GoodsInfo>  {
    GoodsInfo selectOne(String goodsCode);
}
