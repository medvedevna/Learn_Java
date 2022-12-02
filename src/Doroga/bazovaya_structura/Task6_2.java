package Doroga.bazovaya_structura;

import java.util.Scanner;

public class Task6_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a= scanner.nextInt();
        int b=scanner.nextInt();
        scanner.close();
        if(a%2==0||b%3==0){
         System.out.println(a==b);
        }
        if (a%2==0&&a%3==0){
            calculate (a,b);
        }
    }
    static void calculate(int a, int b){

        double result=Math.pow(a,b);
       if(result>Integer.MAX_VALUE||result<Integer.MIN_VALUE){
           System.out.println("Результат выражения слишком большой!");
       }else {
           System.out.println((int)result);
       }

    }
}
