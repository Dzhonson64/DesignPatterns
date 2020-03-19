package com.company;

public class Main {

    public static void main(String[] args) {
        /* Создаём все объекты меня */
	    MenuComponent pancakeHouseMenu =
                new Menu ("PANCAKE HOUSE MENU", " Breakfast");
        MenuComponent dinnerMenu =
                    new Menu ("DINNER MENU", " Lunch");
        MenuComponent cafeMenu =
                    new Menu ("CAFE MENU", " Dinner");
        MenuComponent dessertMenu =
                    new Menu ("DESSERT MENU", " Dessert of course!");
        // Создаём меню верхнего уровня
        MenuComponent  allMenus = new Menu("ALL MENUS", "All menus combined");

        /* Включаем каждое меня в allMenus */
        allMenus.add(pancakeHouseMenu);
        allMenus.add(dinnerMenu);
        allMenus.add(cafeMenu);

        /* Добаляем в меню остальные элементы */
        dinnerMenu.add(
                new MenuItem(
                        "Pasta",
                        "Spaghetti with Marina Sause, and a slice of sourdough bread",
                        true,
                        3.89
                )
        );
        dessertMenu.add(dessertMenu); // Включаем в меню другое меню
        dessertMenu.add(
                new MenuItem(
                        "Apple Pie",
                        "Apple pie with a flakey crustm topped with vanilla icreaam",
                        true,
                        1.59
                )
        );

        Waitress waitress = new Waitress(allMenus);
        waitress.printMenu();
    }
}
