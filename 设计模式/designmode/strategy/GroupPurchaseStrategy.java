package com.wuxx.test.designmode.strategy;

/**
 * @Created by Wx
 * @Classname GroupPurchaseStrategy
 * @Description 团购促销
 * @Date 2021/2/1 13:28
 */
public class GroupPurchaseStrategy implements IPromotionStrategy {

    @Override
    public void doPromotion() {
        System.out.println("5人成团，可以优惠");
    }
}
