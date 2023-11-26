package com.bankets.bankets.classes;
public class GamingPcDecorator extends ComputerDecorator {

    public GamingPcDecorator(PcAction pcAction) {
        super(pcAction);
    }

    @Override
    public void action() {
        super.action();
        System.out.println("Это игровой ПК для сложных 3D AAA проектов\n");
    }
}
