 import java.util.*;
public  class any {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your gender");
        char gen=sc.next().charAt(0);
        int age;
        if (gen=='m' || gen=='M'){
            System.out.println("Enter your age");
            age=sc.nextInt();
            if (age>18){
                System.out.println("You can vote");
            }
            else {
                System.out.println("You can't vote");
            }

        }
        else {
            if(gen=='f' || gen=='F' ) {
                System.out.println("Enter your age");
                age = sc.nextInt();
                if (age>18){
                    System.out.println("You can vote");
                }
                else {
                    System.out.println("You can't vote");
                }
            }


        }
    }
}
