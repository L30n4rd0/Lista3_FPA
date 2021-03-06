/**
 * 
 */
package ufrpe.fpa.q6.view;

import java.util.List;
import java.util.Scanner;

import ufrpe.fpa.q6.control.BuildingControl;
import ufrpe.fpa.q6.model.vo.Building;

/**
 * @author leonardo
 *
 */
public class ViewSearch {
	
	private Scanner scanner;

	protected void startSearch() {
		int option = 100;
		
		scanner = new Scanner(System.in);
		
		while (option != 0) {
			System.out.println(menuSearch());
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
				this.searchByName();
				
				break;
				
			case 2:
				this.searchByFilter();
				
				break;
				
			case 3:
				this.listAllRegisted();
				
				break;
				
			default:
				System.out.println("Opção escolhida não é válida, escolha outra!");
				
				break;
				
			}// End switch
			
		}// End while
		
	}
	
	private void searchByName() {
		scanner = new Scanner(System.in);
		System.out.println("Digite o nome do imóvel para pesquisa:\n");
		String name  = scanner.nextLine();
		
		BuildingControl control = BuildingControl.getInstance();
		
		Building building = control.getBuildingByName(name);
		
		if (building != null)
			System.out.println(building.toString());
			
		else
			System.out.println("Imóvel não cadastrado!!");
		
	}
	
	private void searchByFilter() {
		ViewRegister viewRegister = new ViewRegister();
		
		BuildingControl control = BuildingControl.getInstance();
		
		System.out.println("Preencha o formulário com os dados que serão pesquisados.\n"
				+ "Caso não queira incluir uma determinada característica ao filtro deixe em branco!");
		
		Building building = viewRegister.completeForm();
		
		List<Building> buildingList = control.getFilteredBuildingList(building);
		
		if (!buildingList.isEmpty()) {
			System.out.println("### Imóveis encontrados ###");
			System.out.println("Quantidade: " + buildingList.size());
			
			for (Building tempBuilding : buildingList) {
				System.out.println(tempBuilding.toString());
				System.out.println("***********************************************************************");
			}
			
			System.out.println("Litagem finalizada!");
			
		} else		
			System.out.println("Não foi encontrado imóveis com essas caracterísicas!!");
		
	}
	
	private void listAllRegisted() {
		BuildingControl control = BuildingControl.getInstance();
		
		List<Building> buildingList = control.getAllBuilding();
		
		if (!buildingList.isEmpty()) {
			System.out.println("### Todos os imóveis ###");
			System.out.println("Quantidade: " + buildingList.size());
			
			for (Building building : buildingList) {
				System.out.println(building.toString());
				System.out.println("***********************************************************************");
			}
			
			System.out.println("Litagem finalizada!");
			
		} else		
			System.out.println("Ainda não existe registro de imóveis!!");
		
	}
	
	private String menuSearch() {
		
		return "\n\n### Menu de pesquisa ###\n"
				+ "Escolha uma opçao:\n"
				+ "1 - Pesquisar por nome\n"
				+ "2 - Pesquisa avançada com filtros\n"
				+ "3 - Listar todos os cadastrados\n"
				+ "0 - Voltar para o menu principal\n";
		
	}

}
