/*  Created by IntelliJ IDEA.
 *  User: Gautam Sethi (GAUTAMSETHI123)
 *  Date: 21/08/20
 *  Time: 3:50 PM
 *  File Name : Library.java
 * */
package definitions;

import java.util.Arrays;
import java.util.Scanner;

public class Library {
    private Book[] showBook;

    public Library() {
        this.showBook = new Book[5];
        for (int i = 0; i < showBook.length; i++) {
            showBook[i] = new Book("Book " + (i + 1));
        }
    }

    public Book[] getShowBook() {
        return showBook;
    }

    public void setShowBook(Book[] showBook) {
        this.showBook = showBook.clone();
    }

    /**
     * this method is used to return the issued book.
     *
     * @param nameOfBook name of the book which is to be returned.
     */

    public void restoreBook(String nameOfBook) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\"" + nameOfBook + "\" is restored in the library database");
        System.out.println("THANK YOU!");

    }

    @Override
    public String toString() {
        return Arrays.toString(showBook);
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Library library = (Library) o;
        return Arrays.equals(getShowBook(), library.getShowBook());
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(getShowBook());
    }

    /**
     * this method prints the issued books.
     */
    public void showIssuedBooks() {
        for (Book books : this.showBook
        ) {
            System.out.println(books);
        }
    }
}





