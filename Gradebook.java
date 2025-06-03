import java.util.ArrayList;

public class Gradebook () {
    private int finalGrade;
    private String courseName;
    private ArrayList grades;

    public GradeBook() {
        finalGrade = 0;
        courseName = "";
    }
    public GradeBook(String course, ArrayList gradesList) {
        finalGrade = 0;
        courseName = course;
        grades = gradesList;
    }
}