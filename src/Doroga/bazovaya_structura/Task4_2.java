package Doroga.bazovaya_structura;

import java.util.Scanner;

public class Task4_2 {
    public static void main(String[] args) {
        int a;
        Scanner s = new Scanner(System.in);
        a = s.nextInt();
        int digitSum=0;
        while(a!=0){
            digitSum+=a%10;
            a/=10;
        }
        System.out.println(digitSum);
        }
    }

