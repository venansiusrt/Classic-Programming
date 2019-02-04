package breakoperation;
public class BreakOperation {
    public static void main(String[] args) {
    
        int x=35;
        int y=4;
        int dummy=4;
        mulai:
        while (true){
            if(y>x){
                System.out.println("Nilai kelipatan y yang mendekati x adalah "+y);
                break mulai;
            }
                y= y+dummy;
            }
        }
}
