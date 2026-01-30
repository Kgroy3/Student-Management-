import java.util.Objects;

public class Student {
    private int id;
    private String name;
    private int age;
    private double marks;

    public Student(int id, String name, int age, double marks) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.marks = marks;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public int getAge() { return age; }
    public double getMarks() { return marks; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return id == student.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return String.format("%-5d %-15s %-5d %-6.2f",
                id, name, age, marks);
    }
}
