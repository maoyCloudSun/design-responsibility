package com.duncan.tool.design.rule_tree;

/**
 * 这个其实就已经完成了一个责任链，或者说单一向的规则树
 * @param <P>
 * @param <D>
 * @param <R>
 */
public abstract class AbstractStrategyRouter<P,D,R> implements StrategyHandler<P,D,R>,StrategyMapper<P,D>{

    protected StrategyHandler<P,D,R> defaultStrategyHandler = StrategyHandler.DEFAULT;

    /**
     * 这里面应该是要去实现流转的
     * 1.通过传参以及上下游去选择路由
     */
    protected R router(P requestParam, D dynamicContext) {
        StrategyHandler<P,D,R> strategyHandler = this.get(requestParam, dynamicContext);
        if (null != strategyHandler) return strategyHandler.apply(requestParam, dynamicContext);
        return defaultStrategyHandler.apply(requestParam, dynamicContext);
    }
}
