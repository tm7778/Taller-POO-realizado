import java.util.ArrayList;
import java.util.Scanner;

public class Course {
    private String code;
    private String name;
    private ArrayList<Student> studentList;

    public static int id = 1;

    public Course(String code, String name) {
        this.name = name;
        this.code = code;
        this.studentList = new ArrayList<>();
    }

    public void addStudentToCourse(Scanner objScan) {
        objScan.nextLine();
        System.out.println("Add your First name.");
        String name = objScan.nextLine();
        System.out.println("Add your email.");
        String email = objScan.nextLine();
        System.out.println("Add your DNI.");
        String DNI = objScan.nextLine();
        Student objStudent = new Student(id, name, email, DNI);
        id++;
        this.studentList.add(objStudent);
        System.out.println(studentList);
    }

    public void listStudent(){
        System.out.println("Student List\n".concat(this.name));
        if (this.studentList.isEmpty()) {
            System.out.println("There are not students in course ".concat(this.name));
        }else{
            for (Student temp : this.studentList){
                System.out.println(temp.toString());
            }
        }
    }
    public void deleteStudent(Scanner objScan){
        this.listStudent();
        objScan.nextLine();
        System.out.println("Enter the Student id what you want to delete");
        int idDelete = objScan.nextInt();

        boolean eliminate = this.studentList.removeIf(student -> student.getId() == idDelete);
        if (eliminate) {
            System.out.println("It was delete successly!");
        }else{
            System.out.println("It wasn´t delete...");
        }
    }
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(ArrayList<Student> studentList) {
        this.studentList = studentList;
    }

    @Override
    public String toString() {
        return "Course\n" +
                "\ncode: " + code +
                "\nname: " + name;
    }
}
