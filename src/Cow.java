public class Cow {
    private String name;
    private double weight;
    private int age;
    private boolean gender;

    public Cow() {
        name = "";
        weight = 0.0;
        age = 0;
        gender = false;
    }

    public Cow(String a, double b, int c, boolean d) {
        name = a;
        weight = b;
        age = c;
        gender = d;
    }

    public void makeNoise() {
        System.out.println("MOO MOO MOO");
    }

    public void haveBirthday() {
        age++;
    }

    public void displayCow() {
        System.out.println("Name: "+ name);
        System.out.println("Weight: "+ weight);
        System.out.println("Age: "+ age);
        System.out.println("Gender: "+ gender);
    }
}
