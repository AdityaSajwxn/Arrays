package MultiDimensionalArray;
import java.util.*;


class RequiredFunctions{
    static void print2DArray(int[][]arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j] +  "  ");
            }
            System.out.println();
    }
    } 
}

public class PascalesTriangle {

    /*Properties of Pascal's Triangle:-
     * Each number is the sum of the two numbers  directly above it.
     * First and the last row of the Pascal's Triangle is always 1.
     * p[i][j]=p[i-1][j]+p[i-1][j-1], where p is represents pascale triangle 2d array
     * Jagged Array(diff no. of rows of columns)
     * ith row has (i+1)columns
     */

     static int[][] pascale(int n){
        int[][] ans = new int[n][];
        for (int i = 0; i < n; i++) {
            ans[i] = new int[i + 1]; // ith row has i+1 columns, helps in dynamically filling(as per need) columns rather pre defining
            // This means for 1 space in row of ans array 2 columns spaces are created 
            // very are making  a new 1D array(column) after entering every row(also the defination of 2D array) as per the requirement
            ans[i][0] = ans[i][i] = 1; // First and last elements are 1

            for (int j = 1; j < i; j++) { // This loop runs from 1 to i-1
                ans[i][j] = ans[i - 1][j] + ans[i - 1][j - 1];
            }
        }
        return ans;
    }



  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter n");
    int n= sc.nextInt();
      System.out.println("Pascales Triangle from given input n is ");
    int[][] ans = pascale(n);
    RequiredFunctions.print2DArray(ans);
    sc.close();

 }

}


    

