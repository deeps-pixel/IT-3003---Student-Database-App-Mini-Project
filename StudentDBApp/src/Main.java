import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentDAO dao = new StudentDAO();

        while (true) {
            System.out.println("\n--- Student Database Menu ---");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Update Student Age");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();

            try {
                switch (choice) {
                    case 1:
                        System.out.print("Enter name: ");
                        String name = sc.next();
                        System.out.print("Enter age: ");
                        int age = sc.nextInt();
                        dao.addStudent(new Student(name, age));
                        System.out.println("Student added.");
                        break;
                    case 2:
                        List<Student> students = dao.getAllStudents();
                        for (Student s : students) {
                            System.out.println(s.getId() + " | " + s.getName() + " | " + s.getAge());
                        }
                        break;
                    case 3:
                        System.out.print("Enter student ID: ");
                        int id = sc.nextInt();
                        System.out.print("Enter new age: ");
                        int newAge = sc.nextInt();
                        dao.updateStudentAge(id, newAge);
                        System.out.println("Student updated.");
                        break;
                    case 4:
                        System.out.print("Enter student ID to delete: ");
                        int delId = sc.nextInt();
                        dao.deleteStudent(delId);
                        System.out.println("Student deleted.");
                        break;
                    case 5:
                        System.out.println("Exiting...");
                        return;
                    default:
                        System.out.println("Invalid option.");
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}
