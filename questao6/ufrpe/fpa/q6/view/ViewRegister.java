/**
 * 
 */
package ufrpe.fpa.q6.view;

import java.util.Scanner;

import ufrpe.fpa.q6.control.BuildingControl;
import ufrpe.fpa.q6.model.vo.Address;
import ufrpe.fpa.q6.model.vo.Apartment;
import ufrpe.fpa.q6.model.vo.Building;
import ufrpe.fpa.q6.model.vo.CommonAreaItem;

/**
 * @author leonardo
 *
 */
public class ViewRegister {
	
	private Scanner scanner;

	protected void register() {
		BuildingControl control = BuildingControl.getInstance();
		
		if ( control.insertBuilding( completeForm() ) )
			System.out.println("Imóvel inserido com sucesso!!");
		
		else
			System.out.println("Já existe uma imóvel com esse nome cadastrado!!");
		
	}
	
	protected Building completeForm() {
		scanner = new Scanner(System.in);
		
		/*
		 * General attributes
		 * */
		String name;
		int floorsNumber, apartmentsPerFloor;
		
		/*
		 * 
		 * */
		Address address;
		Building building;
		
		System.out.println("### FORMULÁRIO ###");
		
		System.out.println("Digite o nome do imóvel:");
		name = scanner.nextLine();
		
		System.out.println("Digite a quantidade de andares do imóvel:");
		String tempString = scanner.nextLine();
		
		if (tempString.equalsIgnoreCase(""))
			floorsNumber = 0;
			
		else
			floorsNumber = Integer.parseInt(tempString);
		
		System.out.println("Digite a quantidade de apartamentos por andar:");
		tempString = scanner.nextLine();
		
		if (tempString.equalsIgnoreCase(""))
			apartmentsPerFloor = 0;
			
		else
			apartmentsPerFloor = Integer.parseInt(tempString);
		
		System.out.println("ENDEREÇO");
		
		address = addressForm();
		
		building = new Building(name, floorsNumber, apartmentsPerFloor, address);
		
		System.out.println("DADOS DOS APARTAMENTOS");
		System.out.println("Os apartamentos são todos iguais? (S/N):");
		
		tempString = scanner.nextLine();
		
		if (tempString.equalsIgnoreCase("S")) {
			Apartment apartment = apartmentForm();
			
			/*
			 * Condition used on the search filter function 
			 * to have at least one apartment in the search
			 */
			if (building.getTotalApartaments() == 0) {
				building.getApartments().add(apartment);
				
			}
			
			/*
			 * Fill array with the same data
			 * */
			for (int i = 0; i < building.getTotalApartaments(); i++)
				building.getApartments().add(apartment);
			
		} else if (tempString.equalsIgnoreCase("N")) {
			
			Apartment apartment;
			
			/*
			 * Fill array with data for each apartment
			 * */
			for (int i = 0; i < building.getTotalApartaments(); i++) {
				System.out.println(">> Entre com os dados do apartamento (" + i + 1 + ") <<");
				
				apartment = apartmentForm();
				
				building.getApartments().add(apartment);
				
			}

		}
		
		System.out.println("DADOS DA ÁREA COMUM");
		
		System.out.println("O edifício tem área comum para os moradores (S/N):");
		
		if (scanner.nextLine().equalsIgnoreCase("S")) {
			
			boolean insertCommounArea = true;
			
			while (insertCommounArea) {
				CommonAreaItem commonArea = commonAreaForm();
				
				System.out.println("Cadastrar mais uma área comum? (S/N):");
				if (scanner.nextLine().equalsIgnoreCase("N"))
					insertCommounArea = false;
			
				building.getCommonArea().add(commonArea);
			}
			
		}		
		
		return building;
	}
	
	protected Address addressForm() {
		/*
		 * Scanner for data collection
		 * */
		scanner = new Scanner(System.in);
		
		/*
		 * Address attributes
		 * */
		String country = "Brasil", state, city, street, neighborhood, tempString;
		int number;
		
		System.out.println("Digite a rua:");
		street = scanner.nextLine();
		
		System.out.println("Digite o número:");
		tempString = scanner.nextLine();
		
		if (tempString.equalsIgnoreCase(""))
			number = 0;
			
		else
			number = Integer.parseInt(tempString);
		
		System.out.println("Digite o bairro:");
		neighborhood = scanner.nextLine();
		
		System.out.println("Digite a cidade:");
		city = scanner.nextLine();
		
		System.out.println("Digite o estado:");
		state = scanner.nextLine();
		
		return new Address(country, state, city, street, neighborhood, number);
		
	}
	
	private Apartment apartmentForm() {
		/*
		 * Scanner for data collection
		 * */
		scanner = new Scanner(System.in);
		
		/*
		 * Apartament attributes
		 * */
		int parkingSpaces, bedroomQuantity, bathroomQuantity, bedroomSuiteQty;
		double totalArea, price;
		String tempString;
		
		System.out.println("Digite a quantidade de quartos:");
		tempString = scanner.nextLine();
		
		if (tempString.equalsIgnoreCase(""))
			bedroomQuantity = 0;
			
		else
			bedroomQuantity = Integer.parseInt(tempString);
		
		System.out.println("Digite a quantidade de banheiros:");
		tempString = scanner.nextLine();
		
		if (tempString.equalsIgnoreCase(""))
			bathroomQuantity = 0;
			
		else
			bathroomQuantity = Integer.parseInt(tempString);
		
		System.out.println("Digite a quantidade de suites:");
		tempString = scanner.nextLine();
		
		if (tempString.equalsIgnoreCase(""))
			bedroomSuiteQty = 0;
			
		else
			bedroomSuiteQty = Integer.parseInt(tempString);
		
		System.out.println("Digite a quantidade de vagas na garagem:");
		tempString = scanner.nextLine();
		
		if (tempString.equalsIgnoreCase(""))
			parkingSpaces = 0;
			
		else
			parkingSpaces = Integer.parseInt(tempString);
		
		System.out.println("Digite a área total do apartamento:");
		tempString = scanner.nextLine();
		
		if (tempString.equalsIgnoreCase(""))
			totalArea = 0.0;
			
		else
			totalArea = Integer.parseInt(tempString);
		
		System.out.println("Digite o preço do apartamento:");
		tempString = scanner.nextLine();
		
		if (tempString.equalsIgnoreCase(""))
			price = 0.0;
			
		else
			price = Integer.parseInt(tempString);
		
		return new Apartment(parkingSpaces, bedroomQuantity, bathroomQuantity, bedroomSuiteQty, totalArea, price);
		
	}

	private CommonAreaItem commonAreaForm() {
		/*
		 * Scanner for data collection
		 * */
		scanner = new Scanner(System.in);
		
		/*
		 * Apartament attributes
		 * */
		String type, description;
		
		System.out.println("Digite o tipo da área comum (exemplo: piscina, salão de festas, sala de jogos, etc)");
		type = scanner.nextLine();
		
		System.out.println("Digite uma descrição:");
		description = scanner.nextLine();
		
		return new CommonAreaItem(type, description);
	}
}











