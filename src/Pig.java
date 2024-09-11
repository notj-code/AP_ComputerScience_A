public class Pig {
    private String color;
    private int penSize;
    private boolean didWallowed;
    private double weight;

    public Pig() {
        color = "black";
        penSize = 8;
        didWallowed = true;
        weight = 500.0;
    }

    public Pig(String a, int b, boolean c, double d) {
        color = a;
        penSize = b;
        didWallowed = c;
        weight = d;
    }

    public void makeNoise() {
        System.out.println("OINK OINK OINK");
    }

    public void upgradePenSize(int a) {
        penSize+=a;
    }

    public void displayPig() {
        System.out.println("Color: "+color);
        System.out.println("Pen Size: "+penSize);
        System.out.println("Color: "+ didWallowed);
        System.out.println("Color: "+ weight);
    }
}
