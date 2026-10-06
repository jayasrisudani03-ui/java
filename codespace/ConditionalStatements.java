public class ConditionalStatements {
    public static void main(String[] args) {

        // 1. if statement
        int age = 18;

        if (age >= 18) {
            System.out.println("You are eligible to vote.");
        }

        // 2. if-else statement
        int number = 10;

        if (number % 2 == 0) {
            System.out.println("The number is even.");
        } else {
            System.out.println("The number is odd.");
        }

        // 3. else-if statement
        int marks = 75;

        if (marks >= 90) {
            System.out.println("Grade: A+");
        } else if (marks >= 75) {
            System.out.println("Grade: A");
        } else if (marks >= 60) {
            System.out.println("Grade: B");
        } else if (marks >= 50) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: Fail");
        }
    }
}