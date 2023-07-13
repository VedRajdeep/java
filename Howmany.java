import java.util.Scanner;

public class Howmany {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enater First Number:-");
        int a = sc.nextInt();
        if (a<10){
            System.out.println("you enter one digit");
        }
        if (a<=100 && a>=10){
            System.out.println("You Enter two digit");
        }
        if (a<=1000 && a>100){
            System.out.println("You Enter three digit");
        }
    }
}
