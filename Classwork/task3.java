import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size =in.nextInt();

        int[] myArray; 
        myArray = new int[size]; 
        int i=0;
        while(in.hasNext()){
          myArray[i]=in.nextInt();
          i++;
        }
        for(i=size-1;i>=0;i--){
            System.out.print(myArray[i]+" ");

        }
    }
}
