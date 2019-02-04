package ujierror;
public class Ujierror {
    public static void main(String[] args) {
    int x=1;
    int y=1;
    
    for (int i=1;i<10;i++){
        //int x=0; error terjadi karena x dideklarasikan dua kali.
        x+=1;
        System.out.println(x);
    }
    } 
}
