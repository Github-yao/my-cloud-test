package com.mycloud.goodsapi.feign;

import com.mycloud.goodsapi.pojo.GoodsInfo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "goods")
@RequestMapping("/goods")
public interface GoodsFeign {


    @GetMapping(value = "/selectGoods")
    GoodsInfo selectOne(@RequestParam(value = "goodsCode") String goodsCode);

}
