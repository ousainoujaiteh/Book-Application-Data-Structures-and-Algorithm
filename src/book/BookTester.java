package book;

public class BookTester {

    public static void main(String[] args){
        Book book = new Book();
        book.setTitle("Programming");
        book.setAuthor("Ousainou Jaiteh");
        book.setFormat("PDF");
        book.setGenre("GENRE");
        book.setIsbn("4309443");
        book.setNumberOfBorrows(10);
        book.setPublicationDate("20-12-2018");
        book.setPublisher("Test");

        System.out.println(book.toString());

        Book book1 = new Book();
        book1.setTitle("Programming1");
        book1.setAuthor("Ousainou Jaiteh1");
        book1.setFormat("PDF1");
        book1.setGenre("GENRE1");
        book1.setIsbn("43094431");
        book1.setNumberOfBorrows(101);
        book1.setPublicationDate("19-12-2018");
        book1.setPublisher("Test1");
    }
}
