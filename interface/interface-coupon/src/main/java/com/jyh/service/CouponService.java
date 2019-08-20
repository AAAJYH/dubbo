package com.jyh.service;

import java.util.List;
import java.util.Map;

/**
 * @author: jyh
 * @date: 2019/8/15
 * @description：
 */

public interface CouponService {

    /**
     * 查询优惠券
     * @return
     */
    List<Map<String, Object>> queryCoupon();

}
