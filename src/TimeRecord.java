public class TimeRecord {
    public static void main(String[] args) {
        TimeRecord time = new TimeRecord("08:30", "17:15", "30");
        System.out.println(time.calculateHours(time));
    }
    private String startingTime;
    private String endingTime;
    private String breakDeduction;

    public static double calculateHours(TimeRecord timeRecord){
        double startHours = Integer.parseInt(timeRecord.getStartingTime().substring(0,2));
        double startMins = Integer.parseInt(timeRecord.getStartingTime().substring(3));
        double endingHour = Integer.parseInt(timeRecord.getEndingTime().substring(0,2));
        double endingMins = Integer.parseInt(timeRecord.getEndingTime().substring(3));
        double startPortion = startMins/60;
        double endPortion = endingMins/60;
        double calculateMins = startPortion - endPortion;
        double calculateHours = endingHour - startHours;
        double calculateBreak = Integer.parseInt(timeRecord.getBreakDeduction());
        double endBreak = calculateBreak/60;
        double calculateTime = calculateHours + calculateMins - endBreak;
        return calculateTime;
    }

    public String getStartingTime() {
        return startingTime;
    }

    public void setStartingTime(String startingTime) {
        this.startingTime = startingTime;
    }

    public String getEndingTime() {
        return endingTime;
    }

    public void setEndingTime(String endingTime) {
        this.endingTime = endingTime;
    }

    public String getBreakDeduction() {
        return breakDeduction;
    }

    public void setBreakDeduction(String breakDeduction) {
        this.breakDeduction = breakDeduction;
    }

    public TimeRecord(String startingTime, String endingTime, String breakDeduction) {
        this.startingTime = startingTime;
        this.endingTime = endingTime;
        this.breakDeduction = breakDeduction;
    }
}
