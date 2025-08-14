import java.util.Scanner;
public class functionBasics {
    public static void printHelloMsg(){
        System.out.println("Hello Sir/Madam..!!");
        return; // In void return type it is optional.
    }

    public static int Calculate(int num1, int num2){//parameters or formal parameters
        
        int sum = num1 + num2;
        
        return sum;
    }
    
    public static void Swap(int a,int b){
        
        int temp = a;
            a = b;
            b = temp;
            System.out.println("Number after Swap: a="+a +"," +"b="+b);// here will print swap value bcz in this function it works on the opertaion given paar agr issi ko main function mein likhnge toh it will give orginal value due to pass by value.   
    }

    public static int factorial(int n){
            int fact =1;
            for(int i =1; i <= n; i++){
                fact = fact * i;
            } 
            return fact; 
    }
    public static int binCoff(int n,int r){
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nMr = factorial(n-r);

        int binCoff = fact_n / (fact_r * fact_nMr);

        return binCoff;
    }
    // Function Overloading using PArameters----------------------
    public static int plus(int a, int b){
        return a+b;
    }

    public static int plus(int a, int b, int c){
          return a+b+c;
    }

    //Function overloading using Data types -----------------------
    public static int sum(int a, int b){
        return a+b;
    }

    public static float sum(float a, float b){
        return a+b;
    }
    // TO check prime number ---------------------------------------
    public static boolean isPrimeNum(int n){
        boolean isPrime = true;
        //for(int i = 0; i <= Math.sqrt(); i++){} Optimized way 
        for(int i = 2; i < n-1; i++){
            if(n % i == 0){
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }
    //Find primes in range -------------------------------
    public static void primesInRange(int m){
        for(int i =2; i < m; i++){
            if(isPrimeNum(i)){
                System.out.print(i+" ");
            }
        }
       // System.out.println();
    }
    //Bin to dec ----------------------------
    public static void binToDec(int binNum){
        int myNum = binNum;
        int pow = 0;
        int decNum = 0;
        while(binNum > 0){
            int ld = binNum % 10;
            decNum = decNum + (ld * (int)Math.pow(2,pow));
            pow ++;
            binNum = binNum / 10;
        }
        System.out.println("Decimal number of "+myNum+" = "+decNum);
    }
    // Dec to bin ---------------------------
    public static void decToBin(int decNum){
        int myNum = decNum;
        int binNum = 0;
        int pow = 0;
        while(decNum > 0){
            int ld = decNum % 2;
            binNum = binNum +(ld *(int)Math.pow(10,pow));
            pow++;
            decNum = decNum / 2;
        }
         System.out.println("Binary number of "+myNum+" = "+ binNum);

    }
    public static void main(strings[] args) {
        /* 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the two number u want to calculate:");
         int a = sc.nextInt();
         int b = sc.nextInt();
        */
        printHelloMsg(); // Function Call
        
        /* 
        // int a = 5, b=8;
        int sumOfnum = Calculate(a,b);// arguments or Actual parameters
        System.out.println("Sum is : "+sumOfnum);
        */
        /* 
        int a = 9, b= 5;
        Swap(a,b);
        System.out.println("Number after Swap: a="+a +"," +"b="+b);// give the original value bcz of (pass by value) thge copy value will go in the function swap.. 
       

        System.out.println("Factorial of the given number is :"+  binCoff(6,4));
        */

        // System.out.println(sum(4,5));
        // System.out.println(sum(1.2f,2.4f));

        // System.out.println(isPrimeNum(13));
        // primesInRange(30);

        binToDec(101);
        decToBin(8);
        

    
    }
}
