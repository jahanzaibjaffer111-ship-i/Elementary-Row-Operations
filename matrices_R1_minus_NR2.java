import java.util.Scanner;
public class matrices_R1_minus_NR2
{
    public static void main(String[] args) 
    {
        try (Scanner read = new Scanner(System.in)) 
        {
            System.out.println("Enter row of matrix");
            int row = read.nextInt();
            System.out.println();
            System.out.println("Enter column of matrix");
            int column = read.nextInt();
            read.nextLine();
            System.out.println();
            int matrix1[][] = new int[row][column];
            int matrix2[][] = new int[row][column];
            System.out.println("Enter matrix");
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
            System.out.println("Enter first row from which you want to minus");
            int row1=read.nextInt();
            row1-=1;
            System.out.println();
            System.out.println("Enter second row to which uou want to minus");
            int row2=read.nextInt();
            row2-=1;
            System.out.println();
            System.out.println("entre no which you want to multiply with second row you choose before");
            int no=read.nextInt();
            if(row1 >= 0 && row1 < row && row2 >= 0 && row2 < row)
            {
                for(int j=0; j<column; j++)
                {
                    matrix1 [row2][j] = matrix1[row2][j] * no;
                }
                for(int i=0; i<column; i++)
                {
                    matrix2 [row1][i]=matrix2[row1][i]-matrix1[row2][i];
                }
                System.out.println();
                System.out.println("Final matrix is");
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
                System.out.println("maximum row present are "+row);
            }
       }
    }

}
