package com.company.Lab4;

public class Lab4 {
//    public static void main(String[] args) {
//        CD cd = new CD("Disk");
//        CD.Component component = new CD.Component();
//
//        Element root = new Element("ROOT");
//        root.setType("Catalog");
//        Element first = new Element("first");
//        first.setType("Catalog");
//        Element second = new Element("second");
//        second.setType("Catalog");
//        Element track_1 = new Element("track_1");
//        track_1.setType("Track");
//        Element track_2 = new Element("track_2");
//        track_2.setType("Track");
//        Element track_3 = new Element("track_3");
//        track_3.setType("Track");
//
//        component.addCatalog(root);
//        component.addCatalog(first, root);
//        component.addCatalog(second, root);
//        component.addTrack(track_1, first);
//        component.addTrack(track_2, first);
//        component.addTrack(track_3, second);
//
//        System.out.println(component);
//
//    }


//    public static void main(String[] args){
//        Mobile mobile = new Mobile("iphone");
//        Mobile.Model model = new Mobile.Model("5s");
//
//        model.addParam("Память", "32гб");
//
//        System.out.println(model);
//
//    }

//    public static void main(String[] args){
//        Zaochnik zaochnik = new Zaochnik("Антон Владимирович Путов", "Заочник");
//        zaochnik.rateExam("Математика", "Отлично");
//        zaochnik.rateExam("Физика", "Хорошо");
//        zaochnik.rateExam("Программирование", "Хорошо");
//
//        System.out.println(zaochnik);
//    }



    public static void main(String[] args){
        Supervisor supervisor = new Supervisor("Антон", "Заправка", 34000, 12);
        supervisor.getInfo();
    }
}