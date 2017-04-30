/**
 * 
 */
package ufrpe.fpa.q6.view;

import java.util.Scanner;

/**
 * @author leonardo
 *
 */
public class ViewPrincipal {
	
	private ViewAlter viewAlter;
	private ViewDelete viewDelete;
	private ViewRegister viewRegister;
	private ViewSearch viewSearch;
	
	/**
	 */
	public ViewPrincipal() {
		this.viewAlter = new ViewAlter();
		this.viewDelete = new ViewDelete();
		this.viewRegister = new ViewRegister();
		this.viewSearch = new ViewSearch();
	}
	
	public void start() {
		int option = 100;
		Scanner scanner = new Scanner(System.in);
		
		while (option != 0) {
			System.out.println(menuPrincipal());
			option = Integer.parseInt(scanner.nextLine());
			
			switch (option) {
			
			case 0:
				System.out.println("Encerrando o sistema!!");
				
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				break;
				
			case 1:
				this.viewRegister.register();
				
				break;
				
			case 2:
				this.viewAlter.alter();
				
				break;
				
			case 3:
				this.viewDelete.delete();
				
				break;
				
			case 4:
				this.viewSearch.startSearch();
				
				break;

			default:
				System.out.println("Opção escolhida não é válida, escolha outra!");
				
				break;
			}
		}
	}
	
	private String menuPrincipal() {
		
		return "\n\n### Menu principal ###\n"
				+ "Escolha uma opçao:\n"
				+ "1 - Cadastrar\n"
				+ "2 - Alterar\n"
				+ "3 - Deletar\n"
				+ "4 - Pesquisar/Listar\n"
				+ "0 - Sair\n";
		
	}

}
