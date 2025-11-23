
/*
Given marks of a student, print on the screen:

Grade A if marks >= 90
Grade B if marks >= 70
Grade C if marks >= 50
Grade D if marks >= 35
Fail, otherwise.
 */
import java.util.Scanner;

public class pabi {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        char grade;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your marks:");
        int marks = sc.nextInt();
        if (marks >= 90) {
            grade = 'A';
        } else if (marks >= 70) {
            grade = 'B';
        } else if (marks >= 50) {
            grade = 'C';
        } else if (marks >= 35) {
            grade = 'D';
        } else {
            grade='F';
        }
        System.out.println("Garde :"+grade);
        sc.close();
    }
}
