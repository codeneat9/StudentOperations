// Main.java
//Yashwith Behara
//23070126151
//AIML B3
import java.util.*;

class Main {
    //main method
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StudentOperator operations = new StudentOperator();
        int choice;
        //List of operatino for user menu
        do {
            System.out.println("\nMenu:\n1. Add Student\n2. Display Students\n3. Search by PRN\n4. Search by Name\n5. Search by Position (Index)\n6. Update Student\n7. Delete Student\n8. Exit");
            System.out.print("Enter your choice: ");
            choice = scan.nextInt();
            scan.nextLine();
            // to add a new student
            switch (choice) {
                case 1:
                    System.out.print("Enter Name: ");
                    String name = scan.nextLine();
                    System.out.print("Enter PRN: ");
                    long prn = scan.nextLong();
                    scan.nextLine();
                    System.out.print("Enter Branch: ");
                    String branch = scan.nextLine();
                    System.out.print("Enter Batch: ");
                    String batch = scan.nextLine();
                    System.out.print("Enter CGPA: ");
                    float cgpa = scan.nextFloat();
                    scan.nextLine();
                    operations.addStudent(new Student(name, prn, branch, batch, cgpa));
                    break;
                //to display the list of students
                case 2:
                    operations.displayStudents();
                    break;
                //to search a student by PRN
                case 3:
                    System.out.print("Enter PRN to search: ");
                    prn = scan.nextLong();
                    scan.nextLine();
                    Student student = operations.searchByPRN(prn);
                    if (student != null) student.display();
                    else System.out.println("Student not found.");
                    break;
                //to search a student by name
                case 4:
                    System.out.print("Enter Name to search: ");
                    name = scan.nextLine();
                    student = operations.searchByName(name);
                    if (student != null) student.display();
                    else System.out.println("Student not found.");
                    break;
                
                case 5:
                    System.out.print("Enter Position (Index) to search: ");
                    int position = scan.nextInt();
                    scan.nextLine();
                    student = operations.searchByPosition(position);
                    if (student != null) student.display();
                    else System.out.println("Invalid position.");
                    break;
                //to update the student details
                case 6:
                    System.out.print("Enter PRN of student to update: ");
                    prn = scan.nextLong();
                    scan.nextLine();
                    System.out.print("Enter New Name: ");
                    name = scan.nextLine();
                    System.out.print("Enter New Branch: ");
                    branch = scan.nextLine();
                    System.out.print("Enter New Batch: ");
                    batch = scan.nextLine();
                    System.out.print("Enter New CGPA: ");
                    cgpa = scan.nextFloat();
                    scan.nextLine();
                    if (operations.updateStudent(prn, name, branch, batch, cgpa))
                        System.out.println("Student updated successfully.");
                    else
                        System.out.println("Student not found.");
                    break;
                //to delete a student
                case 7:
                    System.out.print("Enter PRN of student to delete: ");
                    prn = scan.nextLong();
                    scan.nextLine();
                    if (operations.deleteStudent(prn))
                        System.out.println("Student deleted successfully.");
                    else
                        System.out.println("Student not found.");
                    break;
                //to exit the program
                case 8:
                    System.out.println("Exiting...");
                    break;
                //if the user enters an invalid choice
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 8); //to exit the program
    }
}