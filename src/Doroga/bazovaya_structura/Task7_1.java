package Doroga.bazovaya_structura;

public class Task7_1 {
    public static void main(String[] args) {
      System.out.println(mergeStrings ("a","b"));
    }
    static  String mergeStrings(String...a){
        var result="";
        for (String i: a){
           result+=i+" ";
        }
        return result;
    }
}
