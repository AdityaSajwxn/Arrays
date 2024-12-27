package Arrays;
import java.util.*;

class requiredfunctions{

    static void printarray(int[]arr){ 
        for(int i = 0 ; i <arr.length; i ++){
            System.out.println(arr[i] + "");
        }
        System.out.println();
    }

    static int findArraySum(int[]arr){
        int totalSum =0;
        for(int i =0;i<arr.length;i++){
            totalSum+=arr[i];
        }
        return totalSum;
    }

    static int[] SuffixSum(int[]arr){
        int []suff = new int[arr.length];
        suff[arr.length-1]=arr[arr.length-1];
        for(int i = arr.length-2;i>=0;i--){
            suff[i]=suff[i+1]+arr[i];
    }
    return suff;
}

public static void main(String[]args){
    Scanner sc = new Scanner (System.in);
    System.out.println("Enter the size of the array");
            int n = sc.nextInt();
            int[]arr = new int[n];
            System.out.println("Enter the elements of the array");
            //for (int=0;i<n;i++){  
            for(int i = 0;i<n;i++){ 
                arr[i]=sc.nextInt();
            }
            System.out.println("Input Array");
            requiredfunctions.printarray(arr);
    int[] suff =SuffixSum(arr);
    printarray(suff);
    sc.close();
}
}
public class Patterns2 {

    // Given an integer aray 'a', returnthe prefix sum/running sum in the same array wilthout creating a new array

    /*Q1*/static int[]PrefixSum(int[]arr){
        int[]pref = new int[arr.length];
        pref[0]= arr[0];
        for(int i= 1; i < arr.length; i++){
            pref[i]=pref[i-1]+arr[i];
        }
        return pref;
    }
/* public static void main(String[]args){
        Scanner sc = new Scanner (System.in);
        Sysyem.out.println("Enter the size of the array");
                int n = sc.nextInt();
                int[]arr = new int[n];
                System.out.println("Enter the elements of the array");
                //for (int=0;i<n;i++){  
                for(int i = 1;i<=n;i++){ 
                    arr[i]=sc.nextInt();
                }
                System.out.println("Input Array");
                requiredfunctions.printarray(arr);
        int[] pref =PrefixSum(arr);
        requiredfunctions.printarray(pref);
        sc.close();
        */


/*Given an arary of integers of size n. Answer q queries where you need
 * to print the sum of values in a given range of indices from to r (both included)
 * Note: The values f of 1 and r in queries follow 1-based indexing */
 
     /*Q2*/ static int[]querySum(int[]arr){
        int[]pref = new int[arr.length];  //same prefix sum fuction is written
        pref[0]= arr[0];
        for(int i= 1; i < arr.length; i++){
            pref[i]=pref[i-1]+arr[i];
        }
        return pref;
    }


    /*public static void main(String[]args){
        Scanner sc = new Scanner (System.in);
        //requiredfunctions obj1 = new requiredfunctions();( used when only void fuction is made in different class)
        System.out.println("Enter the size of the array");
                int n = sc.nextInt();
                int[]arr = new int[n+1];
                System.out.println("Enter the elements of the array");
                //for (int=0;i<n;i++){  // this is used with using 0-based indexing
                for(int i = 1;i<=n;i++){ // This used with following 1-based indexing
                    arr[i]=sc.nextInt();
                }
        int[] pref =querySum(arr);
        System.out.println("Enter number of queries");
        int q = sc.nextInt();
        while(q-->0){
            System.out.println("Enter range starting ");
            int l = sc.nextInt();
            System.out.println("Enter range ending");
            int r = sc.nextInt();
            int ans = pref[r]- pref[l-1];
            System.out.println("Prefix Sum is " + ans);
        } 
    
        sc.close();

    } */
    
    
// Check if we can partition the array into two subarrays with equal sum.
/* More formally check that the prrefix sum of a part of the array is equal to the suffix sum of rest of the array */

/*Q3*/ static boolean equalSumPartition(int[]arr){
    int PrefixSum=0;
    int totalSum = requiredfunctions.findArraySum(arr);
    for(int i =0; i<arr.length;i++){
        PrefixSum+=arr[i];
        int suffixsum =totalSum - PrefixSum;  // prefix sum + suffix sum = total sum
        if(suffixsum==PrefixSum){
            return true;
        }
    }
return false;

}


public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of the array");
                int n = sc.nextInt();
                int[]arr = new int[n];
                System.out.println("Enter the elements of the array");
                //for (int=0;i<n;i++){  
                for(int i = 0;i<n;i++){ 
                    arr[i]=sc.nextInt();
                }
                System.out.println("Equal Partition possible: " + equalSumPartition(arr));
                sc.close();
}
}
