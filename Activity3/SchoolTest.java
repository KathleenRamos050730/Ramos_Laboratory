package Activity3;
import java.util.*;
class Person {
    private String name;
    private int id;
   
    public Person (String name, int id) {
        this.name = name;
        this.id = id;
    }
 
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Id: " + id);
    }
}
 
public class SchoolTest {
    public static void main (String[] args) {
        Scanner scanner = new Scanner (System.in);
 
        System.out.println("Enter Student details!");
        System.out.println("Name:");
        String studentName = scanner.nextLine();
        System.out.println("ID:");
        int studentId = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Grade Level: ");
        String studentGradeLevel = scanner.nextLine();
 
        
 
        System.out.println("Enter Teacher details!");
        System.out.println("Name:");
        String teacherName = scanner.nextLine();
        System.out.println("ID: ");
        int teacherId = scanner.nextInt();
 
        scanner.nextLine();
 
        System.out.println("Subject: ");
        String teacherSubject = scanner.nextLine();
 
        scanner.nextLine();
 
        System.out.println("Enter Staff details!");
        System.out.println("Name:");
        String staffName = scanner.nextLine();
        System.out.println("ID:");
        int staffId = scanner.nextInt();
 
        scanner.nextLine();
 
        System.out.println("Department:");
        String staffDepartment = scanner.nextLine();
 
        scanner.nextLine();
 
        Person Student = new Student (studentName, studentId, studentGradeLevel);
        Person Teacher = new Teacher (teacherName, teacherId, teacherSubject);
        Person Staff = new Staff (staffName, staffId, staffDepartment);
 
        System.out.println("\nStudent");
        Student.displayInfo();
        System.out.println();
        System.out.println("\nTeacher");
        Teacher.displayInfo();
        System.out.println();
        System.out.println("\nStaff");
        Staff.displayInfo();
 
        scanner.close();  
    }  
}