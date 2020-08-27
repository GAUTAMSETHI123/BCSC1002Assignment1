/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:49 PM
 *  File Name : Student.java
 * */
package definitions;

public class Student {
    String firstName;
    String middleName;
    String lastName;
    long universityRollNo;
    int noOfBooksIssued;
    private Book[] book;


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public long getUniversityRollNo() {
        return universityRollNo;
    }

    public void setUniversityRollNo(long universityRollNo) {
        this.universityRollNo = universityRollNo;
    }

    public int getNoOfBooksIssued() {
        return noOfBooksIssued;
    }

    public void setNoOfBooksIssued(int noOfBooksIssued) {
        this.noOfBooksIssued = noOfBooksIssued;
    }

    public Book[] getBook() {
        return book.clone();
    }

    public void setBook(Book[] book) {
        this.book = book;
    }


}
