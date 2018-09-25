package hash;

import java.util.Scanner;

/**
 *
 * @author victor
 */
public class Game {
    
    Scanner input;
    Board board;
    public Game() {
        board = new Board();
        input = new Scanner(System.in);
    }
    
    public void startPvP() {
        int aux = 0;
        short check;
        boolean fim = false;
        
        board.printBoard();
        System.out.println("");
        while (!fim) {
            if (aux%2 == 0) {
                System.out.println("Vez de X");
                board.addX(input.nextInt(), input.nextInt());
            } else {
                System.out.println("Vez de O");
                board.addO(input.nextInt(), input.nextInt());
            }
            
            aux++;
            System.out.println("");
            board.printBoard();
            System.out.println("");
            check = board.check();
            switch (check) {
                case (1) :
                    System.out.println("X ganhou!");
                    fim = true;
                    break;
                case (2) :
                    System.out.println("O ganhou!");
                    fim = true;
                    break;
                case (-1) :
                    System.out.println("Empate!");
                    fim = true;
                    break;
            }
        }
    }
    
    public void startPvIA() {
        IA ia = new IA();
        int aux = 0;
        short check;
        boolean fim = false;
        
        board.printBoard();
        System.out.println("");
        while (!fim) {
            if (aux%2 == 0) {
                System.out.println("Vez de X");
                board.addX(input.nextInt(), input.nextInt());
            } else {
                System.out.println("Vez de O");
                board = ia.IaPlayed(board).getBoard();
            }
            
            aux++;
            System.out.println("");
            board.printBoard();
            System.out.println("");
            check = board.check();
            switch (check) {
                case (1) :
                    System.out.println("X ganhou!");
                    fim = true;
                    break;
                case (2) :
                    System.out.println("O ganhou!");
                    fim = true;
                    break;
                case (-1) :
                    System.out.println("Empate!");
                    fim = true;
                    break;
            }
        }
    }
    
    
    
}