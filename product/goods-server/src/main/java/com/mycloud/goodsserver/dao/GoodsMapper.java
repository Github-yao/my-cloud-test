package com.mycloud.goodsserver.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.mycloud.goodsapi.pojo.GoodsInfo;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface GoodsMapper extends BaseMapper<GoodsInfo>{
}
