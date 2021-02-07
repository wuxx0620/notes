package com.wuxx.test.designmode.simplefactory;

import com.wuxx.test.designmode.strategy.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @Created by Wx
 * @Classname PromotionStrategyFactory
 * @Description 上下文对象创建工厂 简单工厂模式  优点：使用简单 但扩展性仍然不够好 对工厂中的产品都是硬编码
 * @Date 2021/2/1 11:33
 */
public class PromotionStrategyFactory {
    private static Map<String, IPromotionStrategy> promotionStrategyMap = new HashMap<>();

    private static final IPromotionStrategy EMPTY = new EmptyStrategy();


    static {
        promotionStrategyMap.put(PromotionKey.COUPON, new CouponStrategy());
        promotionStrategyMap.put(PromotionKey.CASH_ROLLBACK, new CashRollbackStrategy());
        promotionStrategyMap.put(PromotionKey.GROUP_PURCHASE, new GroupPurchaseStrategy());
    }

    public PromotionStrategyFactory() {
    }

    public static IPromotionStrategy getPromotionStrategy(String PromotionKey) {
        IPromotionStrategy strategy = promotionStrategyMap.get(PromotionKey);
        return strategy == null ? EMPTY : strategy;
    }

    private interface PromotionKey {
        String COUPON = "COUPON";
        String CASH_ROLLBACK = "CASH_ROLLBACK";
        String GROUP_PURCHASE = "GROUP_PURCHASE";
    }

    public Set<String> getPromotionKeys() {
        return promotionStrategyMap.keySet();
    }
}
