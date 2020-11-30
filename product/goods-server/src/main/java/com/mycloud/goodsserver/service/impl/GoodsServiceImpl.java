package com.mycloud.goodsserver.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.mycloud.goodsapi.pojo.GoodsInfo;
import com.mycloud.goodsserver.dao.GoodsMapper;
import com.mycloud.goodsserver.service.GoodsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class GoodsServiceImpl extends ServiceImpl<GoodsMapper,GoodsInfo> implements GoodsService  {

    @Resource
    private GoodsMapper goodsMapper;

    @Override
    public GoodsInfo selectOne(String goodsCode) {
        return goodsMapper.selectOne(
                new LambdaQueryWrapper<GoodsInfo>()
                        .eq(GoodsInfo::getGoodsCode,goodsCode));
    }

}
