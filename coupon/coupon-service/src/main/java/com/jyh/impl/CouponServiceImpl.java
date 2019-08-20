package com.jyh.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.jyh.dao.CouponDao;
import com.jyh.service.CouponService;
import lombok.extern.log4j.Log4j;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import java.util.Map;

/**
 * @author: jyh
 * @date: 2019/8/15
 * @description：
 */

@Service
@Log4j
public class CouponServiceImpl implements CouponService {

    @Autowired
    CouponDao couponDao;

    /**
     * 查询优惠券
     * @return
     */
    @Override
    public List<Map<String, Object>> queryCoupon() {
        log.info("CouponServiceImpl queryCoupon 查询优惠券 info ...");
        log.debug("debug");
        log.warn("warn");
        log.error("error");
        return couponDao.queryCoupon();
    }

}
