package Users;

import Orders.Cart;
import Products.Catalog;
import Products.Product;

public class Administration extends User {
	private Product[] productlisted;
	private Cart cart;
	private Catalog [] catalog;
	

	public Catalog[] getCatalog() {
		return catalog;
	}

	public void setCatalog(Catalog[] catalog) {
		this.catalog = catalog;
	}

	public Cart getCart() {
		return cart;
	}

	public void setCart(Cart cart) {
		this.cart = cart;
	}

	public Product[] getProductlisted() {
		return productlisted;
	}

	public void setProductlisted(Product[] productlisted) {
		this.productlisted = productlisted;
	}

	public boolean verfyuser() {

		return true;
	}

}
