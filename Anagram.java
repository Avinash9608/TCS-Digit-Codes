package TcsDigitalCode;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class Anagram {
    private static boolean checkAnagram(String s1, String s2)
    {
        if(s1.length()!=s2.length())
            return false;
        LinkedHashMap<Character,Integer> store=new LinkedHashMap<>();
        for (int i=0;i<s1.length();i++)
        {
            store.put(s1.charAt(i),store.getOrDefault(s1.charAt(i),0)+1);
        }
        for (int i=0;i<s2.length();i++)
        {
            if(!store.containsKey(s2.charAt(i)))
            {

                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter input as string ");
        String input=kb.next();
        System.out.println("Enter it's anagram ");
        String anagramForm=kb.next();
        boolean result=checkAnagram(input,anagramForm);
        System.out.println(result);
    }
}
