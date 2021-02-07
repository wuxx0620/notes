package com.wuxx.test.designmode.strategy;

/**
 * @Created by Wx
 * @Classname CashRollbackStrategy
 * @Description 返现促销
 * @Date 2021/2/1 13:31
 */
public class CashRollbackStrategy implements IPromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("返现，直接打款到支付宝帐号");
    }
}
