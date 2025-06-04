import java.util.ArrayList;

public class WhatIf {
    private int finalGrade;
    private String courseName;
    private ArrayList<Integer> grades;

    public WhatIf() {
        finalGrade = 0;
        courseName = "";
        grades = new ArrayList<>();
    }
    public WhatIf(String course, ArrayList<Integer> gradesList) {
        finalGrade = 0;
        courseName = course;
        grades = gradesList;
    }
}