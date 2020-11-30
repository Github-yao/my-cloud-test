package com.mycloud.connectiontest.controller;

import com.mycloud.goodsapi.feign.GoodsFeign;
import com.mycloud.goodsapi.pojo.GoodsInfo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/sout")
public class TestController {

    @Resource
    private GoodsFeign goodsFeign;

    @GetMapping("/select")
    public GoodsInfo select(String goodsCode){
        GoodsInfo goodsInfo = goodsFeign.selectOne(goodsCode);
        return goodsInfo;
    }


}
