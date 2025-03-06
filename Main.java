import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    int [] [] matrix = new int[3][7];

    for (int r = 0; r < matrix.length; row++)
    {
      for (int c = 0; c < matrix[0].length; c++)
      {
        matrix [r][c] = (int) (math.random() *100);
      }
    }


    for (int row = 0; row < matrix.length; row++)
    {
      int [] arr = matric[row];
      //unit 6 problem
      for (int i = 0; i < arr.length; i++)
      {
        System.out.print(arr[i] + " ");
      }
      System.out.println();
    }

    //Ap test will show it like this
    for (int row = 0; row < matrix.legnth; row++)
    {
      for (int col = 0; matric[row].length; col++)
      {
        System.out.print(matric[row][col] + " ");
      }
      System.out.println();
    }



    //for each element 
    for (int [] row: matrix)
    {
      for (int elem : row)
      {
        System.out.print(elem + " ");
      }
      System.out.println();
    }
  }


  public static int sumOfDiag(int[][] matrix)
  {
    return 0;
  }

  public static int[][] productTable(final int numRows, final int numCols)
  {
    return null;
  }
}
