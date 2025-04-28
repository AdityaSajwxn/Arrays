package MultiDimensionalArray.SumOFRectangle;
import java.util.Scanner;

class RequiredFunctions4{

    static void print2DArray(int[][]arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j] +  "  ");
            }
            System.out.println();
    }
    }     
}

// Prefix Sum over Columns and Rows both
public class M3 {

    //first finding the sum of all the rows and columnns  
   static void findprefixsumofmatrix(int[][]matrix){
int r= matrix.length;
if(r>0);
int c = matrix[0].length;
// now traversing horizontally to calculate the row wise prefix sum
  for( int i = 0 ; i<r;i++ ){
    for(int j = 1; j< c; j++){
        matrix[i][j]+=matrix[i][j-1];
    }
  }
  // now traverse vertically to calcaulate the column wise prefix sum
  for(int j =0; j<c;j++){
    for(int i=1;i<r;i++){
        matrix[i][j]=matrix[i-1][j];
    }
  }
   }

   static int findsum1(int[][]matrix, int l1, int l2, int r2, int r1){
    /*int sum =0;
    findprefixsumofmatrix(matrix);
     sum = matrix[l1][r2]-matrix[l1-1][r2]-matrix[l2][r2-1]+matrix[l1-1][r1-1];
    return sum;*/

    //other way considering the case where the value of r1 or l1 can be 0
     int ans = 0, sum =0, up=0, left=0, upleft=0;
    findprefixsumofmatrix(matrix);
      sum = matrix[l1][r2]; // get the sum of the sub-matrix from (0,0) to (l1,r2)
      if(l1>1)
      up = matrix[l1-1][r2]; // subtract the sum of the sub-matrix above
      if(r1>1)
      left = matrix[l2][r2-1]; // subtract the sum of the sub-matrix to the left
      if(l1>1 && r1>1)
      upleft = matrix[l1-1][r1-1]; // add back the sum of the overlapping sub-matrix at the top-left corner
      ans = sum - up - left + upleft; // calculate the final answer
      return ans;
     
   }

   

    public static void main(System[]args){
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
          RequiredFunctions1.print2DArray(arr);
          System.out.println("Enter rectangle boundaries l1,r1,l2,r2");
          int l1 = sc.nextInt();
          int r1 = sc.nextInt();
          int l2 = sc.nextInt();
          int r2 = sc.nextInt();
    
          System.out.println("Rectangle Sum is " + findsum1(arr, l1, l2, r1, r2));
            sc.close();
        }
    }


    

