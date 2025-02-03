/*Question: Create a class hierarchy for a Library System. 
Implement a base class Item with properties like title, author, 
and publicationYear. Derive two classes, Book and Magazine, from 
the Item class. Each derived class should have additional properties such 
as genre for books and issueNumber for magazines. Write methods in each class to
display their details. Demonstrate the use of inheritance by creating objects of
both classes and calling their respective methods.*/

// Base class Item
class Item {
    private String title;
    private String author;
    private int publicationYear;

    // Constructor
    public Item(String title, String author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    // Getters
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    // Method to display item details
    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Publication Year: " + publicationYear);
    }
}

// Derived class Book
class Book extends Item {
    private String genre;

    // Constructor
    public Book(String title, String author, int publicationYear, String genre) {
        super(title, author, publicationYear);
        this.genre = genre;
    }

    // Method to display book details
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Genre: " + genre);
    }
}

// Derived class Magazine
class Magazine extends Item {
    private int issueNumber;

    // Constructor
    public Magazine(String title, String author, int publicationYear, int issueNumber) {
        super(title, author, publicationYear);
        this.issueNumber = issueNumber;
    }

    // Method to display magazine details
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Issue Number: " + issueNumber);
    }
}

// Main class to demonstrate the use of inheritance
public class LibrarySystem {
    public static void main(String[] args) {
        // Create a Book object
        Book book = new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925, "Fiction");
        System.out.println("Book Details:");
        book.displayDetails();

        System.out.println(); // For spacing

        // Create a Magazine object
        Magazine magazine = new Magazine("National Geographic", "Various Authors", 2023, 256);
        System.out.println("Magazine Details:");
        magazine.displayDetails();
    }
}