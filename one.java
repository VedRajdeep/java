import java.util.*;
public class one {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        char gen=sc.next().charAt(0);
        int age;

        if (gen== 'm' || gen== 'M' ) {
            System.out.println("Enter your age");
            age=sc.nextInt();
            if (age<18)
                {
                    System.out.println("You can't vote");
                }
            else
                {
                     System.out.println("You can vote");
                }
        }
        else if (gen== 'f' || gen== 'F' ) {
            System.out.println("Enter your age");
            age=sc.nextInt();
            if (age<18)
            {
                System.out.println("You can't vote");
            }
            else
            {
                System.out.println("You can vote");
            }
        }
    }
}
