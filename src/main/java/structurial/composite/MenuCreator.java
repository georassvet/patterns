package structurial.composite;

public class MenuCreator {
    Composite createMenu(){
        Composite menu  = new Node("Меню");
        Composite vegMenu = new Node("Вегетарианское меню");
        Composite desertMenu = new Node("Десертное меню");
        Composite beverageMenu = new Node("Напитки");

        menu.addChild(vegMenu);
        menu.addChild(desertMenu);
        menu.addChild(beverageMenu);

        vegMenu.addChild(new Leaf("Guasakaka", 25.00, true));
        desertMenu.addChild(new Leaf("Мороженое", 10.00, true));
        beverageMenu.addChild(new Leaf("Гранатовый сок", 15.00, true));

        return menu;
    }
}
