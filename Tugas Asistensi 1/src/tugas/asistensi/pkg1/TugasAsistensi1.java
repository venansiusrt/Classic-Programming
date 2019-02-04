package tugas.asistensi.pkg1;
import java.util.Scanner;
public class TugasAsistensi1 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner (System.in);
        
        System.out.print("Masukkan Besar Suhu dalam Celcius : ");
        
        int a = scan.nextInt();
        double b,c,d;
        
        b=0.8*a;
        c=(1.8*a)+32;
        d=a+273;
        
        System.out.println("\nSuhu "+a+" C sama dengan nilai "+b+" derajat Reamur");
        System.out.println("Suhu "+a+" C sama dengan nilai "+c+" derajat Fanrenheit");
        System.out.println("Suhu "+a+" C sama dengan nilai "+d+" derajat Kelvin");
    }
    
}
