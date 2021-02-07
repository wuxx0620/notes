package com.wuxx.test.designmode.strategy;

/**
 * @Created by Wx
 * @Classname EmptyStrategy
 * @Description TODO
 * @Date 2021/2/1 13:36
 */
public class EmptyStrategy implements IPromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("原价购买，无优惠");
    }
}
