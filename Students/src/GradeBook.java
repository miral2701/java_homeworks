import java.util.HashMap;
import java.util.Map;

public class GradeBook {

    private HashMap<String, Student> students;

    public GradeBook() {
        students = new HashMap<>();
    }

    // Додавання студента
    public void addStudent(Student student) {
        students.put(student.getId(), student);
    }

    // Видалення студента за ID
    public void removeStudent(String id) {
        students.remove(id);
    }

    // Пошук студента за ID
    public Student findStudent(String id) {
        return students.get(id);
    }

    // Виведення всіх студентів
    public void printAllStudents() {
        if (students.isEmpty()) {
            System.out.println("Список студентів порожній.");
            return;
        }

        for (Map.Entry<String, Student> entry : students.entrySet()) {
            System.out.println(entry.getValue());
        }
    }
}
