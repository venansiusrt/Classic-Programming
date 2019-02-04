package kewalik;
import java.util.Scanner;

public class Kewalik {
    public static void reverse(int number){
        double n=1;
        while (number/(int)Math.pow(10,n)!=0){
            n++;
        }
        for (double i=1;i<n;i++){
            int angka = (number%10);
            System.out.print(angka);
            number=number/10;
        }
        int angka = (number%10);
        System.out.println(angka);
    }
    
    public static void main(String[] args) {
    Scanner mput=new Scanner(System.in);
        
        System.out.print("Masukkan angka : ");
        int builangan=mput.nextInt();
        
        System.out.print("Palindrom dari angka tersebut adalah : ");
        reverse(builangan);
    }
    
}
