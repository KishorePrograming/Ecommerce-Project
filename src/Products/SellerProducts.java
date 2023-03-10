package Products;

import java.util.Scanner;

import Users.Seller;

public class SellerProducts {
	private Seller seller;
	private static Product[] listofproduct;
	static Product  addproduct ;
	public static Product[] setAddproduct(Product[] allproduct,int count) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);	
		listofproduct = new Product[count];
		for (int i = 0; i < count; i++) {
			addproduct = new Product();
			System.out.println("Enter your product id : ");
			String Productid = sc.nextLine();
			addproduct.setProductid(Productid);
			System.out.println("Enter your Productcost : ");
			String Productcost = sc.nextLine();
			addproduct.setCost(Productcost);
			System.out.println("Enter your Productname : ");
			String Productnname = sc.nextLine();
			addproduct.setProductname(Productnname);
			listofproduct[i] = addproduct;
		}
		return listofproduct;
	}
	public static Product[] DeletItem(String deleteid, Product[] addproduct) {
		setListofproduct(addproduct);
		for (int i = 0; i < addproduct.length; i++) {
			System.out.println("_____________________________________________________");
			System.out.println("S.no    Type product      Items,value,id ");
			System.out.println("1 .     Product ID     : " + addproduct[i].getProductid());
			System.out.println("2 .     Product Name   : " + addproduct[i].getProductname());
			System.out.println("3 .     Product cost   : " + addproduct[i].getCost());
			System.out.println("_____________________________________________________");
		}
		for (int i = 0; SellerProducts.listofproduct[i].getProductid().equals(deleteid) == true; i++) {
			if (SellerProducts.getListofproduct()[i].getProductid().equals(deleteid) == true) {
				System.out.println("selected Item Detail given below : ");
				System.out.println("_____________________________________________________");
				System.out.println("S.no    Type product      Items,value,id ");
				System.out.println("1 .     Product ID     : " + SellerProducts.getListofproduct()[i].getProductid());
				System.out.println("2 .     Product Name   : " + SellerProducts.getListofproduct()[i].getProductname());
				System.out.println("3 .     Product cost   : " + SellerProducts.getListofproduct()[i].getCost());
				System.out.println("_____________________________________________________");
				 SellerProducts.getListofproduct()[i].setProductid(null);
				 SellerProducts.getListofproduct()[i].setCost(null);
				 SellerProducts.getListofproduct()[i].setProductname(null);
				System.out.println("after Deleted item  : ");
				System.out.println("_____________________________________________________");
				System.out.println("S.no    Type product      Items,value,id ");
				System.out.println("1 .     Product ID     : " + SellerProducts.getListofproduct()[i].getProductid());
				System.out.println("2 .     Product Name   : " + SellerProducts.getListofproduct()[i].getProductname());
				System.out.println("3 .     Product cost   : " + SellerProducts.getListofproduct()[i].getCost());
				System.out.println("_____________________________________________________");
			}
					
		}
		return listofproduct;
	}

	public static Product[] getListofproduct() {
		return listofproduct;
	}

	public static void setListofproduct(Product[] listofproduct) {
		SellerProducts.listofproduct = listofproduct;
	}

	public Seller getSeller() {
		return seller;
	}

	public void setSeller(Seller seller) {
		this.seller = seller;
	}
}
