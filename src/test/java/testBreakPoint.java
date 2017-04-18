/**
 * Created by 533 on 2017/4/18.
 */
public class testBreakPoint {
    public static void main(String[] args) {
        int i = 0;
        while(i < 10){
            System.out.println("进入调试！");
            printHello();
        }
    }

    public static void printHello(){
        int j = 0;
        for(int i = 0; i < 10; i++) {
            System.out.println("j is: " + j++);
        }
    }
}
