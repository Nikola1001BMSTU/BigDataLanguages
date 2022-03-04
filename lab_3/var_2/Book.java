package lab_3.var_2;


public class Book {
    int id;
    String name;
    String author;
    String publishing_house;
    int year;
    int pages_number;
    double price;
    String cover;
    Book(int id, String name, String author, String publishing_house, int year, int pages_number, double price, String cover) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publishing_house = publishing_house;
        this.year = year;
        this.pages_number = pages_number;
        this.price = price;
        this.cover = cover;
    }
    public static void showInfoAuthor(String author, Book amount[], int n) {
        for (int i = 0; i < n; i++) {
            if (amount[i].author.equals(author)) {
                System.out.println(amount[i].toString());
            }
        }
    }
    public static void showInfo_Publishing_house(String publishing_house,  Book amount[], int n) {
        /** TODO: dgretgregtr **/

        for (int i = 0; i < n; i++)
            if (amount[i].publishing_house.equals(publishing_house)) {
                System.out.println(amount[i].toString());
            }
    }
    public static void showInfo_Year(int year,  Book amount[], int n) {
        for (int i = 0; i < n; i++)
            if (amount[i].year > year) {
                System.out.println(amount[i].toString());
            }
    }
    public static void createObj(int n) {
        Book[] amount = new Book[n];
        amount[0] = new Book(1, "King", "Voronov", "Moscow", 2011, 40, 100, "paper");
        amount[1] = new Book(2, "Queen", "Voronov", "Moscow", 2001, 50, 200, "paper");
        amount[2] = new Book(3, "Самолёт", "Ivanov", "NN", 2018, 30, 150, "paper");
        showInfoAuthor("Voronov", amount, n);
        System.out.println();
        showInfo_Publishing_house("NN", amount, n);
        System.out.println();
        showInfo_Year(2010, amount, n);
    }

    public int getId() {
        return this.id;
    }
    public String getName() {
        return this.name;
    }
    public String getAuthor() {
        return this.author;
    }
    public String getPublishing_house() {
        return this.publishing_house;
    }
    public int getYear() {
        return this.year;
    }
    public int getPages_number() {
        return this.pages_number;
    }
    public double getPrice() {
        return this.price;
    }
    public String getCover() {
        return this.cover;
    }

    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public void setPublishing_house(String publishing_house) {
        this.publishing_house = publishing_house;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public void setPages_number(int pages_number) {
        this.pages_number = pages_number;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public void setCover(String cover) {
        this.cover = cover;
    }
    public String toString () {
        return id + " " + name + " " + author + " " + publishing_house + " " + year + " " + pages_number + " " + price + " " + cover;
    }

    public static void main(String[] args) {
        int n = 3;
        createObj(n);
    }
}
