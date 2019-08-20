package com.jyh.mapper.mysql;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.jyh.pojo.Coupon;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @author: jyh
 * @date: 2019/8/15
 * @description：
 */

@Repository
@Mapper
public interface CouponMapper extends BaseMapper<Coupon> {



}
