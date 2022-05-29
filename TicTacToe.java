import java.util.Scanner;
//import java.lang.Math;

public class TicTacToe {
    private String board [] = {"1", "2","3","4","5","6","7","8","9"};
    
    public void printBoard(){
    for (int i= 0; i< board.length; i+= 3){
        System.out.println(board[i]+" "+board[i+1]+" "+board[i+2]);
        
}
    }
    public void playerMove(){
     Scanner input = new Scanner(System.in);
     boolean isValidMove = false;
     do{
     System.out.print("Player move = ");
     int move = input.nextInt();
        
        if ( move > 9 || move < 1 || board[move-1] == "X" || board[move-1] == "O"){
        System.out.println("Invalid Move. Please input again");
        }
        else{
        isValidMove = true;
        board[move-1] = "X";
        printBoard();
        }    
    }while (!isValidMove);   
         
    }
    
    public void computerRandomMove(){
        boolean isValidComputerMove = false;
        do{
        int computerMove = (int)((Math.random()*9)+1);
            if(board[computerMove-1] == "X" || board[computerMove-1] == "O"){
            }
            else{
            isValidComputerMove = true;
            System.out.println("Computer move = " + computerMove);
            board[computerMove-1] = "O";
            printBoard();
            }
        }while(!isValidComputerMove);
             
    }
    
    public void play(){
        for (int i=0; i<board.length; i++){
            if (i%2 == 0){
            computerRandomMove();    
            }
            else
            {playerMove();
            }
        
            if (won()){
        break;        
            }
        }
    }
    
        
    public boolean won(){
    
    boolean winner = false;        
    
    if(//check col
       ("X".equals(board[0]) && "X".equals(board[3]) && "X".equals(board[6]))||
       ("X".equals(board[1]) && "X".equals(board[4]) && "X".equals(board[7]))||
       ("X".equals(board[2]) && "X".equals(board[5]) && "X".equals(board[8]))||
        //check row
       ("X".equals(board[0]) && "X".equals(board[1]) && "X".equals(board[2]))||
       ("X".equals(board[3]) && "X".equals(board[4]) && "X".equals(board[5]))||
       ("X".equals(board[6]) && "X".equals(board[7]) && "X".equals(board[8]))||
        //check diagonal
       ("X".equals(board[0]) && "X".equals(board[4]) && "X".equals(board[8]))||     
       ("X".equals(board[2]) && "X".equals(board[4]) && "X".equals(board[6]))     
       ){
        winner = true;
       }
    else if (
       ("O".equals(board[0]) && "O".equals(board[3]) && "O".equals(board[6]))||
       ("O".equals(board[1]) && "O".equals(board[4]) && "O".equals(board[7]))||
       ("O".equals(board[2]) && "O".equals(board[5]) && "O".equals(board[8]))||
        //check row
       ("O".equals(board[0]) && "O".equals(board[1]) && "O".equals(board[2]))||
       ("O".equals(board[3]) && "O".equals(board[4]) && "O".equals(board[5]))||
       ("O".equals(board[6]) && "O".equals(board[7]) && "O".equals(board[8]))||
        //check diagonal
       ("O".equals(board[0]) && "O".equals(board[4]) && "O".equals(board[8]))||     
       ("O".equals(board[2]) && "O".equals(board[4]) && "O".equals(board[6]))         
       ) {
       winner = true;         
       
       }
    else {
       winner = false; 
    }   
    
    return winner;
    
    
    }
    
    }

    
    
    
