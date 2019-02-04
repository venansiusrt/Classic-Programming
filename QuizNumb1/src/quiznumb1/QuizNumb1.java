package quiznumb1;

import java.util.Scanner;
public class QuizNumb1 {
public static void main(String[] args) {
    Scanner label = new Scanner (System.in);
    System.out.print("Enter today's day: ");
    int today = label.nextInt();
    System.out.print("Enter the number of days elapsed since today: ");
    int after = label.nextInt();
    
    int sum;
    String todays, futures;
    sum=today+after;
    
    if (today%7==0)
        todays="Sunday";
    else if (today%7==1)
        todays="Monday";
    else if (today%7==2)
        todays="Tuesday";
    else if (today%7==3)
        todays="Wednesday";
    else if (today%7==4)
        todays="Thursday";
    else if (today%7==5)
        todays="Friday";
    else
        todays="Saturday";
    
    if (sum%7==0)
        futures="Sunday";
    else if (sum%7==1)
        futures="Monday";
    else if (sum%7==2)
        futures="Tuesday";
    else if (sum%7==3)
        futures="Wednesday";
    else if (sum%7==4)
        futures="Thursday";
    else if (sum%7==5)
        futures="Friday";
    else
        futures="Saturday";
    
    System.out.println("Today is "+todays+" and the future day is "+futures);
    }
    
}
