// StudentOperations.java
import java.util.*;
//StudentOperator class
public class StudentOperator {
    private ArrayList<Student> students;
    //constructor
    public StudentOperator() { this.students = new ArrayList<>(); }
    //to add student
    public void addStudent(Student student) { students.add(student); }
    //to display the list of students
    public void displayStudents() {
        for (Student student : students) { student.display(); }
    }
    //to search a student by PRN
    public Student searchByPRN(long prn) {
        for (Student student : students) {
            if (student.getPRN() == prn) return student;
        }
        return null;
    }
    //to search a student by name
    public Student searchByName(String name) {
        for (Student student : students) {
            if (student.getName().equalsIgnoreCase(name)) return student;
        }
        return null;
    }
    //to search a student by position
    public Student searchByPosition(int position) {
        if (position >= 0 && position < students.size()) return students.get(position);
        return null;
    }
    //to update the student details
    public boolean updateStudent(long prn, String name, String branch, String batch, float cgpa) {
        Student student = searchByPRN(prn);
        if (student != null) {
            student.setName(name);
            student.setBranch(branch);
            student.setBatch(batch);
            student.setCGPA(cgpa);
            return true;
        }
        return false;
    }
    //to delete a student
    public boolean deleteStudent(long prn) {
        Student student = searchByPRN(prn);
        if (student != null) {
            students.remove(student);
            return true;
        }
        return false;
    }
}