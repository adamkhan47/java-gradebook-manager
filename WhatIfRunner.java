import java.util.Scanner;

public class WhatIfRunner {
    public static void main(String[] args) {
        System.out.println("Welcome to the What if grade calculator for java.");
        System.out.println("This java program will calculate an average grade based on the formative and summative grades you provide.");
        System.out.println("You can enter grades, and the program will compute the average grade for you.");
        System.out.println("Enter a course name to keep track of your grades for that course.");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the course name: ");
        String courseName = scanner.nextLine();

        // make it so that we can put in a integer and it converts to double k
        // actually i think java does that automatically
        System.out.println("Now enter your *summative* grades by using the format in the example below:");
        System.out.println("Example: 100, 99, 39, 50, 100");
        String arraySummativeString = scanner.nextLine();
        System.out.println("Now enter your *formative* grades by using the format in the example below:");
        System.out.println("Example: 100, 99, 39, 50, 100");
        String arrayFormativeString = scanner.nextLine();

        int countofCommasSummative = getInstancesOfLetter(arraySummativeString, ',') + 1;
        int countofCommasFormative = getInstancesOfLetter(arrayFormativeString, ',') + 1;

        double[] summativeAwway = new double[countofCommasSummative];
        double[] formativeAwway = new double[countofCommasFormative];

        String[] tempsummativeAwway = arraySummativeString.split(",");
        String[] tempformativeAwway = arrayFormativeString.split(",");

        for (int i = 0; i<tempsummativeAwway.length; i++) {
            summativeAwway[i] = Double.parseDouble(tempsummativeAwway[i]);
        }
        for (int i = 0; i<tempformativeAwway.length; i++) {
            formativeAwway[i] = Double.parseDouble(tempformativeAwway[i]);
        }

        WhatIf test = new WhatIf(courseName, summativeAwway, formativeAwway);
        test.calcAverage();
        System.out.println(test);

    }
    public static int getInstancesOfLetter(String stringtocombthrough, char woah) {
        int count = 0;
        for (int i = 0; i<stringtocombthrough.length(); i++) {
            if (stringtocombthrough.charAt(i) == (woah)) {
                count++;
            }
        }
        return count;
    }
}
