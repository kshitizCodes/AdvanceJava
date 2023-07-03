package Lab4.QN2;

import Lab4.QN1.Student;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Kshitiz Wagle");
        student.setAge(21);
        student.setGrade(3.2);
        System.out.printf("%-20s %-20s %-20s\n", "Name", "Age", "Grade");
        System.out.printf("%-20s %-20d %-20.2f\n", student.getName(), student.getAge(), student.getGrade());
    }
}
