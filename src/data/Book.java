package data;


public class Book {

    private String title;
    private int year;
    private long iSBN;
    private String name;
    private double price;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public long getISBN() {
        return iSBN;
    }

    public void setISBN(long iSBN) {
        this.iSBN = iSBN;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

