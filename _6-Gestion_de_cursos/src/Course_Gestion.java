import javax.swing.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Course_Gestion {
    private ArrayList<Course> courseList;

    public Course_Gestion() {
        this.courseList = new ArrayList<>();
    }

    public void addCourse(Scanner objScan) {
        objScan.nextLine();
        System.out.println("You add the new course name.");
        String name = objScan.nextLine();

        System.out.println("You add the new course code.");
        String code = objScan.nextLine();

        if (this.validatorCourseForCode(code) != null) {
            System.out.println("Code isn't valid");
        } else {
            Course objCourse = new Course(code, name);
            if (this.courseList.add(objCourse)) {
                System.out.println("Course successly add!");
            } else {
                System.out.println("Course isn´t successly add.");
            }
        }
    }

    public void listAllTheCourses() {
        if (courseList.isEmpty()) {
            System.out.println("There were not course registered.");
        }
        for (Course temp : courseList) {
            System.out.println(temp.toString());
        }
    }

    public Course validatorCourseForCode(String code) {
        for (Course temp : this.courseList) {
            if (temp.getCode().equalsIgnoreCase(code)) {
                return temp;
            }
        }
        return null;
    }
}
