package MultiDimensionalArray;
import java.util.Scanner;

class RequiredFunctions{

    static void print2DArray(int[][]arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j] +  "  ");
            }
            System.out.println();
    }
    } 

    static void PrintRectangle(int[][] arr, int l1, int r1, int l2, int r2) {
        System.out.println("The rectangle elements are:");
        for (int i = l1; i <= l2; i++) {
            for (int j = r1; j <= r2; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println(); // Move to the next row after printing a row of the rectangle
        }
    }
}


// Calculating Sum of a Rectangle (within the matrix) using 3 Methods

//Method 1
public class PrefixSum {

/*Given a matrix 'a' of dimension r*c and 2 coordinates (l1,r1)and(l2,r2).
Return the sum of the rectangle from (l1,r1)to(l2,r2). 
    1. l2>=l1, r2>=r1
    2. 0<=l1, l2<r
    3. 0<=r1, r2<c
*/

static int FindSumBF(int[][]arr, int l1, int r1 , int l2, int r2){
    // finds sum by brute force(BF) approach
int sum =0;
    for(int i = l1; i<=l2;i++){
        for(int j= r1; j<=r2;j++){
            sum += arr[i][j];

        }
    }
    return sum;
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
      System.out.println("Enter rectangle boundaries l1,r1,l2,r2");
      int l1 = sc.nextInt();
      int r1 = sc.nextInt();
      int l2 = sc.nextInt();
      int r2 = sc.nextInt();

    RequiredFunctions.PrintRectangle(arr, l1, r1, l2, r2);

      System.out.println("Rectangle Sum " + FindSumBF(arr, l1, r1, l2, r2));
      sc.close();


    
}
}
