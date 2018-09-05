/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connectfour;

/**
 *
 * @author Kenne
 */
public class ConnectFour {
    private static char[][] gameboard;
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        gameboard = createBoard('b');
        printBoard();
        
        
    }
    
    private static char[][]createBoard(char startingCharacter){
        char [][] gameboard2 = new char [6][7];
                
        for(int i = 0; i < gameboard2.length; i++){
            for(int j = 0; j< gameboard2[i].length; j++){
                gameboard2[i][j] = startingCharacter;
                }
     
        }

        
        return gameboard2;
        
    }
    
    private static void printBoard(){
               
        for(int i = 0; i < gameboard.length; i++){
            for(int j = 0; j< gameboard[i].length; j++){
                System.out.print(gameboard[i][j]);
           
                }
            System.out.println();
     
        }
    }
    
}
