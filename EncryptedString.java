package TcsDigitalCode;
import java.util.Scanner;
public class EncryptedString {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter your string ");
        String input=kb.next();
        System.out.println("Enter row and cols ");
        int row=kb.nextInt();
        int col=kb.nextInt();
        char[][] array=new char[row][col];
        int count=0;
        for (int i=0;i<row;i++)
        {
            for (int j=0;j<col;j++)
            {
                char ch=input.charAt(count++);
                array[i][j]=ch;
            }
        }
        StringBuilder sb=new StringBuilder();
        for (int i=0;i<col;i++)
        {
            for (int j=0;j<row;j++)
            {
                sb.append(array[j][i]);
            }
            sb.append(" ");
        }
        System.out.println(sb.toString());
    }
}
