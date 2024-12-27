package MultiDimensionalArray;
import java.util.*;
public class IntroQues {
// printing of 2D array
static void print2Darray(int[][]arr){
    for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr[i].length;j++){
            System.out.print(arr[i][j] +  "  ");
        }
        System.out.println();
}
} 
public static void main(String[]args){
    //int[][]arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

    // taking input on 2D array from the user
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of rows ");
    int r = sc.nextInt();
    System.out.println("Enter the number of columns");
    int c = sc.nextInt();
     int[][] arr = new int[r][c]; // total elements in this array are r*c. Gving number of rows is compulsory while columns id not

     System.out.println("Enter r*c = " + r*c + " elements for the array");
      for(int i= 0; i<r;i++){
          for(int j = 0;j<c;j++){
               arr[i][j]= sc.nextInt();
         }
      }        
    print2Darray(arr);
    sc.close();
}
}

class MatrixAddition{

     //Adittion of two Matrices
     //matrices only with the same number of rows and columns can be added. Result matrix will also have same r&c.
     static void MatrixAdd(int[][]arr1,int r1, int c1, int[][]arr2, int r2, int c2 ){
          if(r1!=r2 || c1!=c2){
               System.out.println("Wrong input - Addition not possible");
               return;
          }
          
          int[][]ans = new int[r1][c1];
          for(int i = 0; i<r1;i++){
               for(int j =0; j<c1;j++){ // arr2[i] because matirces only having same no. of r&c can be added
                    ans[i][j]= arr1[i][j]+arr2[i][j];
               }
          }
          System.out.println("Sum of the array is");
          IntroQues.print2Darray(ans);

     }
       public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.println("MATRIX 1");
    System.out.println("Enter the number of rows ");
    int r1 = sc.nextInt();
    System.out.println("Enter the number of columns");
    int c1 = sc.nextInt();
     int[][] arr1 = new int[r1][c1]; // total elements in this array are r*c. Gving number of rows is compulsory while columns id not

     System.out.println("Enter r*c = " + r1*c1 + " elements for the array");
      for(int i= 0; i<r1;i++){
          for(int j = 0;j<c1;j++){
               arr1[i][j]= sc.nextInt();
         }
      }        
     System.out.println("MATRIX 2");
    System.out.println("Enter the number of rows ");
    int r2= sc.nextInt();
    System.out.println("Enter the number of columns");
    int c2= sc.nextInt();
     int[][] arr2 = new int[r2][c2]; // total elements in this array are r*c. Gving number of rows is compulsory while columns id not

     System.out.println("Enter r*c = " + r2*c2 + " elements for the array");
      for(int i= 0; i<r2;i++){
          for(int j = 0;j<c2;j++){
               arr2[i][j]= sc.nextInt();
         }
      }        
      System.out.println("MATRIX 1");
      IntroQues.print2Darray(arr1);
      System.out.println("MATRIX 2");
      IntroQues.print2Darray(arr2);
       MatrixAdd(arr1, r1, c1, arr2, r2, c2);
    sc.close();
}
       }


     
class MultiplyMatrix{

//Write a program to display Multiplication of two matrices entered by the user
/*number of columns of first matrix should be equal to number of rows of second matrix(c1=r2)
 * This implies the answer matrix will be of dimension r1*c2.*/
 

static void multiply(int[][]arr1, int r1, int c1, int[][]arr2, int r2, int c2){
     if(r1!=c2){
          System.out.println("INVALID INPUT - Mutliplication cannot be done because row of Matrix 1 is not equal to column of Matrix 2");
          return;
     }
     int[][] product = new int[r1][c2];
     for(int i=0; i<r1;i++){ // i represents row number
          for(int j= 0; j<c2;j++){ // j represents column number
               for(int k =0; k<c1;k++){
                    // product[i][j]= ith row of arr1 * jth column of arr2
                    product[i][j]+= arr1[i][k]*arr2[k][j];
               }       
          }
     }
     System.out.println("Product of the given Matrices is ");
     IntroQues.print2Darray(product);
}

public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.println("MATRIX 1");
System.out.println("Enter the number of rows ");
int r1 = sc.nextInt();
System.out.println("Enter the number of columns");
int c1 = sc.nextInt();
int[][] arr1 = new int[r1][c1]; // total elements in this array are r*c. Gving number of rows is compulsory while columns id not

System.out.println("Enter r*c = " + r1*c1 + " elements for the array");
 for(int i= 0; i<r1;i++){
     for(int j = 0;j<c1;j++){
          arr1[i][j]= sc.nextInt();
    }
 }        
System.out.println("MATRIX 2");
System.out.println("Enter the number of rows ");
int r2= sc.nextInt();
System.out.println("Enter the number of columns");
int c2= sc.nextInt();
int[][] arr2 = new int[r2][c2]; // total elements in this array are r*c. Gving number of rows is compulsory while columns id not

System.out.println("Enter r*c = " + r2*c2 + " elements for the array");
 for(int i= 0; i<r2;i++){
     for(int j = 0;j<c2;j++){
          arr2[i][j]= sc.nextInt();
    }
 }        
 System.out.println("MATRIX 1");
 IntroQues.print2Darray(arr1);
 System.out.println("MATRIX 2");
 IntroQues.print2Darray(arr2);
  multiply(arr1, r1, c1, arr2, r2, c2);
sc.close();
}
  }

