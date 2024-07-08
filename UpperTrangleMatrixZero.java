package TcsDigitalCode;

import java.util.Scanner;

public class UpperTrangleMatrixZero {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter row and col ");
        int row=kb.nextInt();
        int col=kb.nextInt();
        int[][] array=new int[row][col];
        System.out.println("Put elements in array ");
        for (int i=0;i<row;i++)
        {
            for (int j=0;j<col;j++)
            {
                array[i][j]=kb.nextInt();
            }
        }
        System.out.println("Inputted array ");
        for (int i=0;i<row;i++)
        {
            for (int j=0;j<col;j++)
            {
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("Upper traingle matrix zero ");
        for (int i=0;i<row;i++)
        {
            for (int j=0;j<col;j++)
            {
                if(j>i) {
                    array[i][j] = 0;
                }
            }

        }
        System.out.println("Result ");
        for (int i=0;i<row;i++)
        {
            for (int j=0;j<col;j++)
            {
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
    }
}