package Arrays;
import java.util.*;
class patterns{
int arrSum(int[]arr){
    int sum =0;
    for(int i=0;i<arr.length;i++){
        sum+=arr[i];
    }
return sum;
}

//Find total number of pairs in the Array whose sum  is equal to the given value of X
int targetsum(int[]arr, int target){
    int n = arr.length;
    int ans = 0;
    for(int i = 0;i<n; i++){
        for(int j =i+1;j<n;j++){
            if(arr[i]+arr[j]==target){
                ans++;
            }
        }
    }
return ans;
}

//Find total number of triplet in the Array whose sum  is equal to the given value of x
int tripletsum(int[]arr,int target){
    int ans = 0;
    int n = arr.length;
    for(int i = 0; i<n; i++){
        for(int j = i+1;j<n;j++){
            for( int k= j+1;k<n;k++){
                if(arr[i]+arr[j]+arr[k]==target){
                    ans++;
                }
            }
        }
    }
return ans;
}

// Find the unique number in the Array where all elements aare being repeated twice

int uniquelemnet(int[]arr){
    int n = arr.length;
    int ans = 0;
    for(int i=0; i<n;i++){
        for(int j=i+1;j<n;j++){
            if(arr[i]==arr[j]){
                arr[i]=-1;
                arr[j]=-1;
            }
        }
    }
    for(int i = 0;i<n;i++){
        if(arr[i]>-1){
            ans=arr[i];
        }
    }
    return ans;
}

//Find the scond largest element in the giver Array

int findmax(int[]arr){ // first create a function to find a the largest array
    int n= arr.length ; 
    int mx = Integer.MIN_VALUE;
    for(int i=0;i<n;i++){
        if(arr[i]>mx ){
            mx=arr[i];
        }
    }
    return mx;
}

int findSecondMax(int[]arr){ //now use function created to find largest array to find the second largest element by making the largest element (after finding) -infinity.
int mx = findmax(arr);
for(int i = 0; i<arr.length;i++){
    if(arr[i]==mx){
        arr[i]=Integer.MIN_VALUE;
    }
}
int secondmax = findmax(arr);
return secondmax; 
}

//In an array return the first value that is repeating, if no value is repeated return -1
int repeatingarray(int[]arr){
    for(int i = 0; i<arr.length;i++){
        for(int j=i+1;j< arr.length;j++){
            if (arr[i]==arr[j]){
                return arr[i];        
            }
        }    
}
return -1;
}
}
public class Patterns1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter the elements of the array");
        for(int i =0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        //System.out.println("Enter the target sum");
        //int target=sc.nextInt();
        patterns obj1 =new patterns(); 
System.out.println("Therfore the repeating value is  " + obj1.repeatingarray(arr));
     sc.close();
    }
    
}


class Swap{ //swap of integers using a temp variable c and storing the value of a in it.
    static void swap(int a , int b){
    int c =a;
     a = b;   
     b=c;
     System.out.println("swapped values are");
     System.out.println(a );
     System.out.println(b);
     }

     static void swapM2(int a , int b){ // swaping of 2 integers using sum and difference method
    a= a+b;
    b= a-b;
    a= a-b;
    System.out.println("swapped valued are ");
    System.out.println(a);
    System.out.println(b);
     }
     
     public static void main(String [] args){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter number a");
       int a = sc.nextInt();
       System.out.println("Enter number b");
       int b = sc.nextInt();
       swapM2(a, b) ;   
    sc.close();
     }
    }

    class miscelleanous{ // questions on reverse and rotate

        static void printarray(int[]arr){ //method to print array
            for(int i = 0 ; i <arr.length; i ++){
                System.out.println(arr[i] + "");
            }
            System.out.println();
        }

         /*Q1*/ static int[] reversearr(int[]arr){
            int[] ans = new int[arr.length];
            int j = 0;
            for(int i = arr.length-1; i>=0; i--){
                ans[j++]=arr[i];
           }
            return ans;
         }
         


         static void swapinarr(int[]arr, int i , int j){ // fuction to swap array for in place rotation
            int temp = arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
         }

         /*Q2*/ static void reversearrM2(int[] arr) { 
            //reverse the array without creating a new array. In place reverse
            int i =0, j=arr.length-1;
            while(i<j){
                swapinarr(arr, i, j);
                i++;
                j--;
            }

            

         }

         //Rotate the given array 'a' by k steps, where k is non-negative
         /*Q3*/ static int[] rotatearr(int[] arr, int k){
            k=k%arr.length;
            int[]ans = new int[arr.length];
            int j =0;
            for(int i =arr.length-k; i<arr.length;i++){
                ans[j++]=arr[i];
            }
            for(int i =0;i<arr.length-k;i++){
                ans[j++]=arr[i];
            }
return ans;
         }


// Rotate th egiven array 'a' by k steps, where k in non-negative without using extra space.

   /*Q4*/ static void reverse(int[]arr, int i, int j){
       if(i <j){
            swapinarr(arr, i, j);
        }}

         /*Q4*/ static void rotateInPlace(int[]arr, int k ){
            int n= arr.length;
            k=k%n;
            reverse(arr, 0, n-k-1);
            reverse(arr, n-k, n-1);
            reverse(arr, 0, n-1);
         }




         public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the length of the array");
            int n = sc.nextInt();
            int [] arr = new int[n];
        System.out.println("Enter the elements of the array");
        for(int i =0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
       // System.out.println("Enter the k steps to rotate the array ");
        //int k  =sc.nextInt();
        //int[]ans = rotatearr(arr,k);
       reversearrM2(arr);
        System.out.println("rotated array is " ); 
        printarray(arr);
        sc.close();
         }
        }


        class PresentQuery{
// Givwn Q queries, check if the given number is present in the array or not
            // value of allthe element in the array is less yhan 10^5

         static int[] makeFrequencyarray(int[]arr){
            int []freq = new int[100005];
             for(int i = 0; i<arr.length;i++){
                freq[arr[i]]++;
             }
return freq;

         }


            public static void main (String[]args){
                Scanner sc = new Scanner (System.in);
                System.out.println("Enter the size of the array");
                int n = sc.nextInt();
                int[]arr = new int[n];
                System.out.println("Enter the elements of the array");
                for(int i = 0;i<n;i++){
                    arr[i]=sc.nextInt();
                }
                int[] freq = makeFrequencyarray(arr);

                System.out.println("Enter number of queries");
                int q = sc.nextInt();
        
        while (q>0){
            System.out.println("Enter number to be searched ");
            int x = sc.nextInt();
            if(freq[x]>0){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }  
            q--;
        }

            
    sc.close();
                
            }
        }
