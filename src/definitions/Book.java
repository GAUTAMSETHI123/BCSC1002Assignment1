/*  Created by IntelliJ IDEA.
 *  User: Gautam Sethi (GAUTAMSETHI123)
 *  Date: 21/08/20
 *  Time: 3:49 PM
 *  File Name : Book.java
 * */
package definitions;

import java.util.Objects;
import java.util.Scanner;

public class Book {
    private String bookName;
    private String authorOfTheBook;
    private String bookISBN;

    public Book() {
        this.bookName = getBookName();
        this.authorOfTheBook = getAuthorOfTheBook();
        this.bookISBN = getBookISBN();
    }
    public Book(String bookName) {
        this.bookName = bookName;
        this.authorOfTheBook = "UNKNOWN";
        this.bookISBN = "NOT ASSIGNED";
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthorOfTheBook() {
        return authorOfTheBook;
    }

    public void setAuthorOfTheBook(String authorOfTheBook) {
        this.authorOfTheBook = authorOfTheBook;
    }

    public String getBookISBN() {
        return bookISBN;
    }

    public void setBookISBN(String bookISBN) {
        this.bookISBN = bookISBN;
    }

    @Override
    public String toString() {
        return "Book name is: " + getBookName() + "," + "author name is: "
                + getAuthorOfTheBook() + "," + "ISBN number is: " + getBookISBN() + ".";
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Book book = (Book) object;
        return Objects.equals(getBookName(), book.getBookName()) &&
                Objects.equals(getAuthorOfTheBook(), book.getAuthorOfTheBook()) &&
                Objects.equals(getBookISBN(), book.getBookISBN());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getBookName(), getAuthorOfTheBook(), getBookISBN());
    }

    /**
     * this method allows the student to issue the book.
     */
    public void issueBookName() {
        Scanner scanner = new Scanner(System.in);
        bookName = scanner.nextLine();

    }

    /**
     * this method is used to print Thank you message for the issued book.
     */

    public void messageForTheIssuedBook() {
        System.out.println("\"" + bookName + "\" is now issued for you");
        System.out.println("Thank You!");
    }

    /**
     * this method is used to print heading message for the issued book.
     */

    public void detailsOfTheBook() {
        System.out.println("Details of the issued book are as follows : ");
    }

    /**
     * this method is used to print the issued book details.
     */

    public void detailsOfTheIssuedBook() {
        System.out.println("Name of the issued book: " + bookName);
        System.out.println("Name of the author: N/a");
        System.out.println("Book ISBN no: N/a");
    }
}



