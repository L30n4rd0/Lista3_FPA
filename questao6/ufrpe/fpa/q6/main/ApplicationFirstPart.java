package ufrpe.fpa.q6.main;

import ufrpe.fpa.q6.model.vo.Address;
import ufrpe.fpa.q6.model.vo.Apartment;
import ufrpe.fpa.q6.model.vo.CommonAreaItem;
import ufrpe.fpa.q6.model.vo.Building;

public class ApplicationFirstPart {
	public static void main(String[] args) {
		Building[] building = new Building[2];
		
		building[0] = new Building("Rio Branco", 2, 2, new Address("Brasil", "PE", "Recife", "Antonio coelho", "Varzea", 23));
		building[1] = new Building("Acassio", 2, 2, new Address("Brasil", "PE", "Recife", "Antonio coelho", "Varzea", 25));
		
		building[0].getCommonArea().add(new CommonAreaItem("Piscina", "Piscina grande e com proteção"));
		building[0].getCommonArea().add(new CommonAreaItem("Quadra de futebol", "Quadra coberta"));
		
		building[1].getCommonArea().add(new CommonAreaItem("Piscina", "Piscina grande e com proteção"));
		building[1].getCommonArea().add(new CommonAreaItem("Sala de jogos", "Com sinuca, tabuleiro de xadrez, etc"));
		
		for (int i = 0; i < building[0].getTotalApartaments(); i++)
			building[0].getApartments().add(new Apartment(1, 3, 2, 1, 50, 100.000));
		
		for (int i = 0; i < building[1].getTotalApartaments(); i++)
			building[1].getApartments().add(new Apartment(2, 4, 3, 2, 60, 200.000));
		
		for (int i = 0; i < building.length; i++)
			System.out.println(building[i].toString());
		
	}

}
