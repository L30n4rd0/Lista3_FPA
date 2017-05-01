/**
 * 
 */
package ufrpe.fpa.q8;

/**
 * @author leonardo
 *
 */
public class Gomoku {
	private char matrix[][];
	private int matrixSize = 19;
	
	public Gomoku() {
		this.matrix = new char[this.matrixSize][this.matrixSize];
		initMatrix();
		
	}
	
	private void initMatrix () {
		
		for (int row = 0; row < this.matrixSize; row++) {
			for (int column = 0; column < this.matrixSize; column++) {
				this.matrix[row][column] = '+';
			}
		}
		
	}
	
	protected boolean isCoordinatesFree(int row, int column) {
		if (this.matrix[row][column] == '+') 
			return true;
		
		else
			return false;
	}
	
	protected void playBlack(int row, int column) {
		this.matrix[row][column] = 'P';
		
	}
	
	protected void playWhite(int row, int column) {
		this.matrix[row][column] = 'B';
		
	}
	
	protected boolean checkMove(int row, int column) {
		boolean existWinner = false;
		int counter;
		
		/*
		 * Check row
		 * */
		if (!existWinner) {
			counter = 1;
			
			for (int i = column - 1; i > column - 5 && counter < 5; i--) {

				if (i > -1) {
					if (this.matrix[row][i] == this.matrix[row][column]) {
						counter++;
						
						if (counter == 5) {
							existWinner = true;
						}
						
					} else {
						break;
					}
					
				} else {
					break;
				}
			}
			
			for (int i = column + 1; i < column + 5 && counter < 5; i++) {

				if (i < this.matrixSize) {
					if (this.matrix[row][i] == this.matrix[row][column]) {
						counter++;
						if (counter == 5) {
							existWinner = true;
						}
						
					} else {
						break;
					}
					
				} else {
					break;
				}
			}
			
		}
		
		/*
		 * Check column
		 * */
		if (!existWinner) {
			counter = 1;
			
			for (int i = row - 1; i > row - 5 && counter < 5; i--) {

				if (i > -1) {
					if (this.matrix[i][column] == this.matrix[row][column]) {
						counter++;
						
						if (counter == 5) {
							existWinner = true;
						}
						
					} else {
						break;
					}
					
				} else {
					break;
				}
			}
			
			for (int i = row + 1; i < row + 5 && counter < 5; i++) {

				if (i < this.matrixSize) {
					if (this.matrix[i][column] == this.matrix[row][column]) {
						counter++;
						if (counter == 5) {
							existWinner = true;
						}
						
					} else {
						break;
					}
					
				} else {
					break;
				}
			}
			
		}
		
		/*
		 * Check increasing diagonal
		 * */
		if (!existWinner) {
			counter = 1;
			
			for (int i = row - 1, j = column + 1; i > row - 5 && counter < 5; i--, j++) {

				if (i > -1 && j < this.matrixSize) {
					if (this.matrix[i][j] == this.matrix[row][column]) {
						counter++;
						
						if (counter == 5) {
							existWinner = true;
						}
						
					} else {
						break;
					}
					
				} else {
					break;
				}
			}
			
			for (int i = row + 1, j = column - 1; i < row + 5 && counter < 5; i++, j--) {

				if (i < this.matrixSize && j > -1) {
					if (this.matrix[i][j] == this.matrix[row][column]) {
						counter++;
						if (counter == 5) {
							existWinner = true;
						}
						
					} else {
						break;
					}
					
				} else {
					break;
				}
			}
			
		}
		
		/*
		 * Check decreasing diagonal
		 * */
		if (!existWinner) {
			counter = 1;
			
			for (int i = row - 1, j = column - 1; i > row - 5 && counter < 5; i--, j--) {

				if (i > -1 && j > -1) {
					if (this.matrix[i][j] == this.matrix[row][column]) {
						counter++;
						
						if (counter == 5) {
							existWinner = true;
						}
						
					} else {
						break;
					}
					
				} else {
					break;
				}
			}
			
			for (int i = row + 1, j = column + 1; i < row + 5 && counter < 5; i++, j++) {

				if (i < this.matrixSize && j < this.matrixSize) {
					if (this.matrix[i][j] == this.matrix[row][column]) {
						counter++;
						if (counter == 5) {
							existWinner = true;
						}
						
					} else {
						break;
					}
					
				} else {
					break;
				}
			}
			
		}
		
		return existWinner;
		
	}
	
	protected void playComputer() {
		
		
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		String stringReturn = "   1  2  3  4  5  6  7  8  9 10 11 12 13 14 15 16 17 18 19\n";
		
		for (int row = 0; row < this.matrixSize; row++) {
			
			if (row + 1 < 10) {
				stringReturn += row + 1 + "  ";
				
			} else {
				stringReturn += row + 1 + " ";

			}
			
			for (int column = 0; column < this.matrixSize; column++) {
				stringReturn += this.matrix[row][column] + "  ";
			}
			
			stringReturn += "\n";
		}
		
		return stringReturn;
	}
	
	

}
