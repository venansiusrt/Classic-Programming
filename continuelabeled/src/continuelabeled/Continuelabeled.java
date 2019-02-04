package continuelabeled;
public class Continuelabeled {
    public static void main(String[] args) {
        lanjut: 
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                System.out.println("["+i+","+j+"]");
                if(j==2)
                {
                    continue lanjut;
                }
            }
        }
    }
}
