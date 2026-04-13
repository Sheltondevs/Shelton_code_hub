import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int cat, exam, total;
        String grade;

        // Input CAT marks with validation
        System.out.print("Enter CAT marks (0 - 30): ");
        cat = in.nextInt();

        if (cat < 0 || cat > 30) {
            System.out.println("Invalid CAT mars!! Marks can only be as from 0 to 30");
            return;
        }

        // Input Exam marks with validation
        System.out.print("Enter Exam marks (0 - 70): ");
        exam = in.nextInt();

        if (exam < 0 || exam > 70) {
            System.out.println("Invalid Exam marks! Marks can only be as from 0 to 70");
            return;
        }

        // Compute total
        total = cat + exam;

        // Determine grade
        if (total >= 70) {
            grade = "A";
        } else if (total >= 60) {
            grade = "B";
        } else if (total >= 50) {
            grade = "C";
        } else if (total >= 40) {
            grade = "D";
        } else {
            grade = "E";
        }

        // Output results
        System.out.println("\n----- RESULTS -----");
        System.out.println("CAT Marks: " + cat);
        System.out.println("Exam Marks: " + exam);
        System.out.println("Total Marks: " + total);
        System.out.println("Grade: " + grade);
    }
}