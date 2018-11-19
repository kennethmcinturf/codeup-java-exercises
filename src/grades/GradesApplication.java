package grades;

import util.Input;

import java.util.HashMap;

public class GradesApplication {
    public static void main(String[] args) {
        Student studentOne = new Student("Pebo");
        Student studentTwo = new Student("Ryan");
        Student studentThree = new Student("Matt");
        Student studentFour = new Student("KC");

        studentOne.addGrade(94);
        studentOne.addGrade(72);
        studentOne.addGrade(85);

        studentTwo.addGrade(44);
        studentTwo.addGrade(82);
        studentTwo.addGrade(92);

        studentThree.addGrade(78);
        studentThree.addGrade(87);
        studentThree.addGrade(90);

        studentFour.addGrade(78);
        studentFour.addGrade(67);
        studentFour.addGrade(95);

        HashMap<String, Student> students = new HashMap<>();

        students.put("Pebo1", studentOne);
        students.put("RyGuy", studentTwo);
        students.put("MattyIce", studentThree);
        students.put("Kmac", studentFour);

        boolean continueNames = true;
        Input input = new Input();
        do {
            String studentSearch = input.getString("What student would you like to see more information on? Or enter all to see all grades\nOr full report to see a comprehensive list of grades");
            Student searchedStudent = students.get(studentSearch);
            if (studentSearch.toLowerCase().equals("all")) {
                System.out.println("Pebo's grades are:");
                System.out.println(students.get("Pebo1").getGrade());
                System.out.println("Matt's grades are:");
                System.out.println(students.get("MattyIce").getGrade());
                System.out.println("Ryans's grades are:");
                System.out.println(students.get("RyGuy").getGrade());
                System.out.println("KC's grades are:");
                System.out.println(students.get("Kmac").getGrade());
                Boolean seeAllGrades = input.yesNO("Would you like to see the overall class GPA?");
                if (seeAllGrades) {
                    Double gradePointAverage = ((students.get("Kmac").getGradeAverage()) + (students.get("Pebo1").getGradeAverage()) + (students.get("MattyIce").getGradeAverage()) + (students.get("RyGuy").getGradeAverage())) / (4);
                    System.out.println("The cumulative grade point average is " + gradePointAverage);
                }
            } else if (studentSearch.toLowerCase().equals("full report")) {
                System.out.println(students.get("Pebo1").getName() + "," + "Pebo1" + " Average is " + students.get("Pebo1").getGradeAverage());
                System.out.println(students.get("MattyIce").getName() + "," + "MattyIce" + " Average is " + students.get("MattyIce").getGradeAverage());
                System.out.println(students.get("RyGuy").getName() + "," + "RyGuy" + " Average is " + students.get("RyGuy").getGradeAverage());
                System.out.println(students.get("Kmac").getName() + "," + "Kmac" + " Average is " + students.get("Kmac").getGradeAverage());
            } else if (searchedStudent == null) {
                System.out.println("Sorry, no student found with the gihub username of " + studentSearch + ".");
            } else {
                System.out.println(searchedStudent + " grades to this point are:");
                for (int i = 0; i < searchedStudent.getGrade().size(); i++) {
                    System.out.println(searchedStudent.getGrade().get(i));
                }
                System.out.println(searchedStudent + " average grade is " + searchedStudent.getGradeAverage());
            }
            continueNames = input.yesNO("Would you like to see another student?");
        } while (continueNames);
        System.out.println("Bye!! Have a beautiful time!!");
    }
}
