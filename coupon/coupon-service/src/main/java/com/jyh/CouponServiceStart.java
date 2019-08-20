package com.jyh;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author: jyh
 * @date: 2019/8/15
 * @description：
 */

@SpringBootApplication
@EnableDubbo
public class CouponServiceStart {

    public static void main(String[] args) {
        SpringApplication.run(CouponServiceStart.class, args);
    }

}
