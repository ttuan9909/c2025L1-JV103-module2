package ss5_static_accessmodifier.bai_tap;

public class Student {
    private String name = "John";
    private String classes = "C02";

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Tuấn");
        System.out.println(student.getName());
        student.setClasses("C022025");
        System.out.println(student.getClasses());
    }
}
