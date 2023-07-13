 import java.util.*;
public class TStwo {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a = sc.nextInt();
        boolean b=false;
        if (a>=18){
            b=true;
        }
        if (b==true){
            System.out.println("a is big");
        }
        if (b==false) {
            System.out.println("a is small");
        }

    }
}
