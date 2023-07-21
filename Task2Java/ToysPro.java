package Task2Java;

public class ToysPro {
    int ID;
    String name;
    double weight;

    public ToysPro(int ID, String name, double weight) {
        this.ID = ID;
        this.name = name;
        this.weight = weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Toy [id=" + ID + ", name=" + name + ", weight=" + weight + "]";
    }
}
