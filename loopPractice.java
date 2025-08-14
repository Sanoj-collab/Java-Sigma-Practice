import java.util.Scanner;

public class loopPractice {
    public static void main(strings[] args) {
        /*                           ROUGH WORK 
        int n = 10899;
 
        // while( n > 0){
        //   int lD = n % 10;
        //   System.out.print(lD);
        //   n = n / 10;
        // }
     ----------------------------------
        int rev = 0;
         
        // while( n > 0){
        //     int rem = n % 10;
        //     rev = (rev * 10) + rem;
        //     n = n / 10;
        // }
        // System.out.println(rev);

        ----------------------------------------
        */
       
       Scanner sc = new Scanner(System.in);

       //    do{
      //     System.out.println("Enter the number :");
      //     int no = sc.nextInt();
      //     if(no % 10 == 0){
      //         System.out.println("The given number is multiple of 10.");
      //         break;
      //     }
      //     System.out.println(no);
      //    }
      //    while(true);

       // ------------------------------------------ 

       //    do{
      //     System.out.println("Enter the number:");
      //     int num = sc.nextInt();
      //     if(num % 10 == 0){
      //         System.out.println("The number u entered is multiple of 10 .That's why I m not printing it ....");
           
      //         continue;
      //     }
      //     System.out.println(num); 
      //    }
      //    while(true);

      //-----------------------------------------------

       
        // System.out.println("Enter the number: ");
        // int No = sc.nextInt();

        // if(No == 2){
        //     System.out.println("The given number is a prime number.");
        // }else{
        //    boolean  isPrime = true;
        //    for(int i = 2; i <=Math.sqrt(No); i++){
        //        if(No % i == 0){
        //           isPrime = false;
        //       }
        //     }
        //     if(isPrime == true){
        //         System.out.println("The given number is a Prime number.");
        //     }
        //     else{
        //         System.out.println("The given number is not a prime number. ");
        //     }
        // }
          //-----------------------------------------------------------------
                                       /*Practice set */

          /* 
            Question 1
            for(int i = 0; i < 5; i++){
                System.out.println("Hello");
                i += 2;
            }
          
            Question 5
          for(int i = 0; i <= 5; i++){
              System.out.println("i = "+ i);
          }
          System.out.println("i after thre loop = "+ i);//ERROR
          ------------------------------------------------
            Question 2 
         int n = sc.nextInt();
         int evenSum =0, oddSum = 0;
         for(int i = 1; i <= n; i++){
            if(i % 2 == 0){
                evenSum += i;
            }
            else{
                oddSum += i;
            }
         } 
        System.out.println("The sum of the even number from the set is :" +evenSum);
        System.out.println("The sum of the odd number from the set is :"+oddSum);
        --------------------------------------

         Question 3 
        int n = sc.nextInt();
        int fact = 1;
        for(int i =1; i <= n; i++){
            fact = fact * i;
        }
        System.out.println("The factorial of n is :" + fact);
        ----------------------------------

        Question 4
        System.out.println("Enter the number u want table: "); 
        int n = sc.nextInt();
        for(int i = 1; i <=10 ;i++){
           System.out.println(n + "*" + i + "=" + n*i );
        }
        ----------------------------------
        */

        //                                                         NESTED LOOP 
        
        /*                                                Rough 
        
       // Right angle triangle using star...
        for(int i = 1; i <=5; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
       //-------------------------------------
       // Inverted right angle triangle..
        for(int i = 1; i <= 4; i++){
            // for(int j = 4; j >=1 ; j--)  iit just used revrese counting print 
            for(int j = 1; j <=4-i+1; j++){
              System.out.print(j);
            }
            System.out.println();
        }
      //  -------------------------------------
       // Half pyramid pattern..  using int 
        for(int i = 1; i <= 4; i++){
            for(int j = 1; j <= i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
       // -------------------------------------
        
      //  Char used half pyramid ......
       char ch = 'A';
      // int num = 1;
       for(int i = 1; i <= 5; i++){
        // char ch ='A';  yahan use krne se har new line mein char A se suru hogi 
       
        for(int j = 1;j <=i;j++){
            System.out.print(ch+" ");
            ch++;
           //s num++;
        }
        System.out.println();
       }  
     //  ---------------------------------------- 
     //  Rotated half pyramid 
       int n = 5;
       for(int i = 1; i <= n;i++){
        for(int j = 1; j <= n; j++){
            if(i+j <= n+1){
               System.out.print(" ");
               //num++;
            }else{
               System.out.print("*");
            }
        }
        System.out.println();
       }
    // Inverted rotated half pyramid -----------
    int k = 5;
    for(int i= 1; i <= k; i++){
        for(int j = 1; j <= k; j++){
            if(i-j >= 0){
                System.out.print(" ");
            }else{
                System.out.print("*");
            }
        }
        System.out.println();
    }
    // Floyed Triangle pattern -----------                           Advanced Pattern !
    int num = 1;
    int l= 5;
    for(int i = 1; i <= l; i++){
        
        for(int j = 1; j <= i; j++){
          System.out.print(num+" ");
          num++;
        }
        System.out.println();
    }

    //--------------------------------------------
     //  To print X using *
       int m = sc.nextInt();
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
     // -----------------------------------
     // Print hollow square or box 
    
       int size = sc.nextInt();
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
     // 01 triangle   pattern --------------
     int line = 5;
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
     // Butterfly Pattern ----------------- 
    int n = 5;
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
      
    // Solid rhombus---------------------------
    int row = 5;
    int col= 10;
    for(int i = 1; i <= row; i++){
        for(int j = 1; j <= col; j++){
            if(i+j <= 5 || i+j >= 11){
                System.out.print("  ");
            }else{
                System.out.print("* ");
            }
        }
        System.out.println();
    } 
    // Optimized process...for Solid Rhombus
    int n = 5;
    for(int i = 1; i <= n; i++){
        for(int j = 1; j <= n-i; j++){
            System.out.print("  ");
        }
        for(int j = 1; j <= n; j++){
            System.out.print("* ");
        }
        System.out.println();
    }
     
    //Hollow rhoumbus -----------------------
    int n = 5;
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
    // Diamond pattern-------------------------------------   
    int n = 4;
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
     */
     





    
     sc.close(); 
    }
}
