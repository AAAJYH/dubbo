package com.jyh.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.jyh.service.CouponService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * @author: jyh
 * @date: 2019/8/15
 * @description：
 */

@RestController
@RequestMapping("CouponController/")
public class CouponController {

    @Reference
    CouponService couponService;

    /**
     * 查询优惠券
     * @return
     */
    @RequestMapping("queryCoupon")
    public List<Map<String, Object>> queryCoupon() {
        return couponService.queryCoupon();
    }


}
