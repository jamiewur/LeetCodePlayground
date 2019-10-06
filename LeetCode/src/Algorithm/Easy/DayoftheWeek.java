package Algorithm.Easy;

public class DayoftheWeek {
    public String dayOfTheWeek(int day, int month, int year) {
        if (month == 1 || month == 2) {
            month += 12;
            --year;
        }
        int w =  (day + 2 * month + 3 * (month + 1) / 5 + year + year / 4 - year / 100 + year / 400 + 1) % 7;
        String week = "null";
        switch (w){
            case 0: week = "Sunday";
                break;
            case 1: week = "Monday";
                break;
            case 2: week = "Tuesday";
                break;
            case 3: week = "Wednesday";
                break;
            case 4: week = "Thursday";
                break;
            case 5: week = "Friday";
                break;
            case 6: week = "Saturday";
                break;
        }
        return week;
    }
}
