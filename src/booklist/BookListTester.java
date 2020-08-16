package booklist;

import book.Book;

public class BookListTester {

    public static void main(String[] args){

        Book book = new Book();
        book.setTitle("Programming");
        book.setAuthor("Ousainou");
        book.setFormat("PDF");
        book.setGenre("GENRE");
        book.setIsbn("4309443");
        book.setNumberOfBorrows(10);
        book.setPublicationDate("20-12-2018");
        book.setPublisher("Test");

        Book book1 = new Book();
        book1.setTitle("Programming1");
        book1.setAuthor("Ousainou Jaiteh");
        book1.setFormat("PDF1");
        book1.setGenre("GENRE1");
        book1.setIsbn("43094431");
        book1.setNumberOfBorrows(101);
        book1.setPublicationDate("19-12-2018");
        book1.setPublisher("Test1");

        Book book2 = new Book();
        book2.setTitle("NETWORKING");
        book2.setAuthor("FRED UCHE");
        book2.setFormat("EBOOK");
        book2.setGenre("GENRE1");
        book2.setIsbn("43094431");
        book2.setNumberOfBorrows(10);
        book2.setPublicationDate("19-12-2019");
        book2.setPublisher("Test2");

        BookList list = new BookList();

        list.addBook(book);
        list.addBook(book1);
        list.addBook(book2);

        BookNode bookNode = list.searchByAuthor("Ousainou");
        if (bookNode != null){
            System.out.println("Displaying Book(s) by Author...");
            bookNode.displayBook();
        }else {
            System.out.println("No Book Found !!!");
        }
    }
}
