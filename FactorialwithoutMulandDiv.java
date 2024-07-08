package TcsDigitalCode;

import java.util.Scanner;

public class FactorialwithoutMulandDiv {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter value num");
        int num=kb.nextInt();
        int fact=1;
        int temp=1;
        while (temp<=num)
        {
            int temp2=0;
            for (int ctrl=0;ctrl<temp;ctrl++)
            {
                temp2+=fact;
            }
            fact=temp2;
            temp++;
        }
        System.out.println("Factorial of num is "+fact);
    }
}
