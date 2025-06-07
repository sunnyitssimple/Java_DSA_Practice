package Assignment.Assignment03;

import java.util.Scanner;

public class CGPAJavaProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of subjects: ");
        int n = sc.nextInt();
        double totalGradePoints = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter grade point for subject " + i + ": ");
            double gradePoint = sc.nextDouble();
            totalGradePoints += gradePoint;
        }

        double cgpa = totalGradePoints / n;
        System.out.println("CGPA is: " + cgpa);
    }
}
