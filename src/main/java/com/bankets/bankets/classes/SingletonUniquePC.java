package com.bankets.bankets.classes;
public class SingletonUniquePC {
    private static SingletonUniquePC instance;
    private String name;
    private String cpu;
    private String gpu;
    private String ram;
    private String storage;

    // Приватный конструктор, чтобы предотвратить создание экземпляров класса извне
    private SingletonUniquePC() {
    }

    // Метод getInstance(), который возвращает единственный экземпляр класса
    public static SingletonUniquePC getInstance() {
        if (instance == null) {
            // Если экземпляр еще не создан, создаем новый экземпляр
            instance = new SingletonUniquePC();
        }
        return instance;
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

    // Другие методы класса
    public void getinfo() {
        System.out.println("-----------------------------------------");
        System.out.println("Это единственный объект класса Singleton,\nтак как этот объект - уникальный ПК,\nкоторого не может быть больше одного");
        System.out.println("- - - - - - - - - - - - - - - - - - - - -");
        System.out.println("name = " + this.name);
        System.out.println("cpu = " + this.cpu);
        System.out.println("gpu = " + this.gpu);
        System.out.println("ram = " + this.ram);
        System.out.println("storage = " + this.storage);
        System.out.println("-----------------------------------------");
    }
}
