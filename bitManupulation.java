public class bitManupulation {
    public static int getIthBit(int n, int i ){
       int bitMask = 1 << i;
       if((n & bitMask) == 0) return 0;
       else return 1;
    }
    public static int setIthBit(int n , int i){
        int bitMask = 1 << i;
        return n | bitMask;
    }
    public static int clearIthBit(int n, int i){
        int bitMask = ~(1<<i);
        return n & bitMask;
    }
    public static int updateIthBit(int n, int i, int newBit){
        if(newBit == 0){
            return clearIthBit(n, newBit);
        }
        else{
            return setIthBit(n, newBit);
        }
    }
    public static int clearIBits(int n, int i){
        int bitMask = -1 <<i;
        return n & bitMask;
    }
    public static int clearRangeOfBit(int n , int i , int j){
        int a = (~0) << (j+1);
        int b = (1 << i)-1;
        int bitmask = a | b;
        return n & bitmask;
    }
    public static boolean isPowerOf2(int n){
        return(n & (n-1)) == 0;
    }
    public static int countBit(int n){
        int count = 0;
        while(n > 0){
            if((n & 1) != 0){
                count++;
            }
            n = n >> 1;
        }
        return count;
    }
    public static int fastExponentiation(int n, int i){
        int ans = 1;
        while(i > 0){
            if((n & 1) != 0){
                ans = ans * n;
            }
            n = n * n;
            n = n >> 1;

        }
        return ans;
    }
    //Question 1 What is the vale of x ^ x with any value of x .?
    //Ans the value will be 0 bcz when two same number are performed xor then it gives 0.
    //Question 2 Write a program to swap number without using third variable.
    public static void swapNum(int a,int b){
        a = a ^ b ;
        b = a ^ b ;
        a = a ^ b ;
        System.out.println("a = "+a +"," + "b = "+b);
    }
    public 
    public static void main(String[] args) {

       // System.out.println(getIthBit(4, 2));

       //System.out.println(setIthBit(10, 2));

       //System.out.println(updateIthBit(10, 02, 01));


      //    System.out.println(4 << 3);// left shift 
      //    System.out.println(4 >> 3);//right shift 
      //    System.out.println(4 << 6);
      //    int x = 12;

      //    x = (x | (1 << 6));

      //    System.out.println(x);

      //   System.out.println(clearIBits(15, 2));
      //   System.out.println(clearRangeOfBit(10, 2, 4));
      //   System.out.println(isPowerOf2(15));
      //   System.out.println(countBit(15)); 
      //   System.out.println(fastExponentiation(3, 5));

      //Q2
      swapNum(10, 15);


    }
}
