Introduction
The tasks identified as part 1 to part 4 below form the basis of this element of the Data Structures and Algorithms programming coursework. You have to provide appropriate solutions to each of the given tasks.

Part 1. Building a Book class

Create a class that holds the following data for a Book:
• ISBN
• Title
• Author
• Publisher
• Number of Pages
• Publication Date
• Format
• Genre
• Number of borrows
You have to provide appropriate getters and setters for this class. Also, you are required to write a test harness that will create different Book objects showing the use of your getters and setters.

Part 2. Building a Book List class

Create a class called bookList that holds a collection of Books. The data structure for the
collection is expected to be a single linked list. The bookList class must be implemented by
designing your own coding for the class. You are not permitted to use the java collections.
Your class should provide methods to implement the abstract methods that you have identified in your IADTbookList interface.
• Add a book to the list.
• Display a book on screen in an appropriate way.
• Search for a specific book by Title.
• Search for a book(s) by a specific Author.
• Display all the books for a given genre in the list.
• Display all the books in the list.

Part 3. Building a Binary Search Tree (BST) of Book data

Create a class called bookBST that holds a collection of books in a binary search tree (as in
the lab you can use the Koffman and Wolfgang material to help with this). All the books data
should come from an external file, which has been provided, to match the Book class given in
part 1 above. Each piece of book data is provided on a new line in the file; matching the
structure outlined in part 1.
The books data should be read in from the external file and must be stored in your bookBST
data structure by calling an appropriate method e.g. loadData(). You should also provide your
users with appropriate methods to allow them to sort and view the books in your bookBST.
• Display a list of all the books in ascending Author order.
• Display a list of all the books in descending Author order.
• Display a list of all the books that are available.
• Display a list of all the Author names for all the books.

Hint: you will need to be able to compare one Author with another and hence decide, based
on its lexicographic order, where to insert it in the BST. Visit this page Lexicographic Order
for an overview of lexicographic order.

Part 4. Pulling the parts together.

The application should display a menu that has options that allows the user to carry out the
functionality provided by parts 1, 2 & 3 as well as ask for help and quit the application.
