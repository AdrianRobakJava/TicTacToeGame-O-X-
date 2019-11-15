package ol.alx.kpij.Kolko;

public class Board {

	private String field1 = " ";
	private String field2 = " ";
	private String field3 = " ";
	private String field4 = " ";
	private String field5 = " ";
	private String field6 = " ";
	private String field7 = " ";
	private String field8 = " ";
	private String field9 = " ";
	private String lastPlayer = "";
	//private BoardHistory boardHistory;
	private int counter = 0;
	private int moveCounter = 0;
	
	public Board() {
		
	}
	
	public boolean addElement(String back) {
		if (back.toUpperCase().equals("C")) {
			if (moveCounter > 0) {
				//this.BoardHistory.backMove();
				return true;
			} else {
				System.out.println("Nie możesz cofnąć ruchu, bo zadnego jeszcze nie było.");
				return false;
			}
		} else {
			return false;
		}
	}
	
	public boolean addElement(int fieldNumber, String typeOfElement) {
		
		if (!typeOfElement.toUpperCase().equals(lastPlayer) && (typeOfElement.toUpperCase().equals("X") || typeOfElement.toUpperCase().equals("O"))) {

			switch (fieldNumber) {
			case 1:
				if (field1.equals(" ")) {
					field1 = typeOfElement.toUpperCase();
					lastPlayer = typeOfElement.toUpperCase();
					BoardHistory.saveMove(this);
					moveCounter++;
					return true;
				} else {
					System.out.println("To pole jest już zajęte");
					return false;
				}
			case 2:
				if (field2.equals(" ")) {
					field2 = typeOfElement.toUpperCase();
					lastPlayer = typeOfElement.toUpperCase();
					BoardHistory.saveMove(this);
					moveCounter++;
					return true;
				} else {
					System.out.println("To pole jest już zajęte");
					return false;
				}
			case 3:
				if (field3.equals(" ")) {
					field3 = typeOfElement.toUpperCase();
					lastPlayer = typeOfElement.toUpperCase();
					BoardHistory.saveMove(this);
					moveCounter++;
					return true;
				} else {
					System.out.println("To pole jest już zajęte");
					return false;
				}
			case 4:
				if (field4.equals(" ")) {
					field4 = typeOfElement.toUpperCase();
					lastPlayer = typeOfElement.toUpperCase();
					BoardHistory.saveMove(this);
					moveCounter++;
					return true;
				} else {
					System.out.println("To pole jest już zajęte");
					return false;
				}
			case 5:
				if (field5.equals(" ")) {
					field5 = typeOfElement.toUpperCase();
					lastPlayer = typeOfElement.toUpperCase();
					BoardHistory.saveMove(this);
					moveCounter++;
					return true;
				} else {
					System.out.println("To pole jest już zajęte");
					return false;
				}
			case 6:
				if (field6.equals(" ")) {
					field6 = typeOfElement.toUpperCase();
					lastPlayer = typeOfElement.toUpperCase();
					BoardHistory.saveMove(this);
					moveCounter++;
					return true;
				} else {
					System.out.println("To pole jest już zajęte");
					return false;
				}
			case 7:
				if (field7.equals(" ")) {
					field7 = typeOfElement.toUpperCase();
					lastPlayer = typeOfElement.toUpperCase();
					BoardHistory.saveMove(this);
					moveCounter++;
					return true;
				} else {
					System.out.println("To pole jest już zajęte");
					return false;
				}
			case 8:
				if (field8.equals(" ")) {
					field8 = typeOfElement.toUpperCase();
					lastPlayer = typeOfElement.toUpperCase();
					BoardHistory.saveMove(this);
					moveCounter++;
					return true;
				} else {
					System.out.println("To pole jest już zajęte");
					return false;
				}
			case 9:
				if (field9.equals(" ")) {
					field9 = typeOfElement.toUpperCase();
					lastPlayer = typeOfElement.toUpperCase();
					BoardHistory.saveMove(this);
					moveCounter++;
					return true;
				} else {
					System.out.println("To pole jest już zajęte");
					return false;
				}
			}
		}
		System.out.println("Podano nie poprawny element, lub inna osoba ma teraz róch!");
		return false;
		
	}

	public String whoseMove() {
		
		if (lastPlayer.equals("") ) {
			System.out.println("Jeszcze nikt nie zaczął gry.");
			return "X/O";
		} else if (lastPlayer.equals("X")) {
			System.out.println("Teraz ruch gracza z O.");
			return "O";
		} else {
			System.out.println("Teraz ruch gracza z X.");
			return "X";
		}
		
	}
	
	public boolean endGame(Board board) {
		
		if (board.getField1().equals(board.getField2()) && board.getField1().equals(board.getField3()) && !board.getField1().equals(" ")) {
			System.out.println("Brawo wygrał gracz z " + board.getField1());
			return false;
		} else if (board.getField4().equals(board.getField5()) && board.getField4().equals(board.getField6()) && !board.getField4().equals(" ")) {
			System.out.println("Brawo wygrał gracz z " + board.getField4());
			return false;
		} else if (board.getField7().equals(board.getField8()) && board.getField7().equals(board.getField9()) && !board.getField7().equals(" ")) {
			System.out.println("Brawo wygrał gracz z " + board.getField7());
			return false;
		} else if (board.getField1().equals(board.getField4()) && board.getField1().equals(board.getField7()) && !board.getField1().equals(" ")) {
			System.out.println("Brawo wygrał gracz z " + board.getField1());
			return false;
		} else if (board.getField2().equals(board.getField5()) && board.getField2().equals(board.getField8()) && !board.getField2().equals(" ")) {
			System.out.println("Brawo wygrał gracz z " + board.getField2());
			return false;
		} else if (board.getField3().equals(board.getField6()) && board.getField3().equals(board.getField9()) && !board.getField3().equals(" ")) {
			System.out.println("Brawo wygrał gracz z " + board.getField3());
			return false;
		} else if (board.getField1().equals(board.getField5()) && board.getField1().equals(board.getField9()) && !board.getField1().equals(" ")) {
			System.out.println("Brawo wygrał gracz z " + board.getField1());
			return false;
		} else if (board.getField3().equals(board.getField5()) && board.getField3().equals(board.getField7()) && !board.getField3().equals(" ")) {
			System.out.println("Brawo wygrał gracz z " + board.getField3());
			return false;
		} else {
			return true;
		}
		
	}
	
	

	@Override
	public String toString() {
		String board = String.format(
				"Następny ruch:\n %s | %s | %s \n___|___|___\n   |   |   \n %s | %s | %s \n___|___|___\n   |   |   \n %s | %s | %s \n",
				field1, field2, field3, field4, field5, field6, field7, field8, field9);

		return board;

	}

	public String getField1() {
		return field1;
	}

	public void setField1(String field1) {
		this.field1 = field1;
	}

	public String getField2() {
		return field2;
	}

	public void setField2(String field2) {
		this.field2 = field2;
	}

	public String getField3() {
		return field3;
	}

	public void setField3(String field3) {
		this.field3 = field3;
	}

	public String getField4() {
		return field4;
	}

	public void setField4(String field4) {
		this.field4 = field4;
	}

	public String getField5() {
		return field5;
	}

	public void setField5(String field5) {
		this.field5 = field5;
	}

	public String getField6() {
		return field6;
	}

	public void setField6(String field6) {
		this.field6 = field6;
	}

	public String getField7() {
		return field7;
	}

	public void setField7(String field7) {
		this.field7 = field7;
	}

	public String getField8() {
		return field8;
	}

	public void setField8(String field8) {
		this.field8 = field8;
	}

	public String getField9() {
		return field9;
	}

	public void setField9(String field9) {
		this.field9 = field9;
	}

	public String getLastPlayer() {
		return lastPlayer;
	}

	public void setLastPlayer(String lastPlayer) {
		this.lastPlayer = lastPlayer;
	}

	public int getMoveCounter() {
		return moveCounter;
	}

	public void setMoveCounter(int moveCounter) {
		this.moveCounter = moveCounter;
	}
	
	

}
