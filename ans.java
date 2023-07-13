public class ans {
    public static void main(String[] args){
        int a=0;
        int sum=0;
        while (a<10){
            a++;
            System.out.println(a);
        }
        a=0;
        System.out.print("the sum of");
        while (a<10){
            a++;
            if (a%3==0){
                System.out.print("\t"+a);
                sum+=a;
                if (a<8){
                    System.out.print("+");
                }
            }
        }
        System.out.print("="+sum);
    }
}
