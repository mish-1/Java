import java.util.ArrayList;
import java.util.List;

class Student {
    String name;
    List<Double> grades;

    Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }

    void addGrade(double grade) {
        grades.add(grade);
    }

    double calculateAverage() {
        if (grades.size() == 0) {
            return 0;
        }

        double sum = 0;
        for (double g : grades) {
            sum += g;
        }

        return sum / grades.size();
    }

    void displayStudentDetails() {
        System.out.println("Name: " + name);
        System.out.println("Grades: " + grades);
        System.out.println("Average: " + calculateAverage());
        System.out.println();
    }
}

class GradeManager {
    List<Student> students = new ArrayList<>();

    void addStudent(Student student) {
        students.add(student);
    }

    Student findStudentByName(String name) {
        for (Student s : students) {
            if (s.name.equalsIgnoreCase(name)) {
                return s;
            }
        }
        return null;
    }

    void displayAllStudents() {
        for (Student s : students) {
            s.displayStudentDetails();
        }
    }
}

public class studentgrade{
    public static void main(String[] args) {

        GradeManager manager = new GradeManager();

        Student s1 = new Student("Mishti");
        Student s2 = new Student("Rahul");

        manager.addStudent(s1);
        manager.addStudent(s2);

        s1.addGrade(85);
        s1.addGrade(90);
        s1.addGrade(80);

        s2.addGrade(70);
        s2.addGrade(75);
        s2.addGrade(65);

        System.out.println("All Students:");
        manager.displayAllStudents();

        System.out.println("Searching for Mishti...");
        Student result = manager.findStudentByName("Mishti");

        if (result != null) {
            result.displayStudentDetails();
        } else {
            System.out.println("Student not found.");
        }
    }
}
