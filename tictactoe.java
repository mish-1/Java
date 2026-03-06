import java.util.*;
import java.util.Scanner;
public class tictactoe{
    static char[][] board = {
        {' ', ' ', ' '},
        {' ', ' ', ' '},
        {' ', ' ', ' '}
    };
    static char turn='b';
   boolean selectwinner(){
        if(board[0][0] == board[0][1] && board[0][1] == board[0][2] && board[0][0] != ' '){
            System.out.println("wunner="+turn);
         return true;
        }
        else if(board[1][0] == board[1][1] && board[1][1] == board[1][2] && board[1][0] != ' '){
            System.out.println("wunner="+turn);
         return true;
        }
        else if(board[2][0] == board[2][1] && board[2][1] == board[2][2] && board[2][0] != ' '){
            System.out.println("wunner="+turn);
         return true;
        }
        else if(board[0][0] == board[1][0] && board[1][0] == board[2][0] && board[0][0] != ' '){
            System.out.println("wunner="+turn);
         return true;
        }
        else if(board[0][1] == board[1][1] && board[1][1] == board[2][1] && board[0][1] != ' '){
            System.out.println("wunner="+turn);
         return true;
        }
        else if(board[0][2] == board[1][2] && board[1][2] == board[2][2] && board[0][2] != ' '){
            System.out.println("wunner="+turn);
         return true;
        }
        else if(board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[0][0] != ' '){
            System.out.println("wunner="+turn);
         return true;
        }
        else if(board[0][2] == board[1][1] && board[1][1] == board[2][0] && board[0][2] != ' '){
            System.out.println("wunner="+turn);
         return true;
        }
        return false;   }
        void display(){
            for(int i=0;i<3;i++){
                for(int j=0;j<3;j++){
                    System.out.print(board[i][j]+" ");
                }
                System.out.println();

            }return;
        }
        void taketurn(){
           Scanner sc=new Scanner(System.in);
              int row,col;
              if(turn=='a'){
                        turn='b';
                    }
                    else{
                        turn='a';
                    }
                    System.out.println("player "+turn+" turn");
                    System.out.println("enter row and col");
                    row=sc.nextInt();
                    col=sc.nextInt();
                    if(board[row-1][col-1]==' '){
                        board[row-1][col-1]=turn;
                        
                    }
                    else{
                        System.out.println("invalid move");
                    }
                    
                
        }
    public static void main(String[] args) {
        tictactoe game=new tictactoe();
        for(int i=0;i<9;i++){
            game.display();
            game.taketurn();
            boolean winner=game.selectwinner();
            if(winner){
                game.display();
                break;
            }
        }
    }}
