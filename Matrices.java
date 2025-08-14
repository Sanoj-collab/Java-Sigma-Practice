import java.util.Scanner;

public class Matrices{
    public static boolean search(int [][] arr, int key){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
               if(arr[i][j] == key){
                return true;
               }
            }
        }    
        return false;
    }
    //Spiral matrix  Important matrix Question asked in many mnc company ...............
    public static void printSpiral(int [][] matrix){
        int stRow = 0, stCol = 0;
        int endRow = matrix.length-1;
        int endCol = matrix[0].length-1;

        while(stRow <= endRow && stCol <= endCol){

            for(int j= stCol; j <= endCol; j++){
                System.out.print(matrix[stRow][j]+" ");
            }
            for(int i = stRow+1; i <= endRow; i++){
                System.out.print(matrix[i][endCol]+" ");
            }
            for(int j = endCol-1; j >= stCol; j--){
                if(stRow == endRow) break;
                System.out.print(matrix[endRow][j]+" ");
            }
            for(int i = endRow-1; i >= stRow+1; i--){
                if(stCol == endCol) break;
                System.out.print(matrix[i][stCol]+" ");
            }
            stRow++;
            stCol++;
            endRow--;
            endCol--;
        }
        System.out.println();
    }
    //Brute force method ---------------------Important Question asked in many company and many times......
    public static int diagonalSum(int[][] matrix){
        int sum = 0;
        for(int i = 0; i < matrix.length;i++){
            for(int j = 0; j < matrix[0].length; j++){
                // for primary diagonal
                if(i == j){
                    sum += matrix[i][j];
                }
                // Secondary diagonal 
                if(i+j == matrix.length-1){
                    sum += matrix[i][j];
                }
            }
        }
        return sum;
    }
    public static int DiagonalSum(int [][]matrix){
        int sum = 0; 
        for(int i =0; i < matrix.length; i++){ 
           // pd
           
            sum += matrix[i][i];     // Since i And j is equal .
           
           //sd
           if(i != matrix.length-1-i){
            sum += matrix[i][i];
           }
        }
        return sum ;
    }
    public static void main(strings[] args) {
        // int arr[][] = new int [2][3];
        
        // Scanner sc = new Scanner(System.in);
        // for(int i = 0; i < arr.length; i++){
        //     for(int j = 0; j < arr[0].length; j++){
        //         arr[i][j] = sc.nextInt();
        //     }
        // }
        // for(int i = 0; i < arr.length; i++){
        //     for(int j = 0; j < arr[0].length; j++){
        //         System.out.print(arr[i][j] +" ");
        //     }
        //     System.out.println();
        // }
        int [][]arr ={{1, 2, 3, 4},{9, 6, 7, 8}};
         System.out.println(search(arr, 5));
       //---------------------------------------------------------------------------------
        //int matrix[][] = {{1, 2, 3, 4},{5, 6, 7, 8},{9, 10, 11, 12}, {13, 14, 15, 16, }};
       // printSpiral(matrix);
        
       // System.out.println(diagonalSum(matrix));
        //int matrix[][] ={{1, 2, 3}, {4, 5, 6},{7, 8, 9}};
       // System.out.println(DiagonalSum(matrix)); 
    }
}
