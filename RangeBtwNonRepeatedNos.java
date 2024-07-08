package TcsDigitalCode;


import java.util.Scanner;

public class RangeBtwNonRepeatedNos {
    private static boolean checkRepeated(int x)
    {
        int temp=x;
        String input=Integer.toString(temp);
        for (int i=1;i<input.length();i++)
        {
            char ch=input.charAt(0);
            char ch2=input.charAt(i);
            if(ch!=ch2)
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter start range ");
        int start=kb.nextInt();
        System.out.println("Enter end range ");
        int end=kb.nextInt();
        int count=0;
        for (int i=start;i<=end;i++)
        {
            if(checkRepeated(i)==false)
            {
                count++;
            }
        }
        System.out.println(count);
    }
}
