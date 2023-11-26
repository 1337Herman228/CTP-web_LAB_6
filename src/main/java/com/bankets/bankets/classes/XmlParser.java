
package com.bankets.bankets.classes;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import java.util.Scanner;

public class XmlParser {

    private int a;

    public XmlParser() {
    }

    public void uniquePc()
    {
        try {
            // Создание построителя документа
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();

            Document document = builder.parse("pcBuilds.xml");

            NodeList buildList = document.getElementsByTagName("build");
            SingletonUniquePC uniquePC = SingletonUniquePC.getInstance();

            for (int i = 0; i < buildList.getLength(); i++) {
                Element build = (Element) buildList.item(i);
                if (build.getElementsByTagName("name").item(0).getTextContent().equals("Unique Build")) {
                    uniquePC.setName(build.getElementsByTagName("name").item(0).getTextContent());
                    uniquePC.setCpu(build.getElementsByTagName("cpu").item(0).getTextContent());
                    uniquePC.setGpu(build.getElementsByTagName("gpu").item(0).getTextContent());
                    uniquePC.setRam(build.getElementsByTagName("ram").item(0).getTextContent());
                    uniquePC.setStorage(build.getElementsByTagName("storage").item(0).getTextContent());
                    i = buildList.getLength();
                }
            }
            uniquePC.getinfo();

    } catch (Exception e) {
        e.printStackTrace();
    }
    }

    public void allPc()
    {
        try {
            // Создание построителя документа
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();

            Document document = builder.parse("pcBuilds.xml");

            NodeList buildList = document.getElementsByTagName("build");

            for (int i = 0; i < buildList.getLength(); i++) {
                Element build = (Element) buildList.item(i);

                String name = build.getElementsByTagName("name").item(0).getTextContent();
                String cpu = build.getElementsByTagName("cpu").item(0).getTextContent();
                String gpu = build.getElementsByTagName("gpu").item(0).getTextContent();
                String ram = build.getElementsByTagName("ram").item(0).getTextContent();
                String storage = build.getElementsByTagName("storage").item(0).getTextContent();

                System.out.println("----------------------------------------");
                System.out.println("Build Name: " + name);
                System.out.println("CPU: " + cpu);
                System.out.println("GPU: " + gpu);
                System.out.println("RAM: " + ram);
                System.out.println("Storage: " + storage);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void gamePc()
    {
        try {
            // Создание построителя документа
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();

            Document document = builder.parse("pcBuilds.xml");

            NodeList buildList = document.getElementsByTagName("build");
            SingletonUniquePC uniquePC = SingletonUniquePC.getInstance();

            for (int i = 0; i < buildList.getLength(); i++) {
                Element build = (Element) buildList.item(i);

                String name = build.getElementsByTagName("name").item(0).getTextContent();
                String cpu = build.getElementsByTagName("cpu").item(0).getTextContent();
                String gpu = build.getElementsByTagName("gpu").item(0).getTextContent();
                String ram = build.getElementsByTagName("ram").item(0).getTextContent();
                String storage = build.getElementsByTagName("storage").item(0).getTextContent();

                PcAction computer = new Pc(name,cpu,gpu,ram,storage);

                if(name.equals("Gaming Build")){
                    PcAction decoratedComputer = new GamingPcDecorator(computer);
                    decoratedComputer.action();
                    System.out.println("-----------------------------------------");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void budgetPc()
    {
        try {
            // Создание построителя документа
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();

            Document document = builder.parse("pcBuilds.xml");

            NodeList buildList = document.getElementsByTagName("build");
            SingletonUniquePC uniquePC = SingletonUniquePC.getInstance();

            for (int i = 0; i < buildList.getLength(); i++) {
                Element build = (Element) buildList.item(i);

                String name = build.getElementsByTagName("name").item(0).getTextContent();
                String cpu = build.getElementsByTagName("cpu").item(0).getTextContent();
                String gpu = build.getElementsByTagName("gpu").item(0).getTextContent();
                String ram = build.getElementsByTagName("ram").item(0).getTextContent();
                String storage = build.getElementsByTagName("storage").item(0).getTextContent();

                PcAction computer = new Pc(name,cpu,gpu,ram,storage);

                if(name.equals("Budget Build")){
                    PcAction decoratedComputer = new BudgetPcDecorator(computer);
                    decoratedComputer.action();
                    System.out.println("-----------------------------------------");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void workPc()
    {
        try {
            // Создание построителя документа
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();

            Document document = builder.parse("pcBuilds.xml");

            NodeList buildList = document.getElementsByTagName("build");
            SingletonUniquePC uniquePC = SingletonUniquePC.getInstance();

            for (int i = 0; i < buildList.getLength(); i++) {
                Element build = (Element) buildList.item(i);

                String name = build.getElementsByTagName("name").item(0).getTextContent();
                String cpu = build.getElementsByTagName("cpu").item(0).getTextContent();
                String gpu = build.getElementsByTagName("gpu").item(0).getTextContent();
                String ram = build.getElementsByTagName("ram").item(0).getTextContent();
                String storage = build.getElementsByTagName("storage").item(0).getTextContent();

                PcAction computer = new Pc(name,cpu,gpu,ram,storage);

                if(name.equals("Workstation Build")){
                    PcAction decoratedComputer = new WorkstationPcDecorator(computer);
                    decoratedComputer.action();
                    System.out.println("-----------------------------------------");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void statistic()
    {
        try {
            // Создание построителя документа
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();

            Document document = builder.parse("pcBuilds.xml");

            NodeList buildList = document.getElementsByTagName("build");
            SingletonUniquePC uniquePC = SingletonUniquePC.getInstance();

            int gamePcCount = 0;
            int workPcCount = 0;
            int budgetPcCount = 0;

            for (int i = 0; i < buildList.getLength(); i++) {
                Element build = (Element) buildList.item(i);
                String name = build.getElementsByTagName("name").item(0).getTextContent();

                if(name.equals("Gaming Build")) gamePcCount++;
                if(name.equals("Workstation Build")) workPcCount++;
                if(name.equals("Budget Build")) budgetPcCount++;

            }
            System.out.println("Игровых пк: " + gamePcCount);
            System.out.println("Рабочих пк: " + workPcCount);
            System.out.println("Бюджетных пк: " + budgetPcCount);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

//    public static void main(String[] args) {
//                while(true)
//                {
//                    System.out.println("--------------------------------");
//                    System.out.println("1) Вывести все сборки");
//                    System.out.println("2) Вывести уникальные сборки");
//                    System.out.println("3) Вывести игровые сборки");
//                    System.out.println("4) Вывести бюджетные сборки");
//                    System.out.println("5) Вывести рабочие сборки");
//                    System.out.println("6) Статистика");
//                    System.out.println("7) Выход");
//                    Scanner sc = new Scanner(System.in);
//                    switch (sc.nextInt())
//                    {
//                        case 1:
//                        {
//                            XmlParser.allPc();
//                            break;
//                        }
//                        case 2:
//                        {
//                            XmlParser.uniquePc();
//                            break;
//                        }
//                        case 3:
//                        {
//                            XmlParser.gamePc();
//                            break;
//                        }
//                        case 4:
//                        {
//                            XmlParser.budgetPc();
//                            break;
//                        }
//                        case 5:
//                        {
//                            XmlParser.workPc();
//                            break;
//                        }
//                        case 6:
//                        {
//                            XmlParser.statistic();
//                            break;
//                        }
//                        case 7:
//                        {
//                            return;
//                        }
//                        default:
//                        {
//                            System.out.println("Неверное значение!");
//                            break;
//                        }
//                    }
//
//                }
//
//            }

    }

