	/*
	 *
	 * GRA KOLKO KRZYZYK
	 * Znacznikami może być X i O. (You can use only X and O.)
	 * Podanie literki 'c' spowoduje wycofanie ostatniego ruchu. (You can undo your move by entering c.)
	 * Aby sprawdzić czyj jest ruch wpisz 'w'. (You can check whose movement it is by entering w.)
	 * 
	 * numery pól do gry
	 * 
	 * 
	 *   1 | 2 | 3
	 *  ___|___|___
	 *     |   |
	 *   4 | 5 | 6
	 *  ___|___|___
	 *     |   |   
	 *   7 | 8 | 9
	 *   
	 *    
	 *  
	 */




import java.util.InputMismatchException;
import java.util.Scanner;

public class GameMain {
	
	public static void main(String[] args) {
		
		Board board = new Board();
		Scanner sc = new Scanner(System.in);
		String numberOfField;
		String playerElement;
		
		while(board.endGame(board)) {
			int moves = board.getMoveCounter();
			if (moves == 9) {
				System.out.println("Remis, nikt nie wygrał");
				break;
			}
			System.out.println(board);
			System.out.print("Podaj numer pola: ");
			numberOfField = sc.next();
			if (numberOfField.toUpperCase().equals("C")) {
				board = BoardHistory.backMove();
				continue;
			} else if (numberOfField.toUpperCase().equals("W")){
				board.whoseMove();
				continue;
			} else {
				System.out.print("Podaj swój element: ");
				playerElement = sc.next();
				try {
					board.addElement(Integer.parseInt(numberOfField), playerElement);
					
				} catch (InputMismatchException e) {
					System.out.println("Podano nie poprawną liczbę. Spróbuj jeszcze raz.");
					continue;
				} catch (NumberFormatException e) {
					System.out.println("Podano nie poprawną liczbę. Spróbuj jeszcze raz.");
					continue;
				}
				System.out.println();
			}
		}
		
		System.out.println(board);
		
		
		
		
		
		
		
		/*
		 * System.out.println(board); 
		 * board.addElement(5, "X");
		 * System.out.println(board); 
		 * board.addElement(3, "o");
		 * System.out.println(board); 
		 * board.addElement(2, "X");
		 * System.out.println(board); 
		 * board = BoardHistory.backMove();
		 * System.out.println(board); 
		 * board.addElement(2, "X");
		 * System.out.println(board); 
		 * board.whoseMove(); 
		 * board.addElement(1, "O");
		 * System.out.println(board); 
		 * board.endGame(board); 
		 * board.addElement(8, "X");
		 * System.out.println(board); 
		 * board.endGame(board);
		 */
	}

}
