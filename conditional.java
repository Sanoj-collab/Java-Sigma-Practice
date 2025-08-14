import java.util.Scanner;
public class conditional {
    public static void main(strings[] args) {
        Scanner sc = new Scanner(System.in);
        /*  Question 1
        int a = sc.nextInt();
       
        if(a >= 0 ) System.out.println("The given number is +ve.");
        else System.out.println("The given number is -ve.");
        */

        /*Question 2
        double temp = 103.5;
        if( temp > 100) System.out.println("You have fever.");
        else System.out.println("You have no fever.");
         */

        /*Question 3 
        int number = sc.nextInt();
        
        switch(number){
            case 1 : System.out.println("Monday");
            break;

            case 2 : System.out.println("Tuesday");
            break;

            case 3 : System.out.println("Wednesday");
            break;
            
            case 4 : System.out.println("Thrusday");
            break;

            case 5 : System.out.println("Friday");
            break;

            case 6 : System.out.println("Saturday");
            break;

            case 7 : System.out.println("Sunday");
            break;

            default : System.out.println("Invalid number pls Try Again...!!");
        }
        */ 
        /*Question 4 
        int a = 63, b = 36;
        boolean x = 
        (a < b) ? true : false;
        int y = (a > b) ? a : b;
        
        System.out.println(x );
        System.out.println(y);
        */
        /*Question 5
        int year = sc.nextInt();
        boolean x = year % 4 == 0;
        System.out.println(x);
        boolean y = year % 100 != 0;
        System.out.println(y);
        boolean z = (year % 100 == 0 && year % 400 == 0);
        System.out.println(z);
        if(x && (y || z)){
            System.out.println("The given year is leap year.");
        }
        else{
            System.out.println("The given year is not a leap year.");
        } */
        /* Brute force method  
        int year = sc.nextInt();

        if(year % 400 == 0){
            System.out.println("Leap year");
        }
        else if (year % 100 == 0){
            System.out.println("Not leap year .");
        }
        else if(year % 4 == 0){
            System.out.println("leap year.");
        }
        else{
            System.out.println("Not leap year.");
        }*/

        
        sc.close();
    }
}
