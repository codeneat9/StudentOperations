// Student.java
public class Student {
    private String name;
    private long prn;
    private String branch;
    private String batch;
    private float cgpa;
    //constructor
    public Student(String name, long prn, String branch, String batch, float cgpa) {
        this.name = name;
        this.prn = prn;
        this.branch = branch;
        this.batch = batch;
        this.cgpa = cgpa;
    }
    //getters
    public String getName() { return name; }
    public long getPRN() { return prn; }
    public String getBranch() { return branch; }
    public String getBatch() { return batch; }
    public float getCGPA() { return cgpa; }
    //setters
    public void setName(String name) { this.name = name; }
    public void setBranch(String branch) { this.branch = branch; }
    public void setBatch(String batch) { this.batch = batch; }
    public void setCGPA(float cgpa) { this.cgpa = cgpa; }
    //display
    public void display() {
        System.out.println("Name: " + name + " | PRN: " + prn + " | Branch: " + branch + " | Batch: " + batch + " | CGPA: " + cgpa);
    }
}