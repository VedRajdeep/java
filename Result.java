public class Result {
    public static void main(String[] args){
        int a = 50;
        int b = 60;
        int c = 40;
        int e = 60;
        int f = 70;
        int total = a+b+c+e+f;
        int per = total/5;
        System.out.println(per);
       System.out.println("fail:-"+(per<35));
       System.out.println("C:-"+(35>per || per<70));
       System.out.println("B:-"+(70>per || per<90));
       System.out.println("A:-"+(90<per || per>100));
    }
}
