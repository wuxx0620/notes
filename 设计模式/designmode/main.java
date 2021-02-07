package com.wuxx.test.designmode;

import com.wuxx.test.designmode.simplefactory.PromotionStrategyFactory;
import com.wuxx.test.designmode.strategy.IPromotionStrategy;

/**
 * @Created by Wx
 * @Classname main
 * @Description TODO
 * @Date 2021/2/1 14:01
 */
public class main {
    public static void main(String[] args) {
        String promotionKey = "COUPON";
        PromotionStrategyFactory factory = new PromotionStrategyFactory();
        IPromotionStrategy strategy = factory.getPromotionStrategy(promotionKey);
        strategy.doPromotion();
    }
}
