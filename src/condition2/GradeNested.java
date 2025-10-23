package condition2;

public class GradeNested {
    
    public String getGradeInfo(String subject, int score) {
        String grade;

        if(subject.equalsIgnoreCase("Math")) {
            if (score >= 90) {
                grade =  "A";
            } else if (score >= 75) {
                grade = "B";
            } else if (score >= 60) {
                grade = "C";
            } else {
                grade = "F";
            }
            return "Subject: Math, Grade: " + grade;

        } else if (subject.equalsIgnoreCase("English")) {
            if (score >= 85){
                grade = "A";
            } else if (score >= 70) {
                grade = "B";
            } else if (score >= 55) {
                grade = "C";
            } else {
                grade = "F";
            }
            return "Subject: English, Grade: " + grade;

        } else {
            return "Subject: Unknown, Grade: N/A";
        }
    }
}
