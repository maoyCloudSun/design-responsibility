package com.duncan.tool.design.rule_tree;

/**
 * 这个可以多个线程(多任务)完成以后再执行下一个节点
 * @param <P>
 * @param <D>
 * @param <R>
 */
public abstract class AbstractMultiThreadStrategyRouter<P,D,R> extends AbstractStrategyRouter<P,D,R>{

    @Override
    public R apply(P parameter, D dynamicContext) {
        this.multiThread(parameter, dynamicContext);
        return doApply(parameter, dynamicContext);
    }

    protected abstract void multiThread(P parameter, D dynamicContext);

    protected abstract R doApply(P parameter, D dynamicContext);
}
