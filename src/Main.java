public class Main {
    public static void main(String[] args) {
        Author authorOne = new Author("Федор", "Достоевский");
        Author authorTwo = new Author("Лев", "Толстой");
        Book bookOne = new Book("Идиот", 1886, authorOne);
        Book bookTwo = new Book("Война и мир", 1869, authorTwo);
        bookOne.setYear(1887);
        System.out.println("Книга: " + bookOne.getTitle() + ". Автор: " + authorOne.getFirstName() + authorOne.getLastName() + ". Год публикации: " + bookOne.getYear());
        System.out.println("Книга: " + bookTwo.getTitle() + ". Автор: " + authorTwo.getFirstName() + authorTwo.getLastName() + ". Год публикации: " + bookTwo.getYear());
    }
}