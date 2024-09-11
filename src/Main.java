public class Main {
    public static void main(String[] args) {
        Cow franny = new Cow();
        Cow gretta = new Cow("Gretta", 100, 1, false);
        Chicken clucky =  new Chicken();
        Chicken marshmallow = new Chicken("Sussex", 2, false, 83.5);

        Pig piglet = new Pig();
        Pig pickles = new Pig("Yellow", 10, true, 567.88);

        franny.makeNoise();
        clucky.makeNoise(); // CHICKEN
        pickles.makeNoise(); //PIG
        gretta.haveBirthday(); //COW
        marshmallow.eatFood(10);
        piglet.upgradePenSize(3);

        gretta.displayCow();
        System.out.println("");
        marshmallow.displayChicken();
        System.out.println("");
        piglet.displayPig();
    }
}