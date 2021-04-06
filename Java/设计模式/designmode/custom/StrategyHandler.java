package com.wuxx.test.designmode.custom;

/**
 * @Created by Wx
 * @Classname StrategyHandler
 * @Description TODO
 * @Date 2021/2/2 15:18
 */
public interface StrategyHandler<T, R> {
    @SuppressWarnings("rawtypes")
    StrategyHandler DEFAULT = t -> null;

    /**
     * apply strategy
     *
     * @param param
     * @return
     */
    R apply(T param);
}
