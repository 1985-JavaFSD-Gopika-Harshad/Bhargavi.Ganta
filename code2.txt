import java.util.LinkedHashMap;
import java.util.Map;

public class GradeManager {
    private LinkedHashMap<String, Double> grades; // Key: student ID, Value: grade

    public GradeManager() {
        grades = new LinkedHashMap<>();
    }


    public void addGrade(String studentId, double grade) {
        grades.put(studentId, grade);
    }


    public Double getGrade(String studentId) {
        return grades.get(studentId);
    }

   
    public void displayGrades() {
        System.out.println("Student Grades:");
        for (Map.Entry<String, Double> entry : grades.entrySet()) {
            System.out.println("Student ID: " + entry.getKey() + ", Grade: " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        GradeManager manager = new GradeManager();

        manager.addGrade("S001", 85.5);
        manager.addGrade("S002", 90.0);
        manager.addGrade("S003", 78.5);

   
        manager.displayGrades();

       
        System.out.println("Grade for S002: " + manager.getGrade("S002"));


        manager.addGrade("S002", 92.0);
        System.out.println("Updated grade for S002: " + manager.getGrade("S002"));
    }
}
