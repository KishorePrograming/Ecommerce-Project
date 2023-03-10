package Products;

import Users.*;
import java.util.Scanner;

public class Catalog {
	private static Product[] listofproduct;
	private Catalog[] subcatalog;
	private String sub;
	public Scanner sc = new Scanner(System.in);
	Administration admin = new Administration();
	private String Productid;

	public Administration getAdmin() {
		return admin;
	}
	public void setAdmin(Administration admin) {
		this.admin = admin;
	}
	public String getProductid() {
		return Productid;
	}
	public static Product[] getListofproduct() {
		Catalog subcatalog1 = new Catalog();
		Catalog subcatalog2 = new Catalog();
		Catalog subcatalog3 = new Catalog();
		subcatalog1.setSub("Electronic");
		subcatalog2.setSub("Dress");
		subcatalog3.setSub("Bikes");
		Product product1 = new Product();
		Product product2 = new Product();
		Product product3 = new Product();
		Product product4 = new Product();
		Product product5 = new Product();
		Product product6 = new Product();
		Product product7 = new Product();
		Product product8 = new Product();
		Product product9 = new Product();
		Product product10 = new Product();
	
			
			product1.setProductid("1");
			product1.setCost("1000");
			product1.setProductname("Normal Headset");
			product2.setProductid("2");
			product2.setCost("2000");
			product2.setProductname("Samsung Headset");
			product3.setProductid("3");
			product3.setCost("3000");
			product3.setProductname("Boat Headset");
			product4.setProductid("4");
			product4.setCost("10000");
			product4.setProductname("Hightly jio Heatset");
			product5.setProductid("5");
			product5.setCost("1000");
			product5.setProductname("Trending Phants ");
			product6.setProductid("6");
			product6.setCost("300");
			product6.setProductname("Trending T-shirts");
			product7.setProductid("7");
			product7.setCost("250");
			product7.setProductname("Trending Track-phants");
			product8.setProductid("8");
			product8.setCost("300");
			product8.setProductname("Trending Shirts");
			product9.setProductid("9");
			product9.setCost("350000");
			product9.setProductname("R15 V3");
			product10.setProductid("10");
			product10.setCost("400000");
			product10.setProductname("R15 V4");
			listofproduct = new Product[10];
			listofproduct[0] = product1;
			listofproduct[1] = product2;
			listofproduct[2] = product3;
			listofproduct[3] = product4;
			listofproduct[4] = product5;
			listofproduct[5] = product6;
			listofproduct[6] = product7;
			listofproduct[7] = product8;
			listofproduct[8] = product9;
			listofproduct[9] = product10;
		return listofproduct;
	}
	public static Product[] setlistofproductafter(Product[] allproduct) {
		allproduct = listofproduct;
		return allproduct;
	}
	Catalog(Administration admin, Product[] list, String su, Catalog[] subcat){
		this.admin=admin;
		Catalog.listofproduct=list;
		this.sub=su;
		this.subcatalog=subcat;
	}
	public Catalog() {
	}
	public void setListofproduct(Product[] listofproduct) {

		Catalog.listofproduct = listofproduct;
	}

	public Catalog[] getSubcatalog() {
		return subcatalog;
	}

	public void setSubcatalog(Catalog[] subcatalog) {
		this.subcatalog = subcatalog;
	}
	public Product[] Deleteitem(String j,Product[] listofproduct) {

		return listofproduct;
		
	}

	public String getSub() {
		return sub;
	}

	public void setSub(String sub) {
		this.sub = sub;
	}

	public void setProductid(String productid) {
		Productid = productid;
	}
	public Product[] DeletItem(String deleteid, Product[] allproduct) {
		
//		setlistofproductafter(allproduct);
		for (int i = 0 ; allproduct[i].getProductid().equals(deleteid); i++) {
			if (allproduct[i].getProductid().equals(deleteid)) {
				System.out.println("selected Item Detail given below : ");
				System.out.println("_____________________________________________________");
				System.out.println("S.no    Type product      Items,value,id ");
				System.out.println("1 .     Product ID     : " + allproduct[i].getProductid());
				System.out.println("2 .     Product Name   : " + allproduct[i].getProductname());
				System.out.println("3 .     Product cost   : " + allproduct[i].getCost());
				System.out.println("_____________________________________________________");
				allproduct[i].setProductid(null);
				allproduct[i].setCost(null);
				allproduct[i].setProductname(null);
				System.out.println("after Deleted item  : ");
				System.out.println("_____________________________________________________");
				System.out.println("S.no    Type product      Items,value,id ");
				System.out.println("1 .     Product ID     : " + allproduct[i].getProductid());
				System.out.println("2 .     Product Name   : " + allproduct[i].getProductname());
				System.out.println("3 .     Product cost   : " + allproduct[i].getCost());
				System.out.println("_____________________________________________________");
				break;
			}
			allproduct[i].setProductid(null);
			allproduct[i].setCost(null);
			allproduct[i].setProductname(null);				
		}
		for (int i = 0; i < listofproduct.length; i++) {
			System.out.println("_____________________________________________________");
			System.out.println("S.no    Type product      Items,value,id ");
			System.out.println("1 .     Product ID     : " + allproduct[i].getProductid());
			System.out.println("2 .     Product Name   : " + allproduct[i].getProductname());
			System.out.println("3 .     Product cost   : " + allproduct[i].getCost());
			System.out.println("_____________________________________________________");
		}
		return allproduct;
	}

}
