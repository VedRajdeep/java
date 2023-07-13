import java.util.*;
public class Artstwo {
    static int reverseDigits(int num)
    {
        int rev_num = 0;
        while (num > 0) {
            rev_num = rev_num * 10 + num % 10;
            num = num / 10;
        }
        return rev_num;
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("Reverse of no. is "
                + reverseDigits(num));
    }
}

