package book;

public class Book implements Comparable<Book> {

    private String isbn;
    private String title;
    private String author;
    private String publisher;
    private int numberOfPages;
    private String publicationDate;
    private String format;
    private String genre;
    private int numberOfBorrows;




    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public String getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(String publicationDate) {
        this.publicationDate = publicationDate;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getNumberOfBorrows() {
        return numberOfBorrows;
    }

    public void setNumberOfBorrows(int numberOfBorrows) {
        this.numberOfBorrows = numberOfBorrows;
    }

    @Override
    public int compareTo(Book book) {
        if (this.getAuthor().compareTo(book.getAuthor()) < 0){
            return -1;
        }else if (this.getAuthor().compareTo(this.getAuthor()) > 0){
            return 1;
        }else{
            return 0;
        }
    }

    public String toString(){
        return " Book Details ##### \n" + " Book Isbn :" + getIsbn() + " \n" + " Book Title :" + getTitle() + "\n" +
                " Book Author :" + getAuthor() + "\n" + " Book Publisher : " + getPublisher() + "\n Book Number of Pages :" +
                getNumberOfPages() + "\n Book Publication Date : " + getPublicationDate() + "\n" + " Book Format : " +
                getFormat() + "\n" + " Book Genre : " + getGenre() + " \n" + " Book Number of Borrows : " + getNumberOfBorrows() + "\n";
    }

}
