package com.bankets.bankets.classes;
 class WorkstationPcDecorator extends ComputerDecorator{

    public WorkstationPcDecorator(PcAction pcAction) {
        super(pcAction);
    }

    @Override
    public void action() {
        super.action();
        System.out.println("Это рабочая станция/сервер для\nсложных вычислительных задач");
    }

}
