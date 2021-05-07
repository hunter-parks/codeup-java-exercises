package grades;

import java.util.ArrayList;

// the private properties of the student name/ grades
public class Student {
    private String name;
    private ArrayList<Integer> grades;

    public Student(String name) {
        this.name = name;
        // initializes grade as empty ArrayList
        this.grades = new ArrayList<>();
    }

    // returns the student's name
    public String getName() {
        System.out.println(this.name + " " + this.grades);
        return this.name;
    }

    // adds the given grade to the grades property
    public void addGrade(int grade) {
        this.grades.add(grade);
    }

    // returns the average of the students grades
    public double getGradeAverage(){
        double totalGrade = 0;

        for ( double studentGrade : grades) {
            totalGrade += studentGrade;
        }

        double studentAverage = totalGrade/grades.size();
        System.out.println(this.getName() + "," + " your average is: " + studentAverage);

        return studentAverage;
    }

    // Adding main method to test the Student class
    public static void main(String[] args) {
        Student hunter = new Student("Hunter");
        hunter.addGrade(75);
        hunter.addGrade(88);
        hunter.addGrade(98);
        hunter.addGrade(55);
        hunter.getGradeAverage();
    }



}


