import java.util.LinkedHashMap;

public class LinkedHashMapExample {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> studentScores = new LinkedHashMap<>();

        studentScores.put("Alice", 85);
        studentScores.put("Bob", 90);
        studentScores.put("Charlie", 78);

        int score = studentScores.get("Bob");
        System.out.println("Bob's Score: " + score);

        System.out.println("Student Scores: " + studentScores);
    }
}
