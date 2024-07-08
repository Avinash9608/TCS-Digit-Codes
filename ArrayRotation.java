package TcsDigitalCode;

import java.util.Scanner;

public class ArrayRotation {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter size of array ");
        int size=kb.nextInt();
        System.out.println("Enter element in array ");
        int[] array=new int[size];
        for (int i=0;i<size;i++)
        {
            array[i]=kb.nextInt();
        }
        System.out.println("Enter your inputted ele ");
        for (int x:array)
            System.out.print(x+" ");
        int[] shiftedArray=new int[size];
        System.out.println("Enter value of k ");
        int k=kb.nextInt();
        for(int i=0;i<size;i++)
        {
            shiftedArray[(k+i)%size]=array[i];
        }
        System.out.println("Enter your inputted ele after shifting ");
        for (int x:shiftedArray)
            System.out.print(x+" ");
    }
}
