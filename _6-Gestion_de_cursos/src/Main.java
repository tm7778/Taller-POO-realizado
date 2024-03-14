import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner objScan = new Scanner(System.in);
        Course_Gestion objGestion = new Course_Gestion();
        int option = 0;
        do {
            System.out.println("""
                    Option Menu
                    1. Manage students.
                    2. Manage Course.
                    3 Close.
                                        
                    Add an option.  
                    """);
            option = objScan.nextInt();
            switch (option) {
                case 1:
                    int option3 = 0;
                    do {
                        System.out.println("""
                                Student Menu
                                1. Add Student.
                                2. List Students.
                                3. Delete Students id.
                                4. Close\n
                                """);
                        option3 = objScan.nextInt();
                        switch (option3){
                            case 1:
                                objGestion.listAllTheCourses();
                                objScan.nextLine();
                                System.out.println("Add the course code where you list the course's students.");
                                String code = objScan.nextLine();
                                Course objCourse = objGestion.validatorCourseForCode(code);
                                if (objCourse == null) {
                                    System.out.println("The code entered wasn't valid");
                                }else{
                                    objCourse.addStudentToCourse(objScan);
                                    System.out.println(objCourse.getStudentList());
                                }
                                break;

                            case 2:
                                objGestion.listAllTheCourses();
                                objScan.nextLine();
                                System.out.println("Add the course code where you enter the new student.");
                                code = objScan.nextLine();
                                objCourse = objGestion.validatorCourseForCode(code);
                                if (objCourse == null) {
                                    System.out.println("The code entered wasn't valid");
                                }else{
                                    objCourse.listStudent();
                                }
                                break;

                            case 3:
                                objGestion.listAllTheCourses();
                                objScan.nextLine();
                                System.out.println("Enter the course code where you want to delete a student:");
                                String courseCode = objScan.nextLine();
                                Course courseToDeleteStudent = objGestion.validatorCourseForCode(courseCode);
                                if (courseToDeleteStudent == null) {
                                    System.out.println("There isn't your course code.");
                                }else{
                                    courseToDeleteStudent.deleteStudent(objScan);
                                }
                                break;
                        }
                    } while (option3 != 4);
                    break;
                case 2:
                    int option2 = 0;

                    do {
                        System.out.println("""
                                Course Menu
                                1. Add Course.
                                2. List Course.
                                3. Find Course code.
                                4. Close\n
                                """);
                        option2 = objScan.nextInt();
                        switch (option2) {
                            case 1:
                                objGestion.addCourse(objScan);
                                break;
                            case 2:
                                objGestion.listAllTheCourses();
                                break;
                            case 3:
                                System.out.println("Write the course code what you want.");
                                String codeValid = objScan.next();
                                Course objCourse = objGestion.validatorCourseForCode(codeValid);
                                if (objCourse == null) {
                                    System.out.println("There aren't course.");
                                } else {
                                    System.out.println(objCourse.toString());
                                }
                                break;
                        }
                    } while (option2 != 4);
                    break;
            }
        } while (option != 3);
    }
}