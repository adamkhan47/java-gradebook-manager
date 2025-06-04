import java.util.Arrays;

public class WhatIf {
    private int finalGrade;
    private String courseName;
    private int[] grades;

    public WhatIf() {
        finalGrade = 0;
        courseName = "";
    }
    public WhatIf(String course, int[] gradesList) {
        finalGrade = 0;
        courseName = course;
        grades = gradesList;
    }

}