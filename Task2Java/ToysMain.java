package Task2Java;

import java.util.ArrayList;
import java.util.List;

public class ToysMain {
    public static void main(String[] args) {

        ToysPro toy1 = new ToysPro(0, "Железная дорога", 5900);
        ToysPro toy2 = new ToysPro(1, "Вертолет радиоуправляемый", 400);
        ToysPro toy3 = new ToysPro(2, "Конструктор", 2600);
        ToysPro toy4 = new ToysPro(3, "Набор юного археолога", 810);
        ToysPro toy5 = new ToysPro(4, "Спортивная кукла с гардеробом", 520);

        List<ToysPro> toys = new ArrayList<ToysPro>();
        toys.add(toy5);
        toys.add(toy4);
        toys.add(toy3);
        toys.add(toy2);
        toys.add(toy1);
    }
}
