package TcsDigitalCode;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DifferenceBtwChar {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter input ");
        String input=kb.nextLine();
        Map<Character, Integer> store=new HashMap<>();
        for (int i=0;i<input.length();i++)
        {
            store.put(input.charAt(i),store.getOrDefault(input.charAt(i),0)+1);
        }
        System.out.println("Enter comman difference ");
        int cd=kb.nextInt();
        int[] countsfreq=new int[store.size()];
        int index=0;
        for (int x:store.values())
        {

            countsfreq[index++]=x;
        }

        int minCharRemove=0;
        for (int i=0;i<countsfreq.length-1;i++)
        {
            int diff=countsfreq[i]-countsfreq[i+1];
            if(diff!=cd)
            {
                minCharRemove+=Math.abs(diff-cd);
            }
        }
        if(minCharRemove==0)
            System.out.println("NA");
        else
            System.out.println(minCharRemove);
    }
}
