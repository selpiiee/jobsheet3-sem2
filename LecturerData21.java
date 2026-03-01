
public class LecturerData21 {

    public static void showAllLecturerData(Lecturer21[] arrayOfLecturer) {
        System.out.println("\n----------All Data Lecturer----------");
        for (Lecturer21 dosen : arrayOfLecturer) {
            System.out.println("ID\t: " + dosen.id);
            System.out.println("NAME\t: " + dosen.name);
            if (dosen.gender == true) {
                System.out.println("GENDER\t: Male");
            } else {
                System.out.println("GENDER\t: Female");
            }
            System.out.println("AGE\t: " + dosen.age);
            System.out.println("------------------------------------");
        }
    }

    public static void countLecturerByGender(Lecturer21[] arrayOfLecturer) {
        int male = 0, female = 0;
        for (Lecturer21 dosen : arrayOfLecturer) {
            if (dosen.gender == true) {
                male++;
            } else {
                female++;
            }
        }
        System.out.println("Amount of male\t\t: " + male);
        System.out.println("Amount of female\t: " + female);
    }

    public static void averageAgeOfLecturer(Lecturer21[] arrayOfLecturer) {
        double totalAge = 0;
        for (Lecturer21 dosen : arrayOfLecturer) {
            totalAge += dosen.age;
        }
        double average = totalAge / arrayOfLecturer.length;
        System.out.println("Average Age of Lecturers : " + average);
        System.out.println("------------------------------------");
    }

    public static void oldestLecturerInfo(Lecturer21[] arrayOfLecturer) {
        Lecturer21 oldest = arrayOfLecturer[0];
        for (Lecturer21 dosen : arrayOfLecturer) {
            if (dosen.age > oldest.age) {
                oldest = dosen;
            }
        }
        System.out.println("        OLDEST LECTURER DATA        ");
        System.out.println("------------------------------------");
        System.out.println("ID\t\t: " + oldest.id);
        System.out.println("Name\t\t: " + oldest.name);
        System.out.println("Gender\t\t: " + (oldest.gender ? "Male" : "Female"));
        System.out.println("Age\t\t: " + oldest.age);
        System.out.println("------------------------------------");
    }

    public static void youngestLecturerInfo(Lecturer21[] arrayOfLecturer) {
        Lecturer21 youngest = arrayOfLecturer[0];
        for (Lecturer21 dosen : arrayOfLecturer) {
            if (dosen.age < youngest.age) {
                youngest = dosen;
            }
        }
        System.out.println("        YOUNGEST LECTURER DATA        ");
        System.out.println("------------------------------------");
        System.out.println("ID\t\t: " + youngest.id);
        System.out.println("Name\t\t: " + youngest.name);
        System.out.println("Gender\t\t: " + (youngest.gender ? "Male" : "Female"));
        System.out.println("Age\t\t: " + youngest.age);
        System.out.println("------------------------------------");
    }

}
