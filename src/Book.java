public class Book {
    private int year;
    private String name;
    private String autor;
    private int price;

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Book(int year, String name, String autor, int price) {
        this.year = year;
        this.name = name;
        this.autor = autor;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "year=" + year +
                ", name='" + name + '\'' +
                ", autor='" + autor + '\'' +
                ", price=" + price +
                '}';
    }

    public void TestYear() {

        if (year == 2012) {
            System.out.println("Авторство Morty");
        } else if (year == 2011) {
            System.out.println("Авторство Tolstoi");
        } else if (year == 2013) {
            System.out.println("Авторство Rik ");
        } else{
                System.out.println("Автор неизвестен");
            }
        }
    }
