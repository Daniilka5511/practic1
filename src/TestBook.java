public class TestBook {
    public static void main(String[] args) {
        Book d1 = new Book(2013, "Prikl", "Rik", 85747);
        Book d2 = new Book(2012, "Twikle", "Morty", 64523);
        Book d3 = new Book(2011, "Soper", "Rik", 9);
        d3.setYear(2011);
        System.out.println(d1);
        d1.TestYear();
        d2.TestYear();
        d3.TestYear();
    }
}
