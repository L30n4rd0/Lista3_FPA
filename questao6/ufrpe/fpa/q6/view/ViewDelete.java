/**
 * 
 */
package ufrpe.fpa.q6.view;

import java.util.Scanner;

import ufrpe.fpa.q6.control.BuildingControl;

/**
 * @author leonardo
 *
 */
public class ViewDelete {
	
	private Scanner scanner;

	protected void delete() {
		scanner = new Scanner(System.in);
		System.out.println("Digite o nome do imóvel para deletar:\n");
		String name  = scanner.nextLine();
		
		BuildingControl control = BuildingControl.getInstance();
		
		if (control.deleteBuilding(name))
			System.out.println("Imóvel deletado com sucesso!!");
		
		else
			System.out.println("Imóvel não cadastrado!!");
		
	}

}
