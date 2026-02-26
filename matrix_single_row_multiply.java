import java.util.Scanner;

public class matrix_single_row_multiply
{
    public static void main(String[] args) 
    {
        try (Scanner read = new Scanner(System.in)) 
        {
            System.out.println("Entre row of matrix");
            int row1 = read.nextInt();
            System.out.println();
            System.out.println("Entre column of matrix");
            int column1 = read.nextInt();
            read.nextLine();
            System.out.println();
            int matrix1[][] = new int[row1][column1];
            int matrix2[][] = new int[row1][column1];
            System.out.println("Entre matrix");
            for (int i = 0; i < row1; i++) 
            {
                for (int j = 0; j < column1; j++) 
                {
                    matrix1[i][j] = read.nextInt();
                }
            }
            System.out.println();
            System.out.println("matrix is");
            for (int i = 0; i < row1; i++) 
            {
                for (int j = 0; j < column1; j++) 
                {
                    System.out.print(matrix1[i][j] + " ");
                }
                System.out.println();
            }

            for (int i = 0; i < row1; i++) 
            {
                for (int j = 0; j < column1; j++) 
                {
                    matrix2[i][j] = matrix1[i][j];
                }
            }

            System.out.println();
            System.out.println("entre row of which u want to multiply");
            int find = read.nextInt();
            System.out.println();
            System.out.println("entre no");
            int mult = read.nextInt();
            System.out.println();
            find = find - 1;
            if (find >= 0 && find < row1) 
            {
                for (int j = 0; j < column1; j++) 
                {
                    matrix2[find][j] = matrix2[find][j] * mult;
                }
                System.out.println("matrix is");
                for (int i = 0; i < row1; i++) 
                {
                    for (int j = 0; j < column1; j++) 
                    {
                        System.out.print(matrix2[i][j] + " ");
                    }
                    System.out.println();
                }
            }
            else 
            {
                System.out.println("max row is " + row1);
            }
        }
    }
}
