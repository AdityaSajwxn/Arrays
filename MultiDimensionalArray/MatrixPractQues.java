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
}

public class MatrixPractQues {

    static void ReverseMatrix(int[][]arr){
        //reverses the rows of the 2D Array

    for (int i = 0; i < arr.length; i++) { // Iterate through each row
        int start = 0; 
        int end = arr[i].length - 1;

        // Swap elements within the row
        while (start < end) {
            int temp = arr[i][start];
            arr[i][start] = arr[i][end];
            arr[i][end] = temp;

            start++;
            end--;
        }
    }
    System.out.println("Reverse of the rows of the given matrix is");
    RequiredFunctions.print2DArray(arr);
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

      System.out.println("Input Array is ");
    RequiredFunctions.print2DArray(arr);
    ReverseMatrix(arr);
    sc.close();   
}
}

        
class TransposeOfMatrix{
 // write a program to write a transpose a matrix entered by the user
 /*Transpose means rows becomes column and column becomes rows
  * i.e, {1 2 3}(row) becomes {1
                               2
                               3} (column) - coordinates of row and column gets interchanged
                               while the diagonal elements remains same as coordinates are same.
  */

  static int[][] transpose(int[][]arr){
    int[][] ans = new int[arr.length][arr.length];
    for(int i = 0; i<arr.length;i++){
        for(int j = 0; j<arr[i].length;j++){
            ans[i][j]= arr[j][i];
        // This method has logical defficiences will only work on a square matrix meaning matrix having same number of rowa and column
        /*it will not work if the matrix is having different number of rows and columns*/

        //Swpaing of matrix[i][j] with maatrix[j][i] is a more logical approach and will work in both of the above case

        
        }
    }
return ans;
  }

  static void TransposeInPlace(int[][]arr){// transposing an array without making a new array
    for(int i = 0; i<arr.length;i++){
        //for(int j = 0; j<arr[i].length;j++){
            //arr[i][j]= arr[j][i];
/*This method will only give answer if the matreix is a square matrix meaning having same number of rows and column 
 
 Swapping the coordinates is another approach of doing the same */

         for (int j=i;j<arr[i].length;j++){  // j should start from i to avoid swapping numbers which are already been swapped
            int temp = arr[i][j];
            arr[i][j]=arr[j][i];
            arr[j][i]=temp;

        }
    }
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
      System.out.println("Transpose of the array is");
      //int[][] ans = transpose(arr);
      //RequiredFunctions.print2DArray(ans);
      TransposeInPlace(arr);
    RequiredFunctions.print2DArray(arr);
      sc.close();  

  }
}

class RotationOfMatrix{
    // rotating a matrix clockwise and anticlockwise.
  
    static void reverseArray(int[]arr){
        // reverse funtion to reverse every row of the transpose of the matrix(considering each row as single array)
        int i =0,j=arr.length-1;
        while(i<j){
            int temp = arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;

        }

    }


    static void Rotate(int[][]arr){
       
        // first we will find the transpose of the matrix

        TransposeOfMatrix.TransposeInPlace(arr);// called transpose in place function 

        // now we have to reverse each row to rotate it by 90 degree
        for(int i =0; i<arr.length;i++){
            //now we call for reverse function for normal array
            reverseArray(arr[i]);
        }
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
      System.out.println("New matrix after 90 degree rotation is ");
      Rotate(arr);
      RequiredFunctions.print2DArray(arr);
      sc.close();

 }
}
