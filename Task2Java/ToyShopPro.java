package Task2Java;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class ToyShopPro {
    private List<ToysPro> toys;

    public ToyShopPro(List<ToysPro> toys) {
        this.toys = toys;
    }
    
    public ToysPro getToy() {
        ToySelection random = new ToySelection();
        ToysPro toy = random.selectionByRate(toys);
        return toy;
    }

    public void toyRaffle() {
        ToysPro toy = getToy();
        String text = toy.toString();
        try(FileWriter writer = new FileWriter("Task2Java/Toys.txt", true))
        { 
            writer.write(text);
            writer.append('\n');
            writer.flush();
        }
        catch (IOException ex) {

            System.out.println(ex.getMessage());
        }
        toys.remove(toy);
    }
}
