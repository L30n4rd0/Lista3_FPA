/**
 * 
 */
package ufrpe.fpa.questao5;

import java.util.Scanner;

/**
 * @author leonardo
 *
 */
public class TestAuthorBook {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		/*
		 * Scanner used to collect user input data
		 * */
		Scanner scanner = new Scanner(System.in);
		
		/*
		 * Create Author-type objects
		 * */
		Author author1 = null, author2 = null;
		
		/*
		 * Create Book-type objects
		 * */
		Book book1 = null, book2 = null;
		
		/*
		 * Collecting authors' data
		 * */
		for (int i = 0; i < 2; i++) {
			System.out.println("Digite o nome do autor: ");
			String name = scanner.nextLine();
			
			System.out.println("Digite o email do autor: ");
			String email = scanner.nextLine();
			
			System.out.println("Digite o gênero do autor (M - masculino / F - feminino): ");
			String gender = scanner.nextLine();
			
			if(i == 0)
				author1 = new Author(name, email, gender.charAt(0));
			
			else
				author2 = new Author(name, email, gender.charAt(0));
			
		}
		
		/*
		 * Collecting books' data
		 * */
		for (int i = 0; i < 2; i++) {
			System.out.println("Digite o nome do livro: ");
			String name = scanner.nextLine();
			
			System.out.println("Digite o preço do livro: ");
			double price = Double.parseDouble(scanner.nextLine());
			
			System.out.println("Digite a quantidade disponível em estoque: ");
			int qtyInStock = Integer.parseInt(scanner.nextLine());
			
			if(i == 0)
				book1 = new Book(name, author1, price, qtyInStock);
			
			else
				book2 = new Book(name, author2, price, qtyInStock);
			
		}
		
		/*
		 * Printing data
		 * */
		System.out.println(book1.toString());
		System.out.println(".............");
		System.out.println(book2.toString());

	}
}
