package Users;

import Products.*;
public class Seller extends User{
		private	Product [] Productlisted;
		private SellerProducts SellerProducts;
		public SellerProducts getSellerProducts() {
			return SellerProducts;
		}
		public void setSellerProducts(SellerProducts sellerProducts) {
			SellerProducts = sellerProducts;
		}
		public boolean verfyuser() {
			return true;
		}
		public Product[] getProductlisted() {
			return Productlisted;
		}
		public SellerProducts setProductlisted(Product[] productlisted) {
			this.Productlisted = productlisted;
		return null;
	}
	
}
