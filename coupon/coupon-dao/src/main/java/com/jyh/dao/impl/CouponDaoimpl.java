package com.jyh.dao.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.jyh.dao.CouponDao;
import com.jyh.mapper.mysql.CouponMapper;
import lombok.extern.log4j.Log4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author: jyh
 * @date: 2019/8/15
 * @description：
 */

@Component
public class CouponDaoimpl implements CouponDao {

    @Autowired
    CouponMapper couponMapper;

    /**
     * 查询优惠券
     * @return
     */
    @Override
    public List<Map<String, Object>> queryCoupon() {
        List<Map<String, Object>> maps = new ArrayList<>();

        try{
            QueryWrapper wrapper = new QueryWrapper();
            maps = couponMapper.selectMaps(wrapper);
        }catch(Exception e) {
            e.printStackTrace();
        }

        return maps;
    }

}
