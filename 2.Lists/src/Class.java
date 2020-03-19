import java.util.ArrayList;
import java.util.List;

public class Class {

    String name;
    List<String> studentsList = new ArrayList<>();

    void addStudent(String name) {
        studentsList.add(name);
    }
    void displayStudents() {
        for(String student : studentsList) {
            System.out.print(student +", ");
        }
    }
    int getGirlsCount() {
        char letter = 'a';
        int counter = 0;
        for(String student : studentsList) {
            if (letter == student.charAt(student.length()-1)) {
                counter = counter + 1;
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        Class student = new Class();
        student.addStudent("Paweł");
        student.addStudent("Tomek");
        student.addStudent("Wojtek");
        student.addStudent("Ela");
        student.addStudent("Ola");
        student.addStudent("Kasia");
        student.addStudent("Jola");
        student.addStudent("Bartek");
        System.out.print("Students: ");
        student.displayStudents();
        System.out.println("\nThe Class has "+student.getGirlsCount()+" girls.");
    }
}
