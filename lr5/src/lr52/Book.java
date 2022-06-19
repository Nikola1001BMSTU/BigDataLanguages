package lr52;



public class Book {
    private int id;
    private String name;
    private String author;
    private String publisher;
    private int year;
    private int page_amount;
    private int cost;
    private boolean cover;

    public Book(){

    }

    public Book(int id, String name, String author, String publisher, int year, int page_amount, int cost, boolean cover) throws Exception {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.year = year;
        if (page_amount < 0){
            throw new Exception("Page_amount < 0");
        }
        this.page_amount = page_amount;
        if (cost < 0){
            throw new Exception("Cost < 0");
        }
        this.cost = cost;
        this.cover = cover;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPage_amount() {
        return page_amount;
    }

    public void setPage_amount(int page_amount) {
        this.page_amount = page_amount;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public boolean isCover() {
        return cover;
    }

    public void setCover(boolean cover) {
        this.cover = cover;
    }

    public static Book[] make_list(int amount){
        return new Book[amount];
    }


    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", publisher='" + publisher + '\'' +
                ", year=" + year +
                ", page_amount=" + page_amount +
                ", cost=" + cost +
                ", cover=" + cover +
                '}';
    }
}
