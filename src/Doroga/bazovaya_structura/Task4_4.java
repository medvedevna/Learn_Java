package Doroga.bazovaya_structura;

import java.util.Scanner;

public class Task4_4 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        for (int i=1;i<=10;i++){
            if (a==i){
               System.out.println("Числа равны");
            } else if (a%2==0) {
                System.out.println(a+i);
            }else {
                System.out.println(a-i);
            }
        }
    }
}
