import java.util.Scanner;

public class CourseDemo21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of courses: ");
        int jumlah = Integer.parseInt(sc.nextLine());
        Course21[] arrayOfCourse = new Course21[jumlah];
        String code, name, dummy;
        int sks, totalHours;

        for (int i = 0; i < 3; i++) {
            System.out.println("Enter Course Data  " + (i + 1));
            System.out.print("CODE\t\t: ");
            code = sc.nextLine();
            System.out.print("NAME\t\t: ");
            name = sc.nextLine();
            System.out.print("SKS\t\t: ");
            dummy = sc.nextLine();
            sks = Integer.parseInt(dummy);
            System.out.print("TOTAL HOURS\t: ");
            dummy = sc.nextLine();
            totalHours = Integer.parseInt(dummy);
            System.out.println("------------------------------");

            arrayOfCourse[i] = new Course21(code, name, sks, totalHours);
        }

            for(int j = 0; j < 3; j++) {
                System.out.println("Course Data  " + (j + 1));
                System.out.println("CODE\t\t: " + arrayOfCourse[j].code);
                System.out.println("NAME\t\t: " + arrayOfCourse[j].name);
                System.out.println("SKS\t\t: " + arrayOfCourse[j].sks);
                System.out.println("TOTAL HOURS\t: " + arrayOfCourse[j].totalHours);
                System.out.println("------------------------------");
            }
        }
    }
