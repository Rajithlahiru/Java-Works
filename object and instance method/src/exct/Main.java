package exct;

public class Main {

    public static void main(String[] args) {
        Student student1 = new Student("Rajith","Computer Science",3.8);
        Student student2 = new Student("John","Software Engineering",3.2);

        System.out.println("Rajith ==> "+student1.onHonourRoll());
        System.out.println("John==> "+student2.onHonourRoll());

        student1.setGpa(3.7);
        System.out.println(student1.getGpa());
    }

}
