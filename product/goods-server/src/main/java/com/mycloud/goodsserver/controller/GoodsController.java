package com.mycloud.goodsserver.controller;

import com.mycloud.goodsapi.pojo.GoodsInfo;
import com.mycloud.goodsserver.service.GoodsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/goods")
public class GoodsController {

    @Resource
    private GoodsService goodsService;

    @GetMapping("/selectGoods")
    public GoodsInfo selectOne(String goodsCode){
        return goodsService.selectOne(goodsCode);
    }


}
