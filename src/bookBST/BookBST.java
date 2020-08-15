package bookBST;

import book.Book;

class Node{
    Book book;
    Node left;
    Node right;

    Node(Book book){
        this.book = book;
        left = null;
        right = null;
    }
}

public class BookBST {

    Node root;

    /*
    * if the new node's value is lower than the current node's, we go to the left child
    * if the new node's value is greater than the current node's, we go to the right child
    * when the current node is null, we've reached a leaf node and we can insert the new node
    * in that position
    */
    private Node addRecursive(Node current , Book book){
        if (current == null){
            return new Node(book);
        }
        if (book.getAuthor().compareTo(current.book.getAuthor()) < 0){
            current.left = addRecursive(current.left,book);
        }else if (book.getAuthor().compareTo(current.book.getAuthor()) >= 0){
            current.right = addRecursive(current.right,book);
        }else{
            return current;
        }
        return current;
    }

    public void add(Book book){
        root = addRecursive(root,book);
    }

    // Needs fixing !!!
    private boolean conatainsAuthorValue(Node current,String author){
        if (current == null){
            return false;
        }
        if (author == current.book.getAuthor()){
            return true;
        }
        return author.compareTo(current.book.getAuthor()) < 0
                ? conatainsAuthorValue(current.left,author)
                : conatainsAuthorValue(current.right,author);
    }

    public boolean containAuthor(String author){
        return conatainsAuthorValue(root,author);
    }

    public void traverse(){
        traversePareOrder(root);
    }

    public void traversePareOrder(Node node){
        if (node != null){
            System.out.println("" + node.book.toString());
            traversePareOrder(node.left);
            traversePareOrder(node.right);
        }
    }
}
