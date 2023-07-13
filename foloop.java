

public class foloop {
    public static void main(String[] args){
        int a=65;
        char ch;
      for (int i=49;i<123;i++){
          ch=(char)i;
          if (i>57 && i<65){
              continue;
          }
          if (i>90 && i<97){
              continue;
          }
          if (i==65){
              System.out.println();
          }
          if (i==97){
              System.out.println();
          }
          System.out.println(ch+"\n");
      }
    }
}
