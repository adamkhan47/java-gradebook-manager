import java.util.Scanner;

public class WhatIfRunner {
    public static void main(String[] args) {
        System.out.println("Welcome to the What if grade calculator for java.");
        System.out.println("This java program will calculate an average grade based on the formative and summative grades you provide.");
        System.out.println("You can enter grades, and the program will compute the average grade for you.");
        System.out.println("You can also enter a course name to keep track of your grades for that course.");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the course name: ");
        String courseName = scanner.nextLine();

        // make it so that we can put in a integer and it converts to double k
        // actually i think java does that automatically
        System.out.println("Now enter your summative grades by using the format in the example below:");
        System.out.println("Example: 100, 99, 39, 50, 100");
        System.out.println("You can also just put in \"Z\" or \"X\" to signify if its a late or exempt assignment.");
        String arrayString = scanner.nextLine();

        Helperstuff helperClass = new Helperstuff();
        int countofCommas = helperClass.getInstancesOfLetter(arrayString, ',');

        int[] awway = new int[countofCommas];

        WhatIf test = new WhatIf(courseName, awway);

    }
}
