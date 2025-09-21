public class Book {
    private String title;
    private int year;
    private Author author;

    public Book(String title, int year, Author author) {
        this.title = title;
        this.year = year;
        this.author = author;
    }

//    public Book(int year, Author authorOne) {
//    }

    public String getTitle() {
        return this.title;
    }

    public Author getAuthorName() {
        return this.getAuthorName();
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}