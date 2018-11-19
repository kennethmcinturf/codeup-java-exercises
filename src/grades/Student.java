package grades;

import util.Input;

import java.util.ArrayList;
import java.util.HashMap;

public class Student {
    private String name;
    private ArrayList<Integer> grade;
    private HashMap<String,String> attendance;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student(String name) {
        this.name = name;
        this.grade = new ArrayList<>();
        this.attendance = new HashMap<>();
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


    public ArrayList<Integer> getGrade() {
        return grade;
    }

    public void addAttendance(String date, String attendance){
        Input input = new Input();
        if(date.length() != 9){
            String newDate = input.getString("Please Provide a valid format ie xx/xx/xxxx");
            addAttendance(newDate,attendance);
        }else if(!attendance.toLowerCase().equals("A")|| !attendance.toLowerCase().equals("P")){
            String newAttendance = input.getString("Invalid attendance entry, please input either A for absent or P for present");
            addAttendance(date,attendance);
        }
        this.attendance.put(date,attendance);
    }

//    public Double attendanceAverage(){
//        ArrayList<String> attendanceAverage = attendance.g;
//        if ()
//    }

    public HashMap<String, String> getAttendance() {
        return attendance;
    }

    public static void main(String[] args) {
        Student student = new Student("KC");
        student.addGrade(4);
        student.addGrade(4);
        student.addGrade(4);
        System.out.println(student.getGradeAverage());
    }
}
