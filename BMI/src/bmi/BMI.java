package bmi;

import java.util.Scanner;
public class BMI {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter weight in pounds : ");
    double we = input.nextDouble();
    System.out.print("Enter feet             : ");
    double ft = input.nextDouble();
    System.out.print("Enter inch             : ");
    double in = input.nextDouble();
    
    double kg, h1, h2, bmi;
    kg = we*(0.45);
    h1= (in*(0.0254))+(ft*(0.305));
    
    h2= Math.pow(h1, 2);
    bmi=kg/h2;
    
    System.out.println("BMI is "+bmi);
    
    if (bmi<18.5)
        {
            System.out.println("Underweight");
        }
    else if ((bmi>=18.5)&&(bmi<25))
        {
            System.out.println("Normal");
        }
    else if ((bmi>=25)&&(bmi>30))
        {
            System.out.println("Overweight");
        }
    else if (bmi>=30)
        {
            System.out.println("Obese");
        }
    }
    
}