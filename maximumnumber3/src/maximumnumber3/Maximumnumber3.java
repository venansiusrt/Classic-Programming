package maximumnumber3;
import java.util.Scanner;
public class Maximumnumber3 {
    public static void main(String[] args) {
    Scanner input=new Scanner (System.in);
    System.out.print("Input angka : ");
    double bil1=input.nextDouble();
    double bil2=input.nextDouble();
    double bil3=input.nextDouble();
    
    displaySortedNumbers(bil1,bil2,bil3);
    }
    
public static void displaySortedNumbers(double num1,double num2, double num3){
    double pertama,kedua,ketiga;
    String hasil;
    if ((num1>=num2)&&(num2>=num3))
    {
            ketiga=num1;
            kedua=num2;
            pertama=num3;
    }
    else if ((num1>=num2)&&(num2<=num3)&&(num1>=num3))
    {
            ketiga=num1;
            kedua=num3;
            pertama=num2;
    }
    else if ((num1>=num2)&&(num2<=num3)&&(num1<=num3))
    {
            ketiga=num3;
            kedua=num1;
            pertama=num2;
    }
    else if ((num1<=num2)&&(num2<=num3)&&(num1<=num3))
    {
            ketiga=num3;
            kedua=num2;
            pertama=num1;
    }
    else if ((num1<=num2)&&(num2>=num3)&&(num1<=num3))
    {
            ketiga=num2;
            kedua=num3;
            pertama=num1;
    }
    else
    {
            ketiga=num2;
            kedua=num1;
            pertama=num3;
    }
    
    hasil="Bilangan terkecil ke terbesar adalah "+pertama+", "+kedua+", "+ketiga+".";
    System.out.println(hasil);
}
}
