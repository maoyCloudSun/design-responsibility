package com.duncan.tool.design.rule_tree;

/**
 * 获取器的策略模式
 */
public interface StrategyMapper<R,D> {

    StrategyHandler get(R requestParam, D dynamicContext);
}
