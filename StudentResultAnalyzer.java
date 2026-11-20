
import java.util.Scanner;

public class StudentResultAnalyzer {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Student name
        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        // Enter marks
        System.out.print("Enter Subject 1 marks: ");
        double m1 = sc.nextDouble();

        System.out.print("Enter Subject 2 marks: ");
        double m2 = sc.nextDouble();

        System.out.print("Enter Subject 3 marks: ");
        double m3 = sc.nextDouble();

        // Validate marks
        if (m1 < 0 || m1 > 100 ||
            m2 < 0 || m2 > 100 ||
            m3 < 0 || m3 > 100) {

            System.out.println("Invalid marks!");
            sc.close();
            return;
        }

        // Calculate total and average
        double total = m1 + m2 + m3;
        double average = total / 3;

        // Check pass
        boolean pass = m1 >= 35 &&
                       m2 >= 35 &&
                       m3 >= 35;

        // Check distinction and award
        boolean distinction = pass && average >= 75;
        boolean award = pass && average >= 90;

        // Display result
        System.out.println("\n--- STUDENT RESULT ---");

        System.out.println("Name: " + name);
        System.out.println("Total Marks: " + total);
        System.out.printf("Average: %.2f%%\n", average);

        if (pass)
            System.out.println("Result: PASS");
        else
            System.out.println("Result: FAIL");

        if (distinction)
            System.out.println("Distinction: YES");
        else
            System.out.println("Distinction: NO");

        if (award)
            System.out.println("Special Award: YES");
        else
            System.out.println("Special Award: NO");

        sc.close();
    }
}
