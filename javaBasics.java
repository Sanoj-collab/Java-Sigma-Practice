public class javaBasics {
    public static void main(strings[] args) {
        System.out.println("Hello sanoj ...");
        // fibanocci series...
        int ft = 0,sd = 1;
        int n = 7;
        int trd = 0;
        for(int i = 1; i < n; i++){    
            trd = ft + sd;
            ft = sd;
            sd = trd;
        }
        System.out.println(trd);
        // Armstrong number.
        int n1 = 153;
        int n2 = n1;
        int sum = 0;
        while(n1 != 0){
           int rem =  n1 % 10;
           n1 = n1/10; 
           sum += (rem* rem* rem);
        }
        System.out.println(sum);
        if(sum == n2) {
            System.out.println("The given number is Armstrong number .");
        }else{
            System.out.println("The given number is not Armstrong number .");
        }
        int x = 9, y = 12;
        int a= 2, b= 4 , c= 6;
        int exp = 4/3 * (x + 34) + 9 * (a +b * c) + (3 + y *(2 + a)) / (a + b * y);

        System.out.println(exp);
    }
}
