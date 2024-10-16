import java.util.HashMap;

public class StudentGrades {
    public static void main(String[] args) {
        
        HashMap<String, String> studentGrades = new HashMap<>();


        studentGrades.put("John", "A");
        studentGrades.put("Emily", "B");
        studentGrades.put("Alex", "A+");
        studentGrades.put("Sara", "B+");

        String johnGrade = studentGrades.get("John");
        System.out.println("John's grade: " + johnGrade);

        studentGrades.put("Emily", "A");
        System.out.println("Emily's updated grade: " + studentGrades.get("Emily"));
    }
}