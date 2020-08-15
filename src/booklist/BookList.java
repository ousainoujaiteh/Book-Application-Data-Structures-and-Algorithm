package booklist;


import book.Book;

class BookNode {
    public BookNode next;
    public Book book;


    public BookNode(Book book) {
        this.book = book;
    }

    public void displayBook() {
        System.out.println(this.book.toString());
    }
}

public class BookList {

    private BookNode first;

    public BookList() {
        this.first = null;
    }

    public void addBook(Book book) {
        BookNode bookNode = new BookNode(book);
        bookNode.next = first;
        first = bookNode;
    }

    public BookNode searchByAuthor(String author) {
        BookNode current = first;
        while (current.book.getGenre().equalsIgnoreCase(author)) {
            if (current.next == null) {
                return null;
            } else {
                current = current.next;
            }
        }
        return current;
    }

    public BookNode searchByTitle(String title) {
        BookNode current = first;
        while (current.book.getTitle() != title) {
            if (current.next == null) {
                return null;
            } else {
                current = current.next;
            }
        }
        return current;
    }

    public void displayBooksByGenre(String genre) {
        System.out.println("Displaying All The Books Genre .....");
        BookNode current = first;
        while (current != null) {
            if (current.book.getGenre().equalsIgnoreCase(genre)) {
                current.displayBook();
                current = current.next;
            }
        }
        System.out.println("");
    }

    public void displayAllBooks() {
        System.out.println("Displaying All The Books.....");
        BookNode current = first;
        while (current != null) {
            current.displayBook();
            current = current.next;
        }
        System.out.println("");
    }

}
