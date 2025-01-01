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


public class SpiralMatrix {

    // Given an n*m matrix 'a', return all elements of the matrix in spiral order
/* Printed to be in following sequence:-
 * top row
 * right most column(last column)
 * bottom row
 * left most column (first column)
 */
 
 static void PrintSpiralOrder(int[][]arr, int r, int c){
    int toprow= 0, bottomrow = r-1, leftCol=0, rightCol= c-1;
    int totalElemets = 0;
    while(totalElemets<r*c){
        // print top row -> leftCol to rightCol
        for(int j = leftCol; j<=rightCol && totalElemets<r*c;j++){
            System.out.print(arr[toprow][j] + " ");
            totalElemets++;
        }
        toprow++;

        //print right coloumn ->topRow to bottomrow
        for(int i = toprow;i<=bottomrow && totalElemets<r*c;i++){
            System.out.print(arr[i][rightCol] + " ");
            totalElemets++;
        }
        rightCol--;

        // print bottom row -> righCol to leftCol
        for(int j =rightCol; j>=leftCol && totalElemets<r*c;j--){
            System.out.print(arr[bottomrow][j] + " ");
            totalElemets++;
        }
        bottomrow--;

        // print left column -> bottomRow to topRow
        for(int i = bottomrow;i>=toprow && totalElemets<r*c;i--){
            System.out.print(arr[i][leftCol] + " ");
            totalElemets++;
        }
        leftCol++;
    } 
    System.out.println();

}

public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of rows ");
    int r = sc.nextInt();
    System.out.println("Enter the number of columns");
    int c = sc.nextInt();
     int[][] arr = new int[r][c]; // total elements in this array are r*c. Giving number of rows is compulsory while columns id not

     System.out.println("Enter r*c = " + r*c + " elements for the array");
      for(int i= 0; i<r;i++){
          for(int j = 0;j<c;j++){
               arr[i][j]= sc.nextInt();
         }
      }
      System.out.println("Input Matrix");
      RequiredFunctions.print2DArray(arr);
      System.out.println("Spiral order of the given matrix is");
      PrintSpiralOrder(arr, r, c);
      sc.close();
}
}




class GenerateSpiral{
    
    static int[][] generateSpiralMatrix(int n){
        int[][] arr = new int [n][n];
        int toprow= 0, bottomrow = n-1, leftCol=0, rightCol= n-1;
    int current= 1;
    while(current<=n*n){
        // print top row -> leftCol to rightCol
        for(int j = leftCol; j<=rightCol && current<=n*n;j++){
            arr[toprow][j] = current;
            current++;
        }
        toprow++;

        //print right coloumn ->topRow to bottomrow
        for(int i = toprow;i<=bottomrow && current<=n*n;i++){
            arr[i][rightCol] = current;
            current++;
        }
        rightCol--;

        // print bottom row -> righCol to leftCol
        for(int j =rightCol; j>=leftCol &&current<=n*n;j--){
            arr[bottomrow][j] = current;
            current++;
        }
        bottomrow--;

        // print left column -> bottomRow to topRow
        for(int i = bottomrow;i>=toprow && current<=n*n;i--){
            arr[i][leftCol] = current;
            current++;
    } 
    leftCol++;
    }
    return arr;
    }

public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter N");
    int n = sc.nextInt();
    int[][] arr = generateSpiralMatrix(n);
    System.out.println("Spiral Matrix is ");
    RequiredFunctions.print2DArray(arr);
    sc.close();
}
}