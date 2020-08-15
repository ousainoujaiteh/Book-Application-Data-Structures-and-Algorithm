package bookBST;

import book.Book;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BinarySearchTreeTester {

    public static void main(String[] args){

        BookBST b = loadData();
        b.traverse();

    }

    public static BookBST loadData(){
        BookBST bst = new BookBST();
        try {
            String path = "/home/ousainou/Documents/academics/UTG-TA/2019-2020 " +
                    "SEMESTER 2/OPERATING SYSTEMS/BookApplication/src/bookBST/BooksData.txt";
            File file = new File(path);
            Scanner reader = new Scanner(file);
            while (reader.hasNextLine()){
                String data = reader.nextLine();
                String[] book = data.trim().split(";");
                Book bk = new Book();
                bk.setTitle(book[1]);
                bk.setAuthor(book[2]);
                bk.setFormat(book[6]);
                bk.setGenre(book[7]);
                bk.setIsbn(book[0]);
                bk.setNumberOfPages(Integer.parseInt(book[4].trim()));
                bk.setNumberOfBorrows(Integer.parseInt(book[8].trim()));
                bk.setPublicationDate(book[5]);
                bk.setPublisher(book[3]);

                bst.add(bk);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred");
            e.printStackTrace();
        }
        return bst;
    }

}
