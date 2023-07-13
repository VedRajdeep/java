import java.util.Scanner;

public class Number {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enater First Number:-");
        int a = sc.nextInt();
        System.out.println ("You Enter one digit:-" + (a<10 && a>=1));
        System.out.println("You Enter two digit:-"+ (a<=100 && a>=10));
        System.out.println("You Enter Three digit:-"+(a<=1000 && a>=100));
    }
}
