package bst;

import book.Book;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BinarySearchTreeTester {

    public static void main(String[] args) {

        BinarySearchTree tree = loadData();

        System.out.println("Ascending Order.......");
        for (Object list : tree.toList()) {
            System.out.println(list);
        }

        System.out.println();

        System.out.println("Descending Order.......");
        for (Object list : tree.toDesc(tree.toList())) {
            System.out.println(list);
        }
    }

    public static BinarySearchTree loadData() {
        BinarySearchTree bst = new BinarySearchTree();
        try {
            String path = "BooksData.txt";
            File file = new File(path);
            Scanner reader = new Scanner(file);
            while (reader.hasNextLine()) {
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
