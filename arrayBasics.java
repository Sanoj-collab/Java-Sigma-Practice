import java.net.Socket;
import java.util.Scanner;
public class arrayBasics {
    public static void update(int marks[],int nonChangeable){
        nonChangeable = 10;
        for(int i = 0; i < marks.length; i++){
            marks[i] = marks[i] +1;
        }
        
    }
    
    public static int linearSearch(int arr[], int target){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }

    // public static String menu(String menu[], int dish){
    //     for(int i = 0; i < menu.length; i++){
    //         if(menu[i] == dish){
    //            return 
    //         }
    //     }
    //     return -1;
    // }

    public static int getLargest(int items[]){
        int largest = Integer.MIN_VALUE;// -infinity
        //int smallest = Integer.MAX_VALUE;// +infinty
        for(int i = 0; i < items.length; i++){
              if(items[i] > largest){
                largest = items[i];
            }
            // if(smallest > items[i]){
            //     smallest = items[i];
            // }
        }
        return largest;
    }
    public static void reverseArray(int arr[]){
        int st = 0; int end = arr.length-1;
        while(st < end){
            int temp = arr[st];
            arr[st] = arr[end];
            arr[end] = temp;;

            st++;
            end--;
        } 
    }
    public static void pairs(int num[]){
        int tp = 0;
        for(int i = 0; i < num.length; i++){
            int curr = num[i];
            for(int j =i+1; j < num.length; j++){
                System.out.print("("+ curr + "," +num[j] +")");
                tp++;
            }
            
            System.out.println();
        }
        System.out.println("Total pairs:"+tp);
    } 
    public static void printSubArray(int ar[]){
        int tsa = 0;
        for(int i = 0; i < ar.length; i++){
            for(int j = i; j < ar.length; j++){
                for(int k =i; k <= j; k++){
                    System.out.print(ar[k]+" ");
                   
                }
                System.out.println();
                tsa++;
            }
           System.out.println();
        }
      System.out.println("Total number of subarray is :"+tsa);
    }
    public static void SubarraySum(int nums[]){
        int maxSum = Integer.MIN_VALUE;
       int minSum = Integer.MAX_VALUE;
        for(int i = 0; i < nums.length; i++){
            int curSum = 0;
            for(int j = i; j < nums.length;j++){
                curSum += nums[j];
                maxSum = Math.max(curSum, maxSum);
                minSum = Math.min(curSum,minSum);

            }
        }
        System.out.println("MaxSum:"+maxSum);
        System.out.println("MinSum:"+minSum);

    }
    //--------------------Brute force method 
    public static void maxSumSubarr(int numbers[]){
        int curSum = 0;
        int maxSum =Integer.MIN_VALUE;

        for(int i = 0; i < numbers.length; i++){
            int st = i;
            for(int j = i; j < numbers.length; j++){
                int end = j;
                curSum = 0;
                for(int k = st; k <=end; k++){
                    curSum += numbers[k];
                }
                System.out.println(curSum);
                if(maxSum < curSum){
                    maxSum = curSum;
                }
            }
        }
        System.out.print( "Maximum Sum of subarray :"+ maxSum);
    }
    //--------------------------optimized method 
    public static void maxSubarrSumn(int numbers[]){
        int curSum = 0; int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[numbers.length];
        
        prefix[0] = numbers[0];
        for(int i = 1;i < numbers.length;i++){
            prefix[i] = prefix[i-1] + numbers[i];
        }
        for(int i = 0; i < numbers.length; i++){
           int st = i; 
           for(int j = i; j < numbers.length; j++){
              int end = j; 
              curSum = st == 0 ? prefix[end] : prefix[end] - prefix[st-1];

             if(maxSum < curSum){
                 maxSum = curSum;
             }
           }
        }
        System.out.println("maximum sum : "+ maxSum);
    }
    // -----------------more optimized method (kadane's algorithm)
    public static void maxSubaaraySum(int numbers[]){
        int maxSum = Integer.MIN_VALUE; 
        int curSum = 0;
        for(int i = 0; i < numbers.length; i++){
            curSum += numbers[i];
            if(curSum < 0){
                curSum = 0;
            }
            maxSum = Math.max(curSum,maxSum);
        }
        System.out.println("Maximum sum:"+maxSum);
    }

    public static void main(strings[] args) {

        // int marks[] = {89, 98, 79};
        // int nonChangeable = 5;
        // update(marks,nonChangeable);
        // System.out.println(nonChangeable);

        // for(int i = 0; i < marks.length; i++){
        //     System.out.print(marks[i]+" ");
        // }
       

     //     int[] marks = new int[100];  // 1st way to create an array.
     //     // int[] num = {2,4,5};
     //     // String[] s = {"what", "if", "Nothing"};

     //    Scanner sc = new Scanner(System.in);
       
     //    marks[0] = sc.nextInt();
     //    marks[1] = sc.nextInt();
     //    marks[2] = sc.nextInt();
     //    //marks[40] = sc.nextInt();

     //    System.out.println("phy:"+ marks[0]);
     //    System.out.println("chem:"+ marks[1]);
     //    System.out.println("math:"+ marks[2]);
     //    //System.out.println("idk:" +marks[40]);
       
     //    marks[2] = marks[2]+25;
     //    System.out.println("maths updated :"+marks[2]);
     //    System.out.println("length of array :"+ marks.length);

        //    int arr[] = {1,4,6,8, 20, 10};
        //    int target = 8;
           
        //    int index = linearSearch(arr, target);
        //    if(index == -1){
        //     System.out.println("Target not found!");
        //    }else{
        //     System.out.println("Target is at:"+ index);
        //    }

        // int items[] = {2,4, 6,5,3,9,20};

        // System.out.println(getLargest(items));

        // int arr[] = {1,5,7,9,8};

        // reverseArray(arr);
        // for(int i = 0; i < arr.length; i++){
        //     System.out.print(arr[i]+" ");
        // }
       

        // int num[] = {2, 4, 6, 8, 9};
        // pairs(num);

        // int nums[] = {2, 4, 5, 6, 8};
        // SubarraySum(nums);

        int numbers[] = {2, -3, 4, -1, -2, 1, 5, -3};
        //maxSumSubarr(numbers);
        //SubarraySum(numbers);

        //maxSubarrSumn(numbers);

        maxSubaaraySum(numbers);



    }
}
