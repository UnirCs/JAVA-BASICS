package lesson1.control;

public class ControlFlowProgram {

    public static void main(String[] args) {

        String pass = "Exam Passed";
        String fail = "Exam Failed";

        int mark = 5;
        String text;

        if (mark >= 5) {
            text = pass;
        } else {
            text = fail;
        }

        if("Exam Passed".equals(text)) {
            System.out.println("You did it!");
        } else  if ("Exam Failed".equals(text)) {
            System.out.println("Try again...");
        } else {
            System.out.println("Weird situation...");
        }

        System.out.println(mark >= 8 ? "Wow you did a great job!" : "Not bad :D");

        //Switch statement

        int day = 3;
        String dayString;

        switch(day) {
            case 1:
                dayString = "Monday";
                break;
            case 2:
                dayString = "Tuesday";
                break;
            case 3:
                dayString = "Wednesday";
                break;
            case 4:
                dayString = "Thursday";
                break;
            case 5:
                dayString = "Friday";
                break;
            case 6:
                dayString = "Saturday";
                break;
            case 7:
                dayString = "Sunday";
                break;
            default:
                dayString = "Invalid day";
                break;
        }

        System.out.println(dayString);
    }
}
