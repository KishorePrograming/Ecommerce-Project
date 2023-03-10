package Orders;

import Products.*;

public class Cart {
	private String cartId;

	public String getCartId() {
		return cartId;
	}

	public void setCartId(String string) {
		this.cartId = string;
	}

	private Product[] listofproducts;

	public Product[] getListofproducts() {
		return listofproducts;
	}

	public void setListofproducts(Product[] listofproducts) {
		this.listofproducts = listofproducts;
	}
public boolean chekout() {
	return true;
}
}
