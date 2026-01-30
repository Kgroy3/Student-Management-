import java.util.*;

public class StudentDriver {

    public static void main(String[] args) {

        // 1. Store students in ArrayList
        List<Student> students = new ArrayList<>();
        students.add(new Student(101, "Amit", 20, 85.5));
        students.add(new Student(102, "Neha", 21, 91.2));
        students.add(new Student(103, "Rahul", 22, 78.4));
        students.add(new Student(101, "Amit", 20, 85.5)); // duplicate

        // 2. Remove duplicates using Set
        Set<Student> uniqueStudents = new HashSet<>(students);
        students = new ArrayList<>(uniqueStudents);

        // 3. Use HashMap for fast lookup
        Map<Integer, Student> studentMap = new HashMap<>();
        for (Student s : students) {
            studentMap.put(s.getId(), s);
        }

        // 4. Sorting using Comparator (by marks descending)
        students.sort(Comparator.comparingDouble(Student::getMarks).reversed());

        // 5. Formatted report
        printReport(students);

        // 6. Fast lookup demo
        System.out.println("\n🔍 Lookup Student ID 102:");
        System.out.println(studentMap.get(102));
    }

    private static void printReport(List<Student> students) {
        System.out.println("\n===== STUDENT REPORT =====");
        System.out.printf("%-5s %-15s %-5s %-6s\n", "ID", "Name", "Age", "Marks");
        System.out.println("--------------------------------");

        // 7. Enhanced for-loop
        for (Student s : students) {
            System.out.println(s);
        }
    }
}
