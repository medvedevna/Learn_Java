package Doroga.bazovaya_structura;

import java.util.Scanner;

public class Task3_1 {
    public static void main(String[] args) {
        int a;
        int b;
        Scanner scanner=new Scanner(System.in);
        a= scanner.nextInt();
        b=scanner.nextInt();
         if(a%2==0){
            System.out.println(a*b);
        } else if (b==0) {
             System.out.println("На 0 делить нельзя");
         } else {
            System.out.println((double)a/b);
        }
        if (a==b) {
            System.out.println("Числа равны");
        }
    }
}
