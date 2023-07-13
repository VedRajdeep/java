import java.util.*;
public class Arrtsk {
    public  static  void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        String a[]=new String[5];
        for( int i=0;i<5;i++){
            a[i]=sc.nextLine();

        }
        for (int i=0;i<5;i++){
            System.out.print(a[i]+"\t");
            if (i%2==0){
                System.out.println("Number is even");
            }
            else {
                System.out.println("Number is odd");
            }
        }
    }

}
