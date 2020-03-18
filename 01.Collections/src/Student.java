import java.util.HashMap;
import java.util.Map;

public class Student {


    String name;
    int id;
    Map<String, Double> gradesMap = new HashMap<>();

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }
    void addGrade(String subject, double grade){
        gradesMap.put(subject,grade);
    }
    double calculateAverage() {
        double average = 0;
        for(Double grade: gradesMap.values()) {
            average += grade;
        }
        return average / gradesMap.size();
    }

    @Override
    public String toString() {
        return "Student " + name + ", id: " + id;
    }

    public static void main(String[] args) {
        Student student = new Student("Pawel",10);
        student.addGrade("Biologia", 5);
        student.addGrade("Angielski", 3);
        student.addGrade("Fizyka", 3.5);
        student.addGrade("Matematyka", 3.5);
        Student student2 = new Student("Tomek", 5);
        student2.addGrade("Biologia", 2.5);
        student2.addGrade("Angielski", 3);
        student2.addGrade("Fizyka", 2);
        student2.addGrade("Matematyka", 4);

        System.out.println(student.toString()+ ", has avg.: "+student.calculateAverage());
        System.out.println(student2.toString()+ ", has avg.: "+student2.calculateAverage());


    }
}