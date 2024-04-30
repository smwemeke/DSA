package HackerrankQns;

import java.io.*;

public class TimeConversion {

    public static void main(String[] args) throws IOException {
       String s = "12:30:05AM";

       String a = "12:45:09PM";

        String result = Result.timeConversion(s);
        System.out.println(result);

        String result1 = Result.timeConversion(a);
        System.out.println(result1);
    }
class Result{
        public static String  timeConversion(String s){
            String subString1 = s.substring(0,2);
            String subString2 = s.substring(3,5);
            String subString3 = s.substring(6,8);
            String subString4 = s.substring(8);

            int hour = Integer.parseInt(subString1);
            int minutes = Integer.parseInt(subString2);
            int seconds = Integer.parseInt(subString3);

            if(subString4.equals("PM") && hour != 12){
                hour = hour + 12;
            }
            else if (subString4.equals("AM") && hour == 12){
                hour = 00;
            }
            return String.format("%02d:%02d:%02d", hour, minutes, seconds);
        }
    }
}