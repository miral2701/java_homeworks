import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m=0;
        int n=0;
        while(in.hasNext()){
            m=in.nextInt();
            n=in.nextInt();
            System.out.println(2*m+2*n+" "+m*n);

        }
    }
}
