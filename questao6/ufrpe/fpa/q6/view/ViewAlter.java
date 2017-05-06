/**
 * 
 */
package ufrpe.fpa.q6.view;

import java.util.Scanner;

import ufrpe.fpa.q6.control.BuildingControl;
import ufrpe.fpa.q6.model.vo.Building;

/**
 * @author leonardo
 *
 */
public class ViewAlter {
	
	private Scanner scanner;

	protected void alter() {
		/*
		 * Scanner for data collection
		 * */
		scanner = new Scanner(System.in);
		
		BuildingControl control = BuildingControl.getInstance();
		
		Building building;
		
		do {
			System.out.println("Digite o nome do imóvel que será alterado:");
			building = control.getBuildingByName(scanner.nextLine());
			
			if (building == null)
				System.out.println("Imóvel não encontrado na lista de cadastro!!");
			
		} while (building == null);
		
		int option = 100;
		
		
		while (option != 0) {
			System.out.println(menuAlter());
			option = Integer.parseInt(scanner.nextLine());
			
			switch (option) {
			
			case 0:
				System.out.println("Voltando para o menu principal!!");
				
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
				break;
				
			case 1:
				control.alterBuilding( this.alterName(building) );
				System.out.println("Nome alterado com sucesso!!");
				
				break;
				
			case 2:
				control.alterBuilding( this.alterAddress(building) );
				System.out.println("Endereço alterado com sucesso!!");
				
				break;
				
			default:
				System.out.println("Opção escolhida não é válida, escolha outra!");
				
				break;
				
			}// End switch
			
		}// End while
			
		
	}
	
	private String menuAlter() {
		
		return "\n\n### Menu Alterar cadastro ###\n"
				+ "Escolha uma opçao:\n"
				+ "1 - Alterar nome\n"
				+ "2 - Alterar endereço\n"
				+ "0 - Sair\n";
	}
	
	private Building alterName(Building building) {
		scanner = new Scanner(System.in);
		
		BuildingControl control = BuildingControl.getInstance();
		
		Building buildingTemp = building;
		
		String newName;
		
		do {
			System.out.println("Digite o novo nome do imóvel:");
			newName = scanner.nextLine();
			building = control.getBuildingByName(newName);
			
			if (building != null)
				System.out.println("Já existe um imóvel com este nome cadastrado, digite um nome diferente!!");
			
		} while (building != null);
		
		buildingTemp.setName(newName);
		
		return buildingTemp;
		
	}
	
	private Building alterAddress(Building building) {
		/*
		 * Scanner for data collection
		 * */
		scanner = new Scanner(System.in);
		
		Building buildingTemp = building;

		/*
		 * Class used for get address data from method addressForm()
		 */
		ViewRegister viewRegister = new ViewRegister();
		
		/*
		 * Alter address with address form data
		 */
		buildingTemp.setAddress( viewRegister.addressForm() );
		
		return buildingTemp;
		
	}

}
