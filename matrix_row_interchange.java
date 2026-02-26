import java.util.Scanner;
public class matrix_row_interchange
{
    public static void main(String[] args) 
    {
        try (Scanner read = new Scanner(System.in)) 
        {
            System.out.println("Entre row of matrix");
            int row = read.nextInt();
            System.out.println();
            System.out.println("Entre column of matrix");
            int column = read.nextInt();
            read.nextLine();
            System.out.println();
            int matrix1[][] = new int[row][column];
            int matrix2[][] = new int[row][column];
            System.out.println("Entre matrix");
            for (int i = 0; i < row; i++) 
            {
                for (int j = 0; j < column; j++) 
                {
                    matrix1[i][j] = read.nextInt();
                }
            }
            System.out.println();
            System.out.println("matrix is");
            for (int i = 0; i < row; i++) 
            {
                for (int j = 0; j < column; j++) 
                {
                    System.out.print(matrix1[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println();
            for (int i = 0; i < row; i++) 
            {
                for (int j = 0; j < column; j++) 
                {
                    matrix2[i][j] = matrix1[i][j];
                }
            }
            System.out.println("Entre first row from which u want to interchange");
            int row1=read.nextInt();
            row1-=1;
            System.out.println();
            System.out.println("Entre second row");
            int row2=read.nextInt();
            row2-=1;
            System.out.println();
            if(row1 >= 0 && row1 < row && row2 >= 0 && row2 < row)
            {
                for(int i=0; i<column; i++)
                {
                    matrix2 [row1][i]=matrix1[row2][i];
                }
                for(int i=0; i<column; i++)
                {
                    matrix2 [row2][i]= matrix1[row1][i];
                }
                System.out.println("Interchange matrix is");
                for (int i = 0; i < row; i++) 
                {
                    for (int j = 0; j < column; j++) 
                    {
                        System.out.print(matrix2[i][j] + " ");
                    }
                    System.out.println();
                }
            }
            else
            {
                System.out.println("maximum row is "+row);
            }
       }
    }
}