public class whlop {
    public static void main(String[] args){
        int a = 0;
        while (a<10){

            a++;
            if (a %2 ==0){
                System.out.print( "\t"+"even number:"+a);
                if (a<9){
                    System.out.print(",");
                }
            }

            else {
                System.out.print("\t"+"odd number:"+a);
            }

        }


    }
}
