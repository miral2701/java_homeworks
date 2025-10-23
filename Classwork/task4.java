import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count=0;
        String a;
        while(in.hasNext()){
            a=in.next();
            count++;
        }
        System.out.print(count);

    }
}
