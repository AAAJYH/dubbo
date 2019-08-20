package com.jyh.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author: jyh
 * @date: 2019/8/15
 * @description：
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("coupon")
public class Coupon {

    @TableId(type = IdType.AUTO)
    private int id;

    /**
     * 优惠券名称
     */
    private String couponName;

}
