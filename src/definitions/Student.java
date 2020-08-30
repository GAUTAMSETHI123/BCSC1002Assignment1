/*  Created by IntelliJ IDEA.
 *  User: Gautam Sethi (GAUTAMSETHI123)
 *  Date: 21/08/20
 *  Time: 3:49 PM
 *  File Name : Student.java
 * */
package definitions;


import java.util.Objects;
import java.util.Scanner;

public class Student {
    Scanner scanner = new Scanner(System.in);
    private String fullName;
    private String firstName;
    private String middleName;
    private String lastName;
    private long universityRollNo;
    private int noOfBooksIssued;
    private Book[] showBook;

    public Student(String fullName, String firstName, String middleName, String lastName, long universityRollNo,
                   int noOfBooksIssued) {
        this.fullName = getFullName();
        this.firstName = getFirstName();
        this.middleName = getMiddleName();
        this.lastName = getLastName();
        this.universityRollNo = getUniversityRollNo();
        this.noOfBooksIssued = getNoOfBooksIssued();
    }

    public Student(Book[] showBook) {
        this.showBook = showBook;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return getUniversityRollNo() == student.getUniversityRollNo() &&
                getNoOfBooksIssued() == student.getNoOfBooksIssued() &&
                Objects.equals(scanner, student.scanner) &&
                Objects.equals(getFullName(), student.getFullName()) &&
                Objects.equals(getFirstName(), student.getFirstName()) &&
                Objects.equals(getMiddleName(), student.getMiddleName()) &&
                Objects.equals(getLastName(), student.getLastName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(scanner, getFullName(), getFirstName(), getMiddleName(), getLastName(), getUniversityRollNo(), getNoOfBooksIssued());
    }

    /**
     * this method is used to take name as input from the student.
     */
    public void studentDetails() {
        System.out.println("enter first name");
        firstName = scanner.nextLine();
        System.out.println("enter middle name");
        middleName = scanner.nextLine();
        System.out.println("enter last name");
        lastName = scanner.nextLine();
        fullName = firstName + " " + middleName + " " + lastName;
        System.out.println("Your full name is: " + fullName);
    }

    /**
     * this method is used to take university roll no as input from the student
     */
    public void enterUniRollNo() {
        System.out.println("please enter your university roll no " + fullName);
        universityRollNo = scanner.nextLong();
    }
}
