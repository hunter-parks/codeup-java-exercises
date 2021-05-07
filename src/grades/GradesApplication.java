package grades;

import java.util.HashMap;
import java.util.Map;

public class GradesApplication {
    public static void main(String[] args) {
        HashMap <String , Student> students = new HashMap<>();

        // Student 1
        Student jimi = new Student("Jimi Hendrix");
        students.put("theVoodooChild", jimi);

        // Student 2
        Student eric = new Student("Eric Clapton");
        students.put("Layla", eric);

        // Student 3
        Student jimmy = new Student("Jimmy Page");
        students.put("the_Zeppelin", jimmy);

        // Student 4
        Student mac = new Student("Mac Miller");
        students.put("Most_Dope92", mac);

        System.out.println(students);

        // GRADES OF EACH STUDENT

        // Student 1
        jimi.addGrade(95);
        jimi.addGrade(89);
        jimi.addGrade(45);
        jimi.addGrade(99);
        jimi.getGradeAverage();

        // Student 2
        eric.addGrade(99);
        eric.addGrade(87);
        eric.addGrade(94);
        eric.addGrade(100);
        eric.getGradeAverage();

        // Student 3
        jimmy.addGrade(78);
        jimmy.addGrade(97);
        jimmy.addGrade(87);
        jimmy.addGrade(90);
        jimmy.getGradeAverage();

        // Student 4
        mac.addGrade(68);
        mac.addGrade(97);
        mac.addGrade(89);
        mac.addGrade(80);
        mac.getGradeAverage();

    // Setting the keys for the Usernames of the students
    String[] listOfTheKeys = students.keySet().toArray(new String[0]);
        for (String key : listOfTheKeys) {
            System.out.println("key = " + key);
        }


    }
}
