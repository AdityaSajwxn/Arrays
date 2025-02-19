package MultiDimensionalArray.SumOFRectangle;
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


// Pre-Calculating the horizontal sum for each row in the Matrix
public class M2PreCalculations {

    // first finding the prefix sum of the whole given matrix
    static void findprefixsummatrix(int[][]matrix){ 
        int r = matrix.length;
        if(r>0);// this line is to be  written if number of row are not known
        int c = matrix[0].length;// this line will not work( give error) if there are no row in the matrix

       // now traverse horizontally to calculate row-wise prefix sum
       for(int i = 0; i<r;i++){
        for(int j = 1; j<c;j++){
            matrix[i][j]+=matrix[i][j-1];
        }
       } 
    } 

    static int findsum(int[][]matrix, int l1, int l2, int r1, int r2){
        int sum =0;
         // Calculate the prefix sum for the entire matrix
         findprefixsummatrix(matrix);
          // Iterate through each row in the given range
          for(int i=l1;i<=l2;i++){
            // Calculate the sum of elements from r1 to r2 in row i
            if(r1>=1){
                // If r1 is greater than or equal to 1, subtract the prefix sum up to r1-1 from the prefix sum at r2
            sum+=matrix[i][r2]-matrix[i][r1-1];
          }else{
                // Otherwise, add the prefix sum at r2 directly to the sum
            sum+=matrix[i][r2];
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

      System.out.println("Rectangle Sum is " + findsum(arr, l1, l2, r1, r2));
        sc.close();
    }
    }
