
public class Course21 {

    public String code;
    public String name;
    public int sks;
    public int totalHours;

    public Course21() {

    }

    public Course21(String code, String name, int sks, int totalHours) {
        this.code = code;
        this.name = name;
        this.sks = sks;
        this.totalHours = totalHours;
    }

    public void addData(String code, String name, int sks, int totalHours) {
        this.code = code;
        this.name = name;
        this.sks = sks;
        this.totalHours = totalHours;
    }

    public void printInfo() {
        System.out.println("CODE\t\t: " + code);
        System.out.println("NAME\t\t: " + name);
        System.out.println("SKS\t\t: " + sks);
        System.out.println("TOTAL HOURS\t: " + totalHours);
        System.out.println("------------------------------------");
    }
}
