package grades;

import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<Integer> grade;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student(String name) {
        this.name = name;
        this.grade = new ArrayList<>();
    }

    public void addGrade(int grade){
        this.grade.add(grade);
    }

    public double getGradeAverage(){
        int addedTogether = 0;
        for (int i =0; i < this.grade.size(); i++){
            addedTogether = addedTogether + this.grade.get(i);
        }
        return addedTogether/this.grade.size();
    }


    public static void main(String[] args) {
        Student student = new Student("KC");
        student.addGrade(4);
        student.addGrade(4);
        student.addGrade(4);
        System.out.println(student.getGradeAverage());
    }
}
