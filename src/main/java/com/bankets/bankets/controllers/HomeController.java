package com.bankets.bankets.controllers;

import com.bankets.bankets.classes.Pc;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.util.ArrayList;
import java.util.List;

@Controller
public class HomeController {
    @GetMapping("/registr/{login}/{password}")
    public String home(Model model) {

        ArrayList<Pc> gamePCList = new ArrayList<>();
        ArrayList<Pc> workPcList = new ArrayList<>();
        ArrayList<Pc> budgetPcList = new ArrayList<>();
        ArrayList<Pc> uniquePcList = new ArrayList<>();

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

                if(name.equals("Gaming Build")) {
                    gamePCList.add(new Pc(name,cpu,gpu,ram,storage));
                }
                if(name.equals("Workstation Build")) {
                    workPcList.add(new Pc(name,cpu,gpu,ram,storage));
                }
                if(name.equals("Budget Build")) {
                    budgetPcList.add(new Pc(name,cpu,gpu,ram,storage));
                }
                if(name.equals("Unique Build")) {
                    uniquePcList.add(new Pc(name,cpu,gpu,ram,storage));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        model.addAttribute("gamePCList", gamePCList.size());
        model.addAttribute("workPcList", workPcList.size());
        model.addAttribute("budgetPcList", budgetPcList.size());
        model.addAttribute("uniquePcList", uniquePcList.size());
            return "home";
    }
}
