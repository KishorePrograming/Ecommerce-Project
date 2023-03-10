package Products;
import Users.Seller;
public class Product {
	private String Productid;
	private String cost;
	private String Productname;
	private Seller seller;
	private Catalog catalog;
	public Catalog getCatalog() {
		return catalog;
	}

	public void setCatalog(Catalog catalog) {
		this.catalog = catalog;
	}

	public Seller getSeller() {
		return seller;
	}

	public void setSeller(Seller seller) {
		this.seller = seller;
	}

	public String getProductid() {
		return Productid;
	}

	public void setProductid(String productid) {
		Productid = productid;
	}

	public String getCost() {
		return cost;
	}

	public void setCost(String cost) {
		this.cost = cost;
	}

	public String getProductname() {
		return Productname;
	}

	public void setProductname(String productname) {
		Productname = productname;
	}

}
