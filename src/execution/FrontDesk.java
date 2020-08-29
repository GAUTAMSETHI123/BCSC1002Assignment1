/*  Created by IntelliJ IDEA.
 *  User: Gautam Sethi (GAUTAMSETHI123)
 *  Date: 21/08/20
 *  Time: 3:50 PM
 *  File Name : FrontDesk.java
 * */
package execution;

import definitions.Book;
import definitions.Library;
import definitions.Student;

import java.util.Scanner;

public class FrontDesk {
    public static final int NEW_BOOK = 1;
    public static final int RETURN_BOOKS = 2;
    public static final int ISSUED_BOOKS = 3;
    public static final int EXIT = 4;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int studentResponse;
        String returnBook;
        Student student = new Student();
        Book book = new Book();
        Library library = new Library();


    }
}
