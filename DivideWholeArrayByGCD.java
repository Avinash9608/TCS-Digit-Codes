package TcsDigitalCode;

import java.util.Scanner;

public class DivideWholeArrayByGCD {
    private static int GCD(int a,int b)
    {
        if(b==0)
            return a;
         return GCD(b, a%b);

    }
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter size of array ");
        int size=kb.nextInt();
        int[] array=new int[size];
        System.out.println("Enter elements in array ");
        for (int i=0;i<array.length;i++)
        {
            array[i]=kb.nextInt();
        }
        int result=0;
        for (int i=0;i<array.length-1;i++)
        {
            result=GCD(array[i],array[i+1] );
        }
        System.out.println(result);
        for (int i=0;i<array.length;i++)
        {
            array[i]=array[i]/result;
        }
        for (int x:array)
            System.out.print(x+" ");
    }
}
