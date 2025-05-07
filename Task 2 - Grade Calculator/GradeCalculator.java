import java.util.*;
public class GradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("----- Student Grade Calculator -----");
        System.out.print("Enter the no.of subj: ");
        int numSub = sc.nextInt();
        if (numSub <= 0) {
            System.out.println("Invalid no.of subj.");
            return;
        }
        int[] marks = new int[numSub];
        int totMarks = 0;
        for (int m = 0; m < numSub; m++) {
            System.out.print("Enter marks for subj " + (m + 1) + " (out of 100): ");
            marks[m] = sc.nextInt();
            if (marks[m] < 0 || marks[m] > 100) {
                System.out.println("Invalid marks . Please enter values b/w 0 and 100.");
                return;
            }
            totMarks += marks[m];
        }
        double avg = (double) totMarks / numSub;
        char grade;
        if (avg >= 90) {
            grade = 'A';
        } else if (avg >= 80) {
            grade = 'B';
        } else if (avg >= 70) {
            grade = 'C';
        } else if (avg >= 60) {
            grade = 'D';
        } else if (avg >= 50) {
            grade = 'E';
        } else {
            grade = 'F';
        }
        System.out.println("\n...... Result........");
        System.out.println("Total Marks: " + totMarks + "/" + (numSub * 100));
        System.out.printf("Avg Percent: %.2f%%\n", avg);
        System.out.println("Grade: " + grade);
    }
}
