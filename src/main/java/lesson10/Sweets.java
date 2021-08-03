package lesson10;

public class Sweets {
    int weight;
    static int count;


    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Sweets(int weight) {
              this.weight = weight;
              count++;
    }



}
