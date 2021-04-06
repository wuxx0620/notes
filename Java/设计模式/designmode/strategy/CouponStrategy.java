package com.wuxx.test.designmode.strategy;

/**
 * @Created by Wx
 * @Classname CouponStrategy
 * @Description 优惠券促销方式
 * @Date 2021/2/1 13:34
 */
public class CouponStrategy implements IPromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("使用优惠券抵扣");
    }
}
