import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // example below, replace it with your solution
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        if(number<5){
         System.out.println(number*number-3*number+4);

        }else{
         System.out.println(number+7);

        }
    }
}
