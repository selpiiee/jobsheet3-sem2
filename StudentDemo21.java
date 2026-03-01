import java.util.Scanner;

public class StudentDemo21 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student21[] arrayOfStudents = new Student21[3];
        String dummy;

        for (int i = 0; i < 3; i++) {
            arrayOfStudents[i] = new Student21();

            System.out.println("Enter student data  " + (i + 1));
            System.out.print("NIM\t: ");
            arrayOfStudents[i].nim = sc.nextLine();
            System.out.print("NAME\t: ");
            arrayOfStudents[i].name = sc.nextLine();
            System.out.print("CLASS\t: ");
            arrayOfStudents[i].Class = sc.nextLine();
            System.out.print("GPA\t: ");
            dummy = sc.nextLine();
            arrayOfStudents[i].gpa = Float.parseFloat(dummy);
            System.out.println("-----------------------------");
        }

        for (int i = 0; i < 3; i++) {
            System.out.println("Student data  " + (i + 1));
            System.out.println("NIM\t: " + arrayOfStudents[i].nim);
            System.out.println("NAME\t: " + arrayOfStudents[i].name);
            System.out.println("CLASS\t: " + arrayOfStudents[i].Class);
            System.out.println("GPA\t: " + arrayOfStudents[i].gpa);
            System.out.println("-----------------------------");
        }
    }

}
