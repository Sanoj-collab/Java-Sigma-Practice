import java.util.Scanner;
public class functPractice {
    //Question 1
    public static void averageOfNum(double x, double y, double z){
        
        double sum =x+y+z;
         double avrg = sum / 3;
  
          System.out.println(avrg);
      }
      //Question 2
      public static boolean isEven(int n){
            
            if(n % 2 == 0) return true;
            return false;
      }
      //Question 3
      public static boolean isPallindron(int n){
             int temp =n;
             int rev = 0;
             while(n != 0){
                int rem = n % 10;
                rev = rev * 10 + rem;
                n = n / 10;
             }
             if(temp == rev) return true ;
             return false;
      }
      //Question 5
      public static int sumOfDigits(int n){
            int sum = 0;
            while(n > 0){
                int rem = n % 10;
                sum = sum + rem;
                n = n / 10;
            }
            return sum;
            //System.out.println("Sum of the digits :"+sum);
      }     
       /*                                                          ADVANCED Pattern */
      //Hollow rectangle using star ----------------------  
    public static void hollow_rectangle(int rows,int col){
        for(int i = 1; i <= rows; i++){
            for(int j =1; j <= col; j++){
                if(i == 1|| j == 1|| i == rows || j == col){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    // floyid triangle----------------------------------
    public static void floyid_triangle(int num, int l){
        for(int i = 1; i <= l; i++){
        
            for(int j = 1; j <= i; j++){
              System.out.print(num+" ");
              num++;
            }
            System.out.println();
        }
    }
    //Print x using star -----------------------------
    public static void XusingStr(int m){
        for(int i = 1; i <= m; i++){
            for(int j = 1; j <= m;j++){
                if(i-j == 0 || i+j == 6){
                    System.out.print("*");
                   }else{
                    System.out.print(" ");
                }
            } 
            System.out.println();
        }
    }
    //Print Hollow square box ------------------------
    public static void hollow_Squarebox(int size){
        for(int i= 0; i < size; i++){
            for(int j = 0; j < size; j++){
                if(i == 0 || j == 0 || i == size-1 || j == size-1){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
           }
    }
    // 01 triangle pattern--------------------
    public static void zeroOne_triangle(int line){
        for(int i = 1; i <= line; i++){
            for(int j = 1; j <= i; j++){
                if( (i+j) % 2 ==0 ){
                    System.out.print(1);
                }else{
                    System.out.print(0);
                }
            }
            System.out.println();
         }
    }
    // Butterfly pattern--------------------------
    public static void butterfly(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            for(int j = 0; j <= 2*(n-i); j++){
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = n; i >= 1; i--){
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            for(int j = 0; j <= 2*(n-i); j++){
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    //Solid Rhombus-------------------------------
    public static void solid_rhombus(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n-i; j++){
                System.out.print("  ");
            }
            for(int j = 1; j <= n; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    // Hollow rhombus-----------------------
    public static void hollow_rhombus(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n-i; j++){
                System.out.print("  ");
            }
            for(int j = 1; j <= n; j++){
                if(i == 1 || j == 1 || i == n || j == n){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    //Diamond pattern-----------------------------------------
    public static void diamond(int n ){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n-i; j++){
             System.out.print("  ");
            }
            for(int j = 1; j <= (2*i) - 1 ; j++){
                 System.out.print("* ");
            }
            System.out.println();
         }
         for(int i = n; i >= 1; i--){
             for(int j = 1; j <= n-i; j++){
                System.out.print("  ");
             }
             for(int j = 1; j <= (2*i) - 1 ; j++){
                 System.out.print("* ");
             }
             System.out.println();
         }
    }
    public static void main(strings[] args) {

        Scanner sc = new Scanner(System.in);
        /*                              Q1
        System.out.println("Enter the three number that u want to get average : ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
         
        averageOfNum(a,b,c);
        
                                         Q2
        System.out.println(isEven(7));
        int a = sc.nextInt();
        if(isEven(a) == true){
            System.out.println("The number is even number.");
        }else{
           System.out.println("The number is a odd number.");
        }
                                           Q3
        int n = sc.nextInt();
        System.out.println(isPallindron(121));
        if(isPallindron(n) == true ){
            System.out.println("The number is pallindrone number .");
        }else{
           System.out.println("The number is not a pallindrone number.");
        }
        
                                              Q5
        int x = sc.nextInt();
        System.out.println(sumOfDigits(x));
        */
        
       // hollow_rectangle(4, 4);
       //floyid_triangle(1, 5);
      // XusingStr(5);
      //hollow_Squarebox(5);
      //zeroOne_triangle(5);
       //butterfly(5);
      //  solid_rhombus(5);
      //hollow_rhombus(6);;
      diamond(8);

    }
    
}
