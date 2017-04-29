package ufrpe.fpa.q6.view;

import ufrpe.fpa.q6.model.vo.Address;
import ufrpe.fpa.q6.model.vo.Apartment;
import ufrpe.fpa.q6.model.vo.CommonAreaItem;
import ufrpe.fpa.q6.model.vo.Immobile;

public class Main {
	public static void main(String[] args) {
		Immobile[] immobiles = new Immobile[2];
		
		immobiles[0] = new Immobile("Rio Branco", 2, 2, new Address("Brasil", "PE", "Recife", "Antonio coelho", "Varzea", 23));
		immobiles[1] = new Immobile("Acassio", 2, 2, new Address("Brasil", "PE", "Recife", "Antonio coelho", "Varzea", 25));
		
		immobiles[0].getCommonArea().add(new CommonAreaItem("Piscina", "Piscina grande e com proteção"));
		immobiles[0].getCommonArea().add(new CommonAreaItem("Quadra de futebol", "Quadra coberta"));
		
		immobiles[1].getCommonArea().add(new CommonAreaItem("Piscina", "Piscina grande e com proteção"));
		immobiles[1].getCommonArea().add(new CommonAreaItem("Sala de jogos", "Com sinuca, tabuleiro de xadrez, etc"));
		
		for (int i = 0; i < immobiles[0].getTotalApartaments(); i++)
			immobiles[0].getApartments()[i] = new Apartment(1, 3, 2, 1, 50, 100.000);
		
		for (int i = 0; i < immobiles[1].getTotalApartaments(); i++)
			immobiles[1].getApartments()[i] = new Apartment(2, 4, 3, 2, 60, 200.000);
		
		for (int i = 0; i < immobiles.length; i++)
			System.out.println(immobiles[i].toString());
		
	}

}
