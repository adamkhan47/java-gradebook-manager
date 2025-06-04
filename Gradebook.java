import java.util.ArrayList;

public class Gradebook {
    private int finalGrade;
    private String courseName;
    private ArrayList<Integer> grades;

    public Gradebook() {
        finalGrade = 0;
        courseName = "";
        grades = new ArrayList<>();
    }
    public Gradebook(String course, ArrayList<Integer> gradesList) {
        finalGrade = 0;
        courseName = course;
        grades = gradesList;
    }
}