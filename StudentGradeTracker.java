import java.util.ArrayList;
import java.util.Scanner;

public class StudentGradeTracker {

    // Step 1: Create a Student class to hold name and grade
    static class Student {
        String name;
        int grade;

        Student(String name, int grade) {
            this.name = name;
            this.grade = grade;
        }
    }
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);

        // Step 2: Use ArrayList to store students
        ArrayList<Student> students = new ArrayList<>();

        // Step 3: Get number of students
        System.out.print("Enter number of students: ");
        int numberOfStudents = Scanner.nextInt();
        Scanner.nextLine();  // Consume newline

        // Step 4: Input each student's name and grade
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.print("Enter student name: ");
            String name = Scanner.nextLine();

            System.out.print("Enter grade for " + name + ": ");
            int grade = Scanner.nextInt();
            Scanner.nextLine();  // Consume newline

            students.add(new Student(name, grade));
        }

        // Step 5: Initialize values for calculations
        int total = 0;
        int highest = Integer.MIN_VALUE;
        int lowest = Integer.MAX_VALUE;
        String topStudent = "";
        String bottomStudent = "";

        // Step 6: Loop through list to calculate
        for (Student s : students) {
            total += s.grade;

            if (s.grade > highest) {
                highest = s.grade;
                topStudent = s.name;
            }

            if (s.grade < lowest) {
                lowest = s.grade;
                bottomStudent = s.name;
            }
        }

        // Step 7: Calculate average
        double average = (double) total / students.size();

        // Step 8: Display Summary Report
        System.out.println("\n=== Student Grade Report ===");
        for (Student s : students) {
            System.out.println(s.name + " - " + s.grade);
        }

        System.out.println("\nAverage Score: " + String.format("%.2f", average));
        System.out.println("Highest Score: " + highest + " (by " + topStudent + ")");
        System.out.println("Lowest Score: " + lowest + " (by " + bottomStudent + ")");
    }
}
    


