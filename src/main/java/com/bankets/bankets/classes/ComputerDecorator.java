package com.bankets.bankets.classes;
public abstract class ComputerDecorator implements PcAction {
    protected PcAction pcAction;

    public ComputerDecorator (PcAction pcAction)
    {
        this.pcAction = pcAction;
    }

    @Override
    public void action() {
        pcAction.action();
    }
}
