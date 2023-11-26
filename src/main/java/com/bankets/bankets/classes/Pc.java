package com.bankets.bankets.classes;
public class Pc implements PcAction{
    private String name;
    private String cpu;
    private String gpu;
    private String ram;
    private String storage;

    public Pc(String name, String cpu, String gpu, String ram, String storage) {
        this.name = name;
        this.cpu = cpu;
        this.gpu = gpu;
        this.ram = ram;
        this.storage = storage;
    }

    public Pc() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getGpu() {
        return gpu;
    }

    public void setGpu(String gpu) {
        this.gpu = gpu;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getStorage() {
        return storage;
    }

    public void setStorage(String storage) {
        this.storage = storage;
    }

    @Override
    public void action() {
        System.out.println(
                "cpu = " + cpu + "\n" +
                "gpu = " + gpu + "\n" +
                "ram = " + ram + "\n" +
                "storage = " + storage + "\n");
    }
}
