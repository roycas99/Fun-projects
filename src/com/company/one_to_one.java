package com.company;
import java.util.*;
public class one_to_one {
    public static void main(String[] args) {
        System.out.println("Put the lengh of your function");
        Scanner sr= new Scanner(System.in);
        int n= Integer.parseInt(sr.nextLine()); // changing the int into object.remeber boxing




        int[] X=new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Put the domain first and aco-domain second");
            Scanner sr1 =new Scanner(System.in);
            int f=sr1.nextInt();
            X[i]=sr1.nextInt();

        }

        boolean bl=one_To_One(n,X);
        if(bl){
            System.out.println("Relationship is One to One ");

        }
        else System.out.println("Not one to one");


    }
    public static boolean one_To_One(int n ,int[] X){
        boolean one_to_one = true;
        int i = 0;
        while (i <= n - 1 && one_to_one) {
            int j = i + 1;
            while (j < n && one_to_one) {
                if (X[i] == X[j] && i != j)
                    one_to_one = false;
                j++;

            }
            i++;

        }
        return one_to_one;
    }
}
