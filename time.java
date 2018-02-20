import java.util.*;

class Clock{
    public static void main (String[] args) {
        //Current time and date
        Calendar now=Calendar.getInstance();
        int hour=now.get(Calendar.HOUR_OF_DAY);
        int minute = now.get(Calendar.MINUTE);
        int month= now.get(Calendar.MONTH);
        int day = now.get(Calendar.DAY_OF_MONTH);
        int year = now.get(Calendar.YEAR);

        //greeting
        if (hour<12) {
            System.out.println("Good morning \n");
        } else if (hour <17) {
            System.out.println("Good afternoon \n");
        } else {
            System.out.println("Good Evening");
        }

        System.out.println("Minute:"+minute + "\n Hour:"+hour 
            + "\n Day:" + day +"\n Month:" + month +
            "\n Year:"+ year);
    }
}