/*Project 1:
Create an ecommerce console project with the following specifications-
● That ecommerce should have these classes:

Administration, Store, Cart,Customer, Product, Seller, Catalog, User
● Admin class will check whether the user is an admin or normal user if it is admin he/she can modify the catalog.
● User class will check all the user authentication and will check user Id and Password for all users.
● Cart will be taking care of all the cart items and will be having the option of checkout as well.
● Catalog is responsible for all the catalog activities.
● In the Store class-
○ Create an order object and assign this user to the order with an order id at the appropriate place.
○ Complete the logical store functionalities for seller and administrator.
○ Make your code modular- divide it in many different small methods.
● In all the remaining classes-
○ Add default and parameterized constructors.

A. Add some dummy products data in your code with categories for each product added. Add subcategories to relevant categories. Now, Ask the customer to view products based on categories and display those products based on categories in the ecommerce store to the Customer if yes.
B. The seller should be able to add products to different categories as well.
C. Divide your project in different packages.
D. Add relevant exception handling to different methods.
E. On checkout by the Customer, create an order and write all the order details to a file with the filename same as the customer id.
 * 
 */
package Ecommerce;

import java.util.Scanner;

import Users.*;
import Products.*;
import Orders.*;

public class Store {
	public static void main(String[] args) {
		Catalog catalog = new Catalog();
		Product[] allproduct = new Product[10];
		allproduct = Catalog.getListofproduct(); // customer catalog
		Seller CurrentSeller = new Seller();
		SellerProducts addproduct = new SellerProducts();
		@SuppressWarnings("unused")
		Product[] sellerproduct = null;
	    try (Scanner sc = new Scanner(System.in)) {
			Customer current = new Customer();
			Order order=new Order();
			System.out.println("Hey hello Welcome to Ecommerce store ");
			while (true) {
				System.out.println("Are you  1. Customer? 2. Seller? 3.Admin ? 4. contact us ? 5. exit ");
				int choice = sc.nextInt();
				@SuppressWarnings("unused")
				String typeofuser;
				if (choice == 1) {
					typeofuser = "Customer";
					System.out.println("Please Enter you valid name : ");
					sc.nextLine();
					current.setUsername(sc.nextLine());
					System.out.println("Hi Dear " + current.getUsername() + " welcome our shop  ");
					System.out.println("What is your user id : ");
					current.setUserId(sc.nextLine());
					System.out.println("What is your password : ");
					current.setPassword(sc.nextLine());
					if (current.verfyuser() == true) {
						System.out.println("user verified");
						while (true) {
							current.getListofproduct(allproduct);
							System.out.println("Do you want to 1.view products 2. view card 3. contact us 4. exit");
							int choice1 = sc.nextInt();
							if (choice1 == 1) {
								System.out.println("Electronic, Dress and Bikes items details given below :");
								for (int i = 0; i < allproduct.length; i++) {
									System.out.println("_____________________________________________________");
									System.out.println("S.no    Type product      Items,value,id ");
									System.out.println("1 .     Product ID     : " + allproduct[i].getProductid());
									System.out.println("2 .     Product Name   : " + allproduct[i].getProductname());
									System.out.println("3 .     Product cost   : " + allproduct[i].getCost());
									System.out.println("______________________________________________________");
								}
								System.out.println("Do you want to add any product to the cart ? Y/N  ");
								sc.nextLine();
								String addToCart = sc.nextLine();
								if (addToCart.equals("Y")) {
									System.out.println("Input the Product Id which you want to add to cart ");
									String ProductId = sc.nextLine();
									order.setOrderId(ProductId);
									Product[] cartproduct = new Product[1];
									for (int i = 0; i < allproduct.length; i++) {
										if (allproduct[i].getProductid().equals(ProductId)) {
											cartproduct[0] = allproduct[i];
										}
									}
									Cart cart = new Cart();
									cart.setCartId(ProductId);
									cart.setListofproducts(cartproduct);
									current.setCart(cart);
									System.out.println("Your selected product are successfully added to cart ");
									System.out.println("____________________________");
									System.out.println("Your order Id is : " + order.getOrderId());
									System.out.println("____________________________");
								} else if (addToCart.equals("N")) {
									System.out.println("Thanks for you visiting ");
								}
							}
							else if (choice1 == 2) {
								Product[] cartProduct = current.getCart().getListofproducts();
								System.out.println(current.getCart().getCartId());
								for (int i = 0; i < cartProduct.length; i++) {
									System.out.println("_____________________________________________________");
									System.out.println("S.no    Type product      Items,value,id ");
									System.out.println("1 .     Product ID     : " + cartProduct[i].getProductid());
									System.out.println("2 .     Product Name   : " + cartProduct[i].getProductname());
									System.out.println("3 .     Product cost   : " + cartProduct[i].getCost());
									System.out.println("_____________________________________________________");
								}
								System.out.println("Do you want to check out ? Y/N ");
								sc.nextLine();
								String checkout = sc.nextLine();
								if (checkout.equals("Y") == true) {
									System.out.println("your order is place successfully");
								} else if (checkout.equals("N")) {
									return;
								}
							}
							else if (choice1 == 3) {
								System.out.println("For contact us try to via mail in this  : customersuport@gmail.com");

							}
							else if (choice1 == 4) {
								System.out.println("Thanks for visting our site ");
								break;
							}
							else {
								System.out.println("invalid input try again ");
							}
						}
					}

				} else if (choice == 2) {
					typeofuser = "Seller";
					System.out.println("Please Enter you valid name : ");
					sc.nextLine();
					CurrentSeller.setUsername(sc.nextLine());
					System.out.println("Hi Dear " + CurrentSeller.getUsername() + " welcome our shop  ");
					System.out.println("Enter your id :");
					CurrentSeller.setUserId(sc.nextLine());
					System.out.println("Enter your password ");
					CurrentSeller.setPassword(sc.nextLine());
					if (CurrentSeller.verfyuser() == true) {
						System.out.println("User verified ");
						while(true) {
						System.out.println("Do you want to 1. add product? 2. View product 3. contact us ? 4. exit ");
						int choice21 = sc.nextInt();
						if (choice21 == 1) {
							addproduct.setSeller(CurrentSeller);
							System.out.println("How many product do you want to add ?");
							int count = sc.nextInt();
							SellerProducts.setAddproduct(null, count);
							sellerproduct = new Product[count];
						} else if (choice21 == 2) {
							addproduct = CurrentSeller.setProductlisted(SellerProducts.getListofproduct());
							for (int i = 0; i < SellerProducts.getListofproduct().length; i++) {
								System.out.println("_____________________________________________________");
								System.out.println("S.no    Type product      Items,value,id ");
								System.out.println(
										"1 .     Product ID     : " + SellerProducts.getListofproduct()[i].getProductid());
								System.out.println("2 .     Product Name   : "
										+ SellerProducts.getListofproduct()[i].getProductname());
								System.out.println(
										"3 .     Product cost   : " + SellerProducts.getListofproduct()[i].getCost());
								System.out.println("_____________________________________________________");
							}
						}else if (choice21 == 3) {
							System.out.println("For contact us try to via mail in this  Sellersuport@gmail.com");
						}
						else if (choice21 == 4) {
							System.out.println("Thanks for visting our site ");
							break;
						}
						else {
							System.out.println("invalid input try again");
						}
						}
					}

				} else if (choice == 3) {
					Administration Currentadmin = new Administration();
					typeofuser = "Admin";
					System.out.println("Please Enter you valid name : ");
					sc.nextLine();
					Currentadmin.setUsername(sc.nextLine());
					System.out.println("Enter your Id : ");
					Currentadmin.setUserId(sc.nextLine());
					System.out.println("Enter your password :");
					Currentadmin.setPassword(sc.nextLine());
					if (Currentadmin.verfyuser() == true) {
						System.out.println("Admin verified");
						System.out.println("Note : first insert the seller product with seller and then use seller methods please");
						while (true) {
							System.out.println("Do you want to view  Products (1.Customer or 2.seller) ? Delete the product (3.Customer or 4.seller) ? 5 contact us ? 6 . exit ? ");
							int choice1 = sc.nextInt();
							if (choice1 == 1) {
								System.out.println("Customer products Are given below :");
								for (int i = 0; i < allproduct.length; i++) {
									System.out.println("_____________________________________________________");
									System.out.println("S.no    Type product      Items,value,id ");
									System.out.println("1 .     Product ID     : " + allproduct[i].getProductid());
									System.out.println("2 .     Product Name   : " + allproduct[i].getProductname());
									System.out.println("3 .     Product cost   : " + allproduct[i].getCost());
									System.out.println("_____________________________________________________");
								}
							}
							if (choice1 == 2) {
								System.out.println("Seller products Are given below :");
								for (int i = 0; i < SellerProducts.getListofproduct().length; i++) {
									System.out.println("_____________________________________________________");
									System.out.println("S.no    Type product      Items,value,id ");
									System.out.println("1 .     Product ID     : "+ SellerProducts.getListofproduct()[i].getProductid());
									System.out.println("2 .     Product Name   : "+ SellerProducts.getListofproduct()[i].getProductname());
									System.out.println("3 .     Product cost   : " + SellerProducts.getListofproduct()[i].getCost());
									System.out.println("_____________________________________________________");
								}
							} else if (choice1 == 3) {
								System.out.println("Hi do you want to Delete the customer product in cart ? Y/N ");
								sc.nextLine();
								String choice4 = sc.nextLine();
								if (choice4.equals("Y")) {
									System.out.println("Which  product do you want to delete ? give the ID of it ");
									String deleteid = sc.nextLine();
									System.out.println("start method ");
									catalog.DeletItem(deleteid, current.getListofproduct(allproduct));
									System.out.println("end method ");
								} else if (choice4.equals("N")) {
									break;
								} 
								}
							else if (choice1 == 4) {
								System.out.println("Hi do you want to Delete the Seller product in cart ? Y/N ");
								sc.nextLine();
								String choice3 = sc.nextLine();
								if (choice3.equals("Y")) {
									System.out.println("Which  product do you want to delete ? give the ID of it ");
									String deleteid = sc.nextLine();
									CurrentSeller.getSellerProducts();
									SellerProducts.getListofproduct();	
									System.out.println("start method ");
									CurrentSeller.getSellerProducts();
									SellerProducts.DeletItem(deleteid, SellerProducts.getListofproduct());
									System.out.println("end method ");
								} else if (choice3.equals("N")) {
									return;
								}
							}
							else if(choice1==5) {
								System.out.println("For contact us try to via mail in this manager@gmail.com");
							}
							else if(choice1==6) {
								System.out.println("Thank for cheking and updating "+ Currentadmin.getUsername());
								break;
							}
							else {
								System.out.println("invalid input try again");
							}
							}
						}
					} 
				else if (choice == 4) {
					System.out.println("For contact us try to via mail in this genralsuport@gmail.com");
				}
				else if(choice ==5) {
					System.out.println("Thanks for visiting our shop ");
					break;
				}else {
						System.out.println("invalid input try again");
					}
				}
		}
		}
	}

