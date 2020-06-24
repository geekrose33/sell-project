package com.example.dataobject;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

/**
 * @author Joker_Dong
 * @date 2020-6-24 11:43
 */
// 订单的主表 dataobject 中的
// 类即是实体类 它是数据库的表字段---对应的类
// 写成JavaBean模式 所有属性都是私有的 系统默认提供getset方法


@Data
// 等同于getter+setter
@Entity
// 实体类

public class OrderMaster {
    /*
        订单Id
    */
    @Id
    private String orderID;

    /*
        买家名字
    */
    private String buyerName;

    /*
        商品名称
    */
    private String productName;
    /*
        商品价格
    */
    private BigDecimal productPrice;
    /*
        商品数量
    */
    private int productQuantity;
    /*
        商品Id
    */
    private String productID;

}
