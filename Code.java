import java.util.Scanner;

public class StudentGrade {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("🎓 STUDENT GRADE CALCULATION 🎓");
        System.out.println("--------------------------------");

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter marks for Subject 1: ");
        int m1 = sc.nextInt();

        System.out.print("Enter marks for Subject 2: ");
        int m2 = sc.nextInt();

        System.out.print("Enter marks for Subject 3: ");
        int m3 = sc.nextInt();

        int total = m1 + m2 + m3;
        double average = total / 3.0;

        System.out.println("\n📘 STUDENT REPORT 📘");
        System.out.println("Name    : " + name);
        System.out.println("Total   : " + total);
        System.out.println("Average : " + average);

        if (average >= 90) {
            System.out.println("Grade   : A+ 🌟");
        } else if (average >= 75) {
            System.out.println("Grade   : A 👍");
        } else if (average >= 60) {
            System.out.println("Grade   : B 🙂");
        } else if (average >= 50) {
            System.out.println("Grade   : C 😐");
        } else {
            System.out.println("Grade   : FAIL ❌");
        }

        sc.close();
    }
}
