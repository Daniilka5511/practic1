public class DogTest {
    public static void main(String[] args) {
        Dog d1 = new Dog(11, "nhc", "buldog", 12);
        Dog d2 = new Dog(5, "Afa", "debil", 12);
        Dog d3 = new Dog(15, "awr", "kek", 12);
        d3.setYear(1);
        System.out.println(d1);
        d1.intoHumanAge();
        d2.intoHumanAge();
        d3.intoHumanAge();
    }
}
