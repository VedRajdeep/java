public class Tsf {
    public static void main(String args[]) {
//        int i,j;
//        for (i=1 ;i<7;i++){
//            for (j=1;j<i;j++){
//                if (j%2==0){
//                    System.out.print("*");
//
//                }
//                else {
//                    System.out.print(j);
//                }
//
//
//            }
//            System.out.println();
//        }

        int i,j;
        for (i=0;i<7;i++){
            for (j=0;j<i;j++){
                if (i %2 ==0){
                    System.out.print(i);
                }
                else {
                    System.out.println((char)(j+64));
                }

            }
        }
    }

}
