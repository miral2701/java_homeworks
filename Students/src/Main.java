public class Main {
    public static void main(String[] args) {

        GradeBook gradeBook = new GradeBook();

        // Створення студентів
        Student s1 = new Student("001", "Олена");
        s1.addGrade(10);
        s1.addGrade(9);

        Student s2 = new Student("002", "Іван");
        s2.addGrade(8);
        s2.addGrade(11);

        // Додавання до GradeBook
        gradeBook.addStudent(s1);
        gradeBook.addStudent(s2);

        // Виведення всіх студентів
        System.out.println("=== Всі студенти ===");
        gradeBook.printAllStudents();

        // Пошук студента
        System.out.println("\n=== Пошук студента (ID: 001) ===");
        System.out.println(gradeBook.findStudent("001"));

        // Видалення студента
        gradeBook.removeStudent("002");

        // Знову виводимо всіх
        System.out.println("\n=== Після видалення ===");
        gradeBook.printAllStudents();
    }
}
