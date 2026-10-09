package com.duncan.tool.design.rule_tree;

/**
 * 执行器的策略模式
 */
public interface StrategyHandler<P,D,R> {
    StrategyHandler DEFAULT = (P, D) -> null;

    R apply(P parameter, D dynamicContext);
}
