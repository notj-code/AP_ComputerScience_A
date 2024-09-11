
public class Chicken {
    private String breed;
    int eggNum;
    boolean isMean;
    double weight;

    public Chicken() {
        breed = "";
        eggNum = 0;
        isMean = false;
        weight = 0.0;
    }

    public Chicken(String a, int b, boolean c, double d) {
        breed = a;
        eggNum = b;
        isMean = c;
        weight = d;
    }

    public void makeNoise() {
        System.out.println("CLUCK CLUCK CLUCK");
    }

    public void eatFood (int a) {
        weight += a;
    }

    public void displayChicken () {
        System.out.println("Breed: " + breed);
        System.out.println("Eggs Per Day: " + eggNum);
        System.out.println("Rude: " + isMean);
        System.out.println("Weight: " + weight);
    }
}
