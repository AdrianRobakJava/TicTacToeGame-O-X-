

import java.util.ArrayList;

public class BoardHistory extends Board {

	private int winByX = 0;
	private int winByY = 0;
	private static int count = 0;
	private static ArrayList<Board> moveHistory = new ArrayList<>();

	public BoardHistory() {

	}

	public static void saveMove(Board board) {

		Board newBoard = new Board();
		newBoard.setField1(board.getField1());
		newBoard.setField2(board.getField2());
		newBoard.setField3(board.getField3());
		newBoard.setField4(board.getField4());
		newBoard.setField5(board.getField5());
		newBoard.setField6(board.getField6());
		newBoard.setField7(board.getField7());
		newBoard.setField8(board.getField8());
		newBoard.setField9(board.getField9());
		newBoard.setLastPlayer(board.getLastPlayer());

		moveHistory.add(newBoard);
		count++;

	}

	public static Board backMove() {
		
		Board board = new Board();
		if (count > 1) {
			count--;
			return moveHistory.get(count - 1);	
		}
		return board;
	}

	public int getWinByX() {
		return winByX;
	}

	public void setWinByX(int winByX) {
		this.winByX = winByX;
	}

	public int getWinByY() {
		return winByY;
	}

	public void setWinByY(int winByY) {
		this.winByY = winByY;
	}

	public ArrayList<Board> getMoveHistory() {
		return moveHistory;
	}

	public void setMoveHistory(ArrayList<Board> moveHistory) {
		this.moveHistory = moveHistory;
	}

}
