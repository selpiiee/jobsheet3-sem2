public class StudentDemo21 {
    public static void main(String[] args) {
        Student21[] arrayOfStudents = new Student21[3];
        arrayOfStudents[0] = new Student21();
        arrayOfStudents[0].nim = "24410700033";
        arrayOfStudents[0].name = "AGNES TITANIA KINANTI";
        arrayOfStudents[0].Class = "SIB-1E";
        arrayOfStudents[0].gpa = (float) 3.75;

        arrayOfStudents[1] = new Student21();
        arrayOfStudents[1].nim = "2341720172";
        arrayOfStudents[1].name = "ACHMAD MAULANA HAMZAH";
        arrayOfStudents[1].Class = "TI-2A";
        arrayOfStudents[1].gpa = (float) 3.36;

        arrayOfStudents[2] = new Student21();
        arrayOfStudents[2].nim = "244107023006";
        arrayOfStudents[2].name = "DIRHAMAWAN PUTRANTO";
        arrayOfStudents[2].Class = "TI-2E";
        arrayOfStudents[2].gpa = (float) 3.80;


        System.out.println("NIM\t: " + arrayOfStudents[0].nim);
        System.out.println("NAME\t: " + arrayOfStudents[0].name);
        System.out.println("CLASS\t: " + arrayOfStudents[0].Class);
        System.out.println("GPA\t: " + arrayOfStudents[0].gpa);
        System.out.println("-------------------------------------");
        System.out.println("NIM\t: " + arrayOfStudents[1].nim);
        System.out.println("NAME\t: " + arrayOfStudents[1].name);
        System.out.println("CLASS\t: " + arrayOfStudents[1].Class);
        System.out.println("GPA\t: " + arrayOfStudents[1].gpa);
        System.out.println("-------------------------------------");
        System.out.println("NIM\t: " + arrayOfStudents[2].nim);
        System.out.println("NAME\t: " + arrayOfStudents[2].name);
        System.out.println("CLASS\t: " + arrayOfStudents[2].Class);
        System.out.println("GPA\t: " + arrayOfStudents[2].gpa);
        System.out.println("-------------------------------------");
    }
}