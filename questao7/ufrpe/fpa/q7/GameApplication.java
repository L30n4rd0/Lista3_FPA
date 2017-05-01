/**
 * 
 */
package ufrpe.fpa.q7;

import java.util.Scanner;

/**
 * @author leonardo
 *
 */
public class GameApplication {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Gomoku gomoku = new Gomoku();
		boolean playWhitePiece = true;
		Scanner scanner = new Scanner(System.in);
		String[] coordinates;
		int row, column;
		
		System.out.println(gomoku.toString());
		System.out.println("O JOGADOR 1 INICIA COM AS PEÇAS BRANCAS!\n"
				+ "As peças BRANCAS são representadas pela LETRA B.\n"
				+ "As peças PRETAS são representadas pela LETRA P.");
		
		while (true) {
			
			if (playWhitePiece) {
				
				playWhitePiece = false;
				
				System.out.println("JOGADOR 1: entre com as coordenadas separadas por vírgula (Linha, Coluna):");
				coordinates = scanner.nextLine().split(",");
				
				row = Integer.parseInt(coordinates[0]) - 1;
				column = Integer.parseInt(coordinates[1]) - 1;
				
				while (!gomoku.isCoordinatesFree(row, column)) {
					
					System.out.println("COORDENADAS OCUPADAS!!!\n"
							+ "JOGADOR 1: entre com as coordenadas separadas por vírgula (Linha, Coluna):");
					
					coordinates = scanner.nextLine().split(",");
					
					row = Integer.parseInt(coordinates[0]) - 1;
					column = Integer.parseInt(coordinates[1]) - 1;
					
				}
				
				gomoku.playWhite(row, column);
								
				if ( gomoku.checkMove(row, column) ) {
					System.out.println(gomoku.toString());
					System.out.println("JOGADOR 1 VENCEU!!");
					break;
					
				}
				
			} else {
				
				playWhitePiece = true;
				
				System.out.println("JOGADOR 2: entre com as coordenadas separadas por vírgula (Linha, Coluna):");
				coordinates = scanner.nextLine().split(",");
				
				row = Integer.parseInt(coordinates[0]) - 1;
				column = Integer.parseInt(coordinates[1]) - 1;
				
				while (!gomoku.isCoordinatesFree(row, column)) {
					
					System.out.println("COORDENADAS OCUPADAS!!!\n"
							+ "JOGADOR 2: entre com as coordenadas separadas por vírgula (Linha, Coluna):");
					
					coordinates = scanner.nextLine().split(",");
					
					row = Integer.parseInt(coordinates[0]) - 1;
					column = Integer.parseInt(coordinates[1]) - 1;
					
				}
				
				gomoku.playBlack(row, column);
				
				if ( gomoku.checkMove(row, column) ) {
					System.out.println(gomoku.toString());
					System.out.println("JOGADOR 2 VENCEU!!");
					break;
					
				}
			}
			
			System.out.println(gomoku.toString());
			
		}
	}
}
