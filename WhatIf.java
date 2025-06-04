import java.util.Arrays;

public class WhatIf {
    private double finalGrade;
    private String courseName;
    private double[] summativegrades;
    private double[] formativegrades;

    public WhatIf() {
        finalGrade = 0;
        courseName = "";
    }
    public WhatIf(String course, double[] fgradesList, double[] sgradesList) {
        finalGrade = 0;
        courseName = course;
        summativegrades = fgradesList;
        formativegrades = sgradesList;
    }

    public void calcAverage() {
        double formtemp = 0;
        for (int i = 0; i<formativegrades.length; i++) {
            formtemp = formtemp + formativegrades[i];
        }
        double sumtemp = 0;
        for (int i = 0; i<summativegrades.length; i++) {
            sumtemp = sumtemp + summativegrades[i];
        } 
        finalGrade = (formtemp * 0.3) + (sumtemp * 0.7);
    }
    public String toString() {
        return ("The final grade after averaging everything in " + courseName + " is a " + finalGrade);
    }

}