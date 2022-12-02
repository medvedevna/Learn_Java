package Doroga.bazovaya_structura;

import java.util.Scanner;

public class Task4_1 {
    public static void main(String[] args) {
        int a;
        int b=1;
        Scanner s=new Scanner(System.in);
        a=s.nextInt();
        for (int i=1;i<=a;i++){
          b=b*i;
            System.out.println(b);
        }
    }
}
