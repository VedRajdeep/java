import java.util.*;
public class Input {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int e = sc.nextInt();
        int total = a+b+c+e;
        int per = total/4;
        if (per>80){
            System.out.println("A");
        }
        if (per>50 && per<80){
            System.out.println("B");
        }
       if (per>=35 && per<50){
           System.out.println("C");
       }
       if (per<35){
           System.out.println("Fail");
       }
    }
}
