/**
 * 
 */
package ufrpe.fpa.questao5;

/**
 * @author leonardo
 *
 */
public class Book {
	private String name;
	private Author author;
	private double price;
	private int qtyInStock;
	
	/**
	 * @param name
	 * @param author
	 * @param price
	 * @param qtyInStock
	 */
	public Book(String name, Author author, double price, int qtyInStock) {
		super();
		this.name = name;
		this.author = author;
		this.price = price;
		this.qtyInStock = qtyInStock;
	}
	
	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}
	
	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}
	
	/**
	 * @return the qtyInStock
	 */
	public int getQtyInStock() {
		return qtyInStock;
	}
	
	/**
	 * @param qtyInStock the qtyInStock to set
	 */
	public void setQtyInStock(int qtyInStock) {
		this.qtyInStock = qtyInStock;
	}
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * @return the author
	 */
	public Author getAuthor() {
		return author;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Nome: " + this.name + 
				"\nAutor: " +  
				"\n\tNome: " + this.author.getName() + 
				"\n\tEmail: " + this.author.getEmail() + 
				"\n\tGênero: " + this.author.getGender() + 
				"\nPreço: " + this.price + 
				"\nQuantidade: " + this.qtyInStock;
	}

}
