import util.Input;

import java.util.HashMap;
import java.util.HashSet;

public class TimeSheetApp extends TimeRecord {
    public static void main(String[] args) {
        TimeSheetApp.weeklyPay();
    }

    public TimeSheetApp(String startingTime, String endingTime, String breakDeduction) {
        super(startingTime, endingTime, breakDeduction);
    }

    public static void TimeSheetAppInteraction(String dayOfWeek){
        Input input = new Input();
        String startingTime = input.getString("What is the employees starting time?");
        String endingTime = input.getString("What is the employees ending time?");
        String breakDeduction = input.getString("How long was there break?");
        TimeSheetApp timeSheetApp = new TimeSheetApp(startingTime,endingTime,breakDeduction);
        timeRecordHashMap.put(dayOfWeek,timeSheetApp);
    }

    public static void weeklyPay(){
        Input input = new Input();
        System.out.println("Pay Monday");
        TimeSheetAppInteraction("Monday");
        System.out.println("Pay Tuesday");
        TimeSheetAppInteraction("Tuesday");
        System.out.println("Pay Wednesday");
        TimeSheetAppInteraction("Wednesday");
        System.out.println("Pay Thursday");
        TimeSheetAppInteraction("Thursday");
        System.out.println("Pay Friday");
        TimeSheetAppInteraction("Friday");
        Double weeklyPay = calculateHours(timeRecordHashMap.get("Monday")) + calculateHours(timeRecordHashMap.get("Tuesday")) + calculateHours(timeRecordHashMap.get("Wednesday"))
                + calculateHours(timeRecordHashMap.get("Thursday")) + calculateHours(timeRecordHashMap.get("Friday"));
        System.out.println(weeklyPay);
    }

    public static HashMap<String, TimeSheetApp> timeRecordHashMap = new HashMap<>();
}


