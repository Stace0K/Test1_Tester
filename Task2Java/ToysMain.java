package Task2Java;

import java.util.ArrayList;
import java.util.List;

public class ToysMain {
    public static void main(String[] args) {

        ToysPro toy1 = new ToysPro(0, "Железная дорога", 13.8);
        ToysPro toy2 = new ToysPro(1, "Вертолет радиоуправляемый", 43.9);
        ToysPro toy3 = new ToysPro(2, "Конструктор", 79.1);
        ToysPro toy4 = new ToysPro(3, "Набор юного археолога", 67.3);
        ToysPro toy5 = new ToysPro(4, "Спортивная кукла с гардеробом", 58.2);

        List<ToysPro> toys = new ArrayList<ToysPro>();
        toys.add(toy5);
        toys.add(toy4);
        toys.add(toy3);
        toys.add(toy2);
        toys.add(toy1);

        ToyShopPro toyShop = new ToyShopPro(toys);
        toyShop.toyRaffle();
        toyShop.toyRaffle();
        toyShop.toyRaffle();
        toyShop.toyRaffle();
        toyShop.toyRaffle();
    }
}
