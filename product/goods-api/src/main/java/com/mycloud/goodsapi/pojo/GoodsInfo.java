package com.mycloud.goodsapi.pojo;

import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Data
public class GoodsInfo implements Serializable {

    //    @TableId(type = IdType.INPUT)
    private Long id;

    /**
     * 商品编号
     */
    @NotBlank(message = "商品编号不能为空")
    @Length(max = 50, message = "商品编码超长")
    private String goodsCode;

    /**
     * 商品名称
     */
    @NotBlank(message = "商品名称不能为空")
    @Length(max = 50, message = "商品名称超长")
    private String goodsName;

    /**
     * 商品主条码
     */
    @Length(max = 50, message = "商品条码超长")
    private String goodsBarcode;

    /**
     * 品牌
     */
    @Length(max = 50, message = "品牌名称超长")
    private String brandCode;

    /**
     * 商品简称
     */
    @Length(max = 50, message = "商品简称超长")
    private String goodsShort;

    /**
     * 分类编号
     */
    @NotBlank(message = "分类不能为空")
    private String categoryCode;

    /**
     * 商品单位
     */
    private String goodsUnit;

    /**
     * 商品规格
     */
    @Length(max = 50, message = "商品规格超长")
    private String specify;

    /**
     * 保质天数
     */
    private Integer shelfLife;

    /**
     * 储存条件
     */
    @Length(max = 50, message = "储存条件")
    private String storage;

    /**
     * 建议零售价
     */
    private BigDecimal defaultPrice;

    /**
     * 商品描述
     */
    private String goodsDesc;

    /**
     * 备注
     */
    private String goodsNote;

    /**
     * 商品种类
     */
    private Integer category;

    /**
     * 产地
     */
    private String address;

    /**
     * 国家
     */
    private String country;

    /**
     * 操作人
     */
    private String operator;

    /**
     * 创建时间
     */
    private Date createDate;

    /**
     * 修改时间
     */
    private Date updateDate;
//
//    /**
//     * 商品条码集合
//     */
//    @TableField(exist = false)
//    private List<GoodsBarcode> goodsBarcodeList;
//
//    /**
//     * 组合商品集合
//     */
//    @TableField(exist = false)
//    private List<GoodsComb> goodsCombList;
//
//    /**
//     * 商品分类名称
//     */
//    @TableField(exist = false)
//    private String categoryName;

}
