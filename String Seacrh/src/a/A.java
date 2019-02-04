package a;
import java.util.Scanner;
public class A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String strings = "a quick brown fox jumped over the lazy dog";
        int lengthOfString = strings.length();
        int temp = 0;
        for (int i=0; i<lengthOfString; i++){
            if (strings.charAt(i)=='d'){
                System.out.println("Huruf d berada pada index "+(i+1));
                temp++;
            }
        }
        System.out.println("Terdapat "+temp+" huruf d");
        
        System.out.println("");
        String stringh = "Hello My Name is Eko Prastiyo";
        String stringf = "ello Mys";
        boolean contains = stringh.contains(stringf);
        System.out.println(contains);
    }
}
