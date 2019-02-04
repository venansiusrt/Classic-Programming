package methodnusa;
import java.util.Scanner;
public class MethodNUSA {
    public static void main(String[] args) {
        Scanner input= new Scanner (System.in);
        System.out.print("Masukkan Nama Anda \t: ");
        String name= input.next();
        System.out.print("Masukkan Usia Anda \t: ");
        int age= input.nextInt();
        System.out.print("Masukkan Status Anda \t: ");
        String status= input.next();
        System.out.print("Masukkan Alamat Anda \t: ");
        String address= input.next();
        System.out.println("\n");
        nama(name);
        usia(age);
        System.out.println("");
        identitas(name,age,address,status);
    }
    
    public static void nama (String a){
        System.out.println("Nama Anda adalah "+a);
    }
    
    public static void usia (int a){
        System.out.println("Saat ini Anda berusia "+a+" tahun");
    }
    
    public static void identitas (String nama, int usia, String alamat, String status){
        System.out.println("Selamat datang saudara/i "+nama+". \nSaat ini saudara/i berusia "+usia+
                ".\nBertempat tinggal di "+alamat+".\nStatus saudara/i "+status);
    }
}
