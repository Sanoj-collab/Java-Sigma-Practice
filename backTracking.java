

public class backTracking {
    //-----------------BackTracking Arrays----------------------
    public static void changeArr(int []arr, int i ,int val){
    
        if(i == arr.length){
            //printArr(arr);
            count++;
            return;
        }
        arr[i] = val;
        changeArr(arr, i+1 , val+1);
        arr[i] = arr[i] - 2;
    }
    public static void printArr(int []arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    //--------------------SubSets of string -------------------------
    public static void subSets(String str, StringBuilder ans, int i){
         if(i == str.length()){
            if(ans.length() == 0){
                System.out.print("[ ]");
            }else{
            System.out.println(ans.toString()+" ");
            }
            return;
         }
        

        // For yes choice
        ans.append(str.charAt(i));
        subSets(str, ans, i+1);
       
        ans.deleteCharAt(ans.length()-1);
        // For no choice
        subSets(str, ans, i+1);
    }
    //---------------------Permutation----------------------
    public static void findPermutation(String str, String ans){
        if(str.length() == 0){
            System.out.println(ans);
            return;
        }
        for(int i = 0; i < str.length(); i++){
            char curr = str.charAt(i);
            String newStr = str.substring(0,i) + str.substring(i+1);
            findPermutation(newStr, ans+curr);
        }
    }
    //-------------------nQueens-------------------------------
    public static boolean isSafe(char[][] board, int row, int col){
        //vertical up
        for(int i = row -1; i >=0; i--){
            if(board[i][col] == 'Q'){
                return false;
            }
        }
        // diagonal left up 
        for(int i = row-1, j = col -1; i >= 0 && j >= 0; i--, j--){
            if(board[i][j] == 'Q'){
                return false;
            }
        }
        // Diagolnal right up 
        for(int i = row-1, j = col+1; i >= 0 && j < board.length; i--,j++){
            if(board[i][j] == 'Q'){
                return false;
            }
        }
        return true;
    }
    public static boolean  nQueens(char[][]board, int row){
        if(row == board.length){
            //printBoard(board);
           count++;
            //return; // print all solution 
           return true;// print only one solution 
        }
        //Coulmun loop
        for(int j = 0; j < board.length; j++){
            if(isSafe(board, row, j)){
                board[row][j] = 'Q';
                //nQueens(board, row+1);// recursion | function call
                if(nQueens(board, row+1)){// for only one solution 
                    return true;
                }
                board[row][j] = 'x'; //BAckTracking..
            }
        }
        return false;
        
    }
    public static void printBoard(char[][]board){
        System.out.println("******Chess board*******");
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board.length; j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
    static int count = 0;
    //--------------------------Grid ways-----------------------
    public static int gridWays(int i , int j, int n, int m){
        if(i == n-1 && j == m -1){
            return 1;
        }
        if(i == n || j == n){
            return 0;
        }

        int w1 = gridWays(i+1, j, n, m);
        int w2 = gridWays(i, j+1, n, m);
        
        int totalWays = w1 + w2;
        return totalWays;
    }
    //---------------------Sudoku---------------------------
    public static boolean isSafe(int[][]sudoku, int row, int col, int digit){
        //row
        for(int i = 0; i <= 8; i++){
            if(sudoku[i][col] == digit){
                return false;
            }
        }

        //column
        for(int j = 0; j <= 8; j++){
            if(sudoku[row][j] == digit){
                return false;
            }
        }
        
        //grid
        int sr = (row/3)*3;
        int sc = (col/3)*3;
        for(int i = sr; i <sr+3; i++){
            for(int j = sc; j < sc+3; j++){
                if(sudoku[i][j] == digit){
                    return false;
                }
            }
        }
        return true;
    }
    public static boolean sudokuSolver(int[][] sudoku, int row, int col){
        //base case
        if(row == 9){
            return true;
        }
        //Recursion
        int nextRow = row, nextCol = col+1;
        if(col+1 == 9){
            nextRow = row + 1;
            nextCol = 0;
        }
        if(sudoku[row][col] != 0){
            return sudokuSolver(sudoku, nextRow, nextCol);
        }
        for(int digit = 1; digit <= 9; digit++){
            if(isSafe(sudoku, row, col, digit)){
                sudoku[row][col]= digit;
                if(sudokuSolver(sudoku, nextRow, nextCol)){
                   return true;
                }
                sudoku[row][col] = 0;
            }
        }
        return false;
    }
    public static void printSudoku(int [][]sudoku){
        for(int i = 0; i <= 8; i++){
          for(int j = 0; j <= 8; j++){
            System.out.print(sudoku[i][j]+" ");
          }
          System.out.println();
        }
    }
    //------------------Knight's tour-----------------
    static int N=8;
    public static boolean isSafe(int x, int y, int sol[][]){
       return(x >= 0 && x < N && y >= 0 && y < N && sol[x][y] == -1);
    }
    public static void printSolution(int sol[][]){
        for(int x = 0; x < N; x++){
            for(int y = 0; y < N; y++){
                System.out.print(sol[x][y]+" ");
            }
            System.out.println();
        }
    }
    public static boolean solveKT(){
        int sol [][]= new int[8][8];
        for(int x = 0; x < N; x++)
            for(int y = 0; y < N; y++)
                sol[x][y] = -1;
            
        int xMove[] = {2, 1, -1, -2, -2, -1, 1, 2};
        int yMove[] = {1, 2, 2, 1, -1, -2, -2, -1};
        
        sol[0][0] = 0;
        if(!solveKTUtil(0, 0, 1, sol, xMove, yMove)){
           System.out.println("Solution does not Exist.");
           return false;
        }
        else{
            printSolution(sol);
            return true;
        }
    }
    public static boolean solveKTUtil(int x, int y, int movei, int sol[][], int xMove[], int yMove[]){
        int k, nextX, nextY;
        if(movei == N * N) return true;
        for(k = 0; k < 8; k++){
            nextX = x + xMove[k];
            nextY = y + yMove[k];
            if(isSafe(nextX, nextY, sol)){
                sol[nextX][nextY] = movei;
            }
            if(solveKTUtil(nextX, nextY, movei +1, sol, xMove, yMove)) return true;
            else sol[nextX][nextY] = -1;
        }
        return false;
    }
    //-------------------------------------Rat in maze ---------------------------------
    public static void printSol(int sol[][]){
        for(int i = 0; i < sol.length; i++){
            for(int j = 0; j < sol.length; j++){
                System.out.print(" "+ sol[i][j]+ " ");
            }
            System.out.println();
        }
    }
    public static boolean isSafe(int maze[][], int x, int y){
        return(x >= 0 && x < maze.length && y >= 0 && y <= maze.length && maze[x][y] == 1);
    }
    public static boolean solveMaze(int maze[][]){
        int N = maze.length;
        int sol[][] = new int [N][N];
        if(solveMazeUtill(maze, 0, 0, sol) == false){
            System.out.println("Soluton doesn't exist.");
            return false;
        }
        printSol(sol);
        return true;
    }
    public static boolean solveMazeUtill(int maze[][], int x, int y, int sol[][]){
        if(x == maze.length - 1 && y == maze.length - 1 && maze[x][y] == 1){
            sol[x][y] = 1;
            return true;
        }
        if(isSafe(maze, x, y) == true){
            if(sol[x][y] == 1){
            return false;
            }
            sol[x][y] = 1;
            if(solveMazeUtill(maze, x+1, y, sol)){
            return true;
            }
            if(solveMazeUtill(maze, x, y+1, sol)){
            return true;
            }
            sol[x][y] = 0;
            return false;
        }
        return false;
    }
    public static void main(String[] args) {
        //--------------Backtracking Arrays------------------
        // int []arr = new int [5];
        // changeArr(arr, 0,1);
        // printArr(arr);
        //------------------------SubString/SubSet-----------------------
        // subSets("abc", new StringBuilder(""), 0);
        
        //----------Permutation----------------------------
        
        // findPermutation("abc", "");

        //--------------------------nQueens----------------------
        //  int n = 4;
        //  char[][] board = new char[n][n];
        //  //Intiallization
        //  for(int i = 0; i < n ; i++){
        //      for(int j = 0; j < n; j++){
        //          board[i][j] = 'x';
        //      }
        //  }
        // nQueens(board, 0);// for all solution 

     //     if(nQueens(board, 0)){
     //      System.out.println("solution ois possible:");
     //      printBoard(board);
     //     }else{
     //      System.out.println("solution is not possible.");
     //     }
     // System.out.println("Total number of ways to solve nQueens :"+count);

     //------------------------------Grid ways--------------------

     //System.out.println(gridWays(0, 0, 3, 3));

     //-------------------------Sudoku----------------
     //int[][]sudoku= {{0, 0, 8, 0, 0, 0, 0, 0, 0},{4, 9, 0, 1, 5, 7, 0, 0, 2},{0, 0, 3, 0, 0, 4, 1, 9, 0},{1, 8, 5, 0, 6, 0, 0, 2, 0},{0, 0, 0, 0, 2, 0, 0, 6, 0},{9, 6, 0, 4, 0, 5, 3, 0, 0},{0, 3, 0, 0, 7, 2, 0, 0, 4},{0, 4, 9, 0, 3, 0, 0, 5, 7},{8, 2, 7, 0, 0, 9, 0, 1, 3}};
      //  if(sudokuSolver(sudoku, 0, 0)){
      //     System.out.println("Solution exists");
      //     printSudoku(sudoku);
      //  }else{
      //     System.out.println("Solution doesn't exists");
      //  }
      //   sudokuSolver(sudoku, 0, 0);
      //   printSudoku(sudoku);
      //------------------------Knight's tour-------------

      //solveKT();
      
      //----------------------Rat in Maze------------------
      int maze[][]= {{1, 0, 0, 0}, {1, 1, 0, 1}, {0, 1, 0, 0},{1, 1, 1, 1}};
      System.out.println(solveMaze(maze));
    }
}
