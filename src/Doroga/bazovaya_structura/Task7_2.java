package Doroga.bazovaya_structura;

public class Task7_2 {
    public static void main(String[] args) {
        System.out.println(sum(1,2,6));
    }
    static int sum(int ...ints){
      int result=0;
      for(int i: ints){
          if(result<Integer.MIN_VALUE&&result>Integer.MAX_VALUE){

          }else 
         result+=i;
        }
      return result;
    }
}
