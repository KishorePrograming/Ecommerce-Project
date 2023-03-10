package Users;
import Products.*;
import Orders.*;
public class Customer extends User {
	private Cart cart;
		public Cart getCart() {
		return cart;
	}
	public void setCart(Cart cart) {
		this.cart = cart;
	}
		public boolean verfyuser() {
		return true;
	}
		public void setUserId(String UserId) {
			UserId = this.UserId;
		}

		public String getUserId() {
			return UserId;
		}
		public Product[] getListofproduct(Product[] listofproduct) {
			listofproduct=Catalog.getListofproduct();
			return listofproduct;
			
		}
		
	

}
