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

        do {
            System.out.println("-=-=--=-=-\"Welcome To The Front Desk\"-=-=--=-=-");
            System.out.println("How may I help you today?");
            System.out.println("1. Issue a new book for me.");
            System.out.println("2. Return a previously issues book for me.");
            System.out.println("3. Show me all my issues books.");
            System.out.println("4. Exit.");
            studentResponse = scanner.nextInt();

            switch (studentResponse) {
                case NEW_BOOK:
                    student.studentDetails();
                    student.enterUniRollNo();
                    System.out.println("students details saved!");
                    System.out.println("Enter the name of the book you want to issue!");
                    book.issueBookName();
                    book.detailsOfTheBook();
                    book.detailsOfTheIssuedBook();
                    book.messageForTheIssuedBook();
                    break;
                case RETURN_BOOKS:
                    System.out.println("Enter the name of the book you want to return to the management");
                    scanner.nextLine();
                    returnBook = scanner.nextLine();
                    library.restoreBook(returnBook);
                case ISSUED_BOOKS:
                    System.out.println("your issued books are: ");
                    library.showIssuedBooks();
                    break;
            }

        } while (studentResponse != EXIT);
        scanner.close();


    }
}
