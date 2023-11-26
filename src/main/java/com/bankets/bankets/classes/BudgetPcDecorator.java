package com.bankets.bankets.classes;
public class BudgetPcDecorator extends ComputerDecorator{
    public BudgetPcDecorator(PcAction pcAction) {
        super(pcAction);
    }

    @Override
    public void action() {
        super.action();
        System.out.println("Это бюджетный ПК для нетребовательных игр,\nпросмотра фильмов, и сёрфинга в интернете");
    }
}
