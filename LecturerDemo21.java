
import java.util.Scanner;

public class LecturerDemo21 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Total Course: ");
        int jumlah = Integer.parseInt(sc.nextLine());
        Lecturer21[] arrayOfLecturers = new Lecturer21[jumlah];
        String id, name, dummy, genderInput;
        boolean gender;
        int age;

        for (int i = 0; i < arrayOfLecturers.length; i++) {
            System.out.println("Enter Lecturer Data  " + (i + 1));
            System.out.print("ID\t\t: ");
            id = sc.nextLine();
            System.out.print("NAME\t\t: ");
            name = sc.nextLine();
            System.out.print("GENDER (M/F)\t: ");
            genderInput = sc.nextLine();
            if (genderInput.equalsIgnoreCase("M")) {
                gender = true;
            } else {
                gender = false;
            }
            System.out.print("AGE\t\t: ");
            dummy = sc.nextLine();
            age = Integer.parseInt(dummy);

            arrayOfLecturers[i] = new Lecturer21(id, name, gender, age);
        }

        System.out.println("\n========== LECTURER STATISTICS ==========");
        LecturerData21.showAllLecturerData(arrayOfLecturers);
        LecturerData21.countLecturerByGender(arrayOfLecturers);
        LecturerData21.averageAgeOfLecturer(arrayOfLecturers);
        LecturerData21.oldestLecturerInfo(arrayOfLecturers);
        LecturerData21.youngestLecturerInfo(arrayOfLecturers);
    }
}
