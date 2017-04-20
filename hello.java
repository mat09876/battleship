import java.util.*;
   import java.util.Scanner;

   public class hello
   {
      Scanner input = new Scanner(System.in);
      public static final boolean DEBUG = false;

//this is a ittle welcome message for eoin
      public static void welcomeToTheGame() 
      {  
         System.out.println(" ");
         System.out.println("----------------------------------");
         System.out.println("Yooooo eoin welcome to and *** battleships game we");
         System.out.println("hope you enjoyed it as it wasnt as easy as we first thought");
         System.out.println("To play the game please enter in a row first then press enter then enter a col");
         System.out.println("----------------------------------");
         System.out.println(" ");

      }
//this is a creating the text that goes over and under the grid of player 1
      public static void playername1()
      {  
         System.out.println(" ");
         System.out.println("--------BEST--OF--LUCK--PLAYER1-------");
         System.out.println(" ");

      }

//this is a creating the text that goes over and under the grid of player 2

      public static void playername2()
      {
         System.out.println(" ");
         System.out.println("--------BEST--OF--LUCK--PLAYER2-------");
         System.out.println(" ");
      }

//this is a building the first display you will see on each player to make sure the grid is a new one
         public static void buildgrid1(String[][] grid)
         {
            for(int r = 0; r < grid.length; r++)
            {
               for(int c = 0; c < grid[0].length; c++)
               {
                  grid[r][c] = "-";
               }
            }
         }

//this is a building the first display you will see on each player to make sure the grid is a new one         


      public static void buildgrid2(String[][] grid)
      {
         for(int r = 0; r < grid.length; r++)
         {
            for(int c = 0; c < grid[0].length; c++)
            {
               grid[r][c] = "-";
            }
         }
      }



      public static void showgrid1(String[][] grid)
      {
         playername1();
         for(int r = 0; r < grid.length; r++)
         {
            if(DEBUG == true)
            {
               for(int c = 0; c < grid[0].length; c++)
               {
                  System.out.print(" "+grid[r][c]);
               }
               System.out.println("");
            }
            else
            {
               for(int c = 0; c < grid[0].length; c++)
               {
                  if(grid[r][c].equals("S"))
                  {
                     System.out.print(" "+"-");
                  }
                  else
                  {
                     System.out.print(" "+grid[r][c]);
                  }
               }
               System.out.println("");
            }
         }
         playername1();

         playername2();
         for(int r = 0; r < grid.length; r++)
         {
            if(DEBUG == true)
            {
               for(int c = 0; c < grid[0].length; c++)
               {
                  System.out.print(" "+grid[r][c]);
               }
               System.out.println("");
            }
            else
            {
               for(int c = 0; c < grid[0].length; c++)
               {
                  if(grid[r][c].equals("S"))
                  {
                     System.out.print(" "+"-");
                  }
                  else
                  {
                     System.out.print(" "+grid[r][c]);
                  }
               }
               System.out.println("");
            }
         }
         playername2();
      }
   

   public static void showgrid2(String[][] grid)
      {
         playername1();
         for(int r = 0; r < grid.length; r++)
         {
            if(DEBUG == true)
            {
               for(int c = 0; c < grid[0].length; c++)
               {
                  System.out.print(" "+grid[r][c]);
               }
               System.out.println("");
            }
            else
            {
               for(int c = 0; c < grid[0].length; c++)
               {
                  if(grid[r][c].equals("S"))
                  {
                     System.out.print(" "+"-");
                  }
                  else
                  {
                     System.out.print(" "+grid[r][c]);
                  }
               }
               System.out.println("");
            }
         }
         playername1();
      }
   
 // this is placing the battleships on the board     
      public static void createBattleships1(String[][] grid,int size)
      {
         if(Math.random() < 0.5)
         {
            int col = (int)(Math.random()*5);
            int row = (int)(Math.random()*7);
            for(int i = 0; i<size; i++)
            {
               grid[row][col+i] = "S";
            }
         }
         else
         {
            int col = (int)(Math.random()*7);
            int row = (int)(Math.random()*5);
            for(int i = 0; i<size; i++)
            {
               grid[row+i][col] = "S";
            }
         }
      }
 // this is placing the battleships on the board
      public static void createBattleships2(String[][] grid,int size)
      {
         if(Math.random() < 0.5)
         {
            int col = (int)(Math.random()*5);
            int row = (int)(Math.random()*7);
            for(int i = 0; i<size; i++)
            {
               grid[row][col+i] = "S";
            }
         }
         else
         {
            int col = (int)(Math.random()*7);
            int row = (int)(Math.random()*5);
            for(int i = 0; i<size; i++)
            {
               grid[row+i][col] = "S";
            }
         }
      }


      public static int player1turn(String[][] grid, int hits, int missiles)
      {
         Scanner input = new Scanner(System.in);
         int row,col;
         System.out.println("You have: "+ missiles +" missiles left!");
         System.out.println("Select a row to fire in: ");
         row = input.nextInt();
         while(row > 10 || row < 1) // Error checking for row
         {
            System.out.println("Enter a valid row (1 -> 10)");
            row = input.nextInt();
         }
         System.out.println("Select a column to fire in: ");
         col = input.nextInt();
         while(col > 10 || col < 1) // Error checking for column
         {
            System.out.println("Enter a valid col (1 -> 10)");
            col = input.nextInt();
         }
         if(grid[row-1][col-1].equals("S"))
         {
            hits ++;
            System.out.println("------- HIT -------");
            grid[row-1][col-1] = "!";
         }
         else
         {
            System.out.println("------- MISS -------");
            grid[row-1][col-1] = "M";
         }
         return hits;
      }



public static int player2turn(String[][] grid, int hits, int missiles)
      {
         Scanner input = new Scanner(System.in);
         int row,col;
         System.out.println("this is the number of missiles left"+ missiles);
         System.out.println("Select a row to fire in: ");
         row = input.nextInt();
         while(row > 10 || row < 1) // Error checking for row
         {
            System.out.println("make sure its wihin row 1-10");
            row = input.nextInt();
         }
         System.out.println("Select a column to fire in: ");
         col = input.nextInt();
         while(col > 10 || col < 1) // Error checking for column
         {
            System.out.println("make sure its wihin row 1-10");
            col = input.nextInt();
         }
         if(grid[row-1][col-1].equals("S"))
         {
            hits ++;
            System.out.println("------- HIT -------");
            grid[row-1][col-1] = "!";
         }
         else
         {
            System.out.println("------- MISS -------");
            grid[row-1][col-1] = "M";
         }
         return hits;
      }




      public static void endgamemessaging1(int hits, int missiles)
      {
         if(hits < 4)
            System.out.println("ahh see you just picked what player 1 for your battleships thats why you lost");
         if(missiles < 1)
            System.out.println("you have fired all your missiles");
         else
            if(hits >= 4)
            {
               System.out.println("you have beaten player 1 congradulations");
            }
         System.out.println("We hoped you enjyed playing this game of battleships");
      }

      public static void endgamemessaging2(int hits, int missiles)
      {
         if(hits < 4)
            System.out.println("ahh see you just picked what player 2 for your battleships thats why you lost");
         if(missiles < 1)
            System.out.println("You have lost all your missiles");
         else
            if(hits >= 4)
            {
               System.out.println("you have beaten player 2 congradulations");
            }
         System.out.println("We hoped you enjyed playing this game of battleships");
      }



      public static void main(String[] arg)
      {  
         welcomeToTheGame();
         String[][] grid = new String[10][10];
         buildgrid1(grid);
         createBattleships1(grid, 4);
         int missiles = 150;
         int hits = 0;
         /// Starting real stuff
         while(missiles > 0 && hits < 4)
         {
            showgrid1(grid);
            hits = player1turn(grid, hits, missiles);
            missiles --;
         }
         endgamemessaging1(hits, missiles);
      }
   }

