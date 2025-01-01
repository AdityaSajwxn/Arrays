package Arrays;
import java.util.Scanner;
public class ArrayIndexQ {

    // Finding the staring and ending indexes of the given number in the given array

    static int[]index(int[]arr, int target){
        int n = arr.length;
        for(int i =0 ; i<n;i++){
            for (int j = n-1; j>=i;j--){
                if(arr[i]==target && arr[j]==target){
                 return new int[]{i,j};
            }
        }
    }
    return new int[]{-1,-1}; 
}

    public static void main(String[]args){
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter the elements of the array");
        for(int i =0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the target element");
        int target = sc.nextInt();
        int[] ans = index(arr, target);
        System.out.println("starting and ending index of the target in the give array are : [" + ans[0] + ", " + ans[1] + "]");
        sc.close();
    }
}
