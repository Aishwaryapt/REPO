package CameraRental;
import java.util.ArrayList;
import java.util.Scanner;
import java.lang.String;

public class Camera {
	
		static Scanner sc=new Scanner(System.in);
		static double money=2000;
		static int cam_id;
		static ArrayList<Camera> list=new ArrayList<>();
		
		int camera_id;
		String brand;
		String model;
		double price;
		String status;
		
		public Camera(int camera_id, String brand, String model, double price, String status) {
			super();
			this.camera_id = camera_id;
			this.brand = brand;
			this.model = model;
			this.price = price;
			this.status = status;
		}

		public static void main(String[] args) {
			list.add(new Camera(1,"Samsung","Ds123",500,"Available"));
			cam_id++;
			list.add(new Camera(2,"Sony","HD214",500,"Available"));
			cam_id++;
			list.add(new Camera(3,"Panasonic","XC",500,"Available"));
			cam_id++;
			list.add(new Camera(4,"Canon","XLR",500,"Available"));
			cam_id++;
			list.add(new Camera(5,"Fujitsu","J5",500,"Available"));
			cam_id++;
			list.add(new Camera(6,"LG","L123",500,"Available"));
			cam_id++;
			list.add(new Camera(7,"nikon","2030",800,"Available"));
			cam_id++;
		
			list.add(new Camera(8,"philips","Dsl",1000,"Available"));
			cam_id++;
			
		
		
			System.out.println("-------************-----------");
			System.out.println("| WELCOM TO CAMERA RENATAL APP |"); 
			System.out.println("------************------------");
			
			System.out.println("PLEASE LOGIN TO CONTINUE ");
			
			System.out.print("USERNAME - "); //Admin
			String username=sc.next();
			System.out.print("PASSWORD - ");//Admin123
			String password=sc.next();
		
			if(username.equals("Admin") && password.equals("Admin123")){
				options();
			}
			else {
				System.out.println("Invalid user credential");
			}
		}
		
			private static void options(){
				
				System.out.println("1.MY CAMERA\n"+ "2.RENT A CAMERA\n"+ "3.VIEW ALL CAMERA\n"+ "4.MY WALLET\n"+ "5.EXIT");
				int opt=sc.nextInt();
			switch(opt) {
			
			case 1:
				mycamera();
				break;
				
			case 2: 
				System.out.println(" AVAILABLE LIST OF CAMERAS - ");
				System.out.printf("%-12s%-15s%-10s%-10s%5s\n","CAMERA ID","BRAND","MODEL","PRICE","STATUS");
				for(int i=0;i<list.size();i++) {
					Camera c=list.get(i);
					if(c.status=="Available") {
					System.out.printf("%-12d%-15s%-10s%-10s%5s\n",list.get(i).camera_id,list.get(i).brand,list.get(i).model,list.get(i).price,
							list.get(i).status);
				}
				}
				
				System.out.print("ENTER THE CAMERA ID YOU WANT TO RENT - ");
				int id=sc.nextInt();
				for(int i=0;i<list.size();i++) {
					if(list.get(i).camera_id==id) {
					if(list.get(i).status.contains("Available")) {
					if(money>=(list.get(i).price)) {
						money=money-(list.get(i).price);
						System.out.println("YOUR TRANSACTION FOR CAMERA - "+list.get(i).brand+" with rent INR."+list.get(i).price+" HAS SUCESSFULLY COMPLETED\n");
						list.get(i).status="RENTED";
						options();
					}
					else {
						System.out.println("TRANCTION FAILED DUE TO INSUFFICIENT WALLET BALANCE.PLEASE DEPOSIT THE AMOUNT TO YOUR WALLET\n");
						options();
					}
				}
				else {
					System.out.println("CAMERA IS NOT AVAILABLE\n");
					options();
				}
				}
				}
				System.out.println("INVALID CAMERA ID");
				options();
				break;
				
			case 3:
				displaycamera();
				options();
				break;
				
			case 4:
				System.out.println("YOUR CURRENT WALLET BALANCE IS - INR."+money);
				System.out.println("DO YOU WANT TO DEPOSIT MORE AMOUNT TO YOUR WALLET?(1.YES 2.NO)");
				int dep=sc.nextInt();
				if(dep==1) {
					System.out.print("Enter THE AMOUNT (INR) - ");
					double addmoney=sc.nextDouble();
					System.out.println("YOUR WALLET BALANCE UPDATED SUCCESSFULLY.CURRENT WALLET BALANCE - INR.\n"+(money+addmoney));
				}
				options();
				break;
				
			case 5:
				System.out.println("THANK YOU.. VISIT AGAIN");
				break;
			
				
			default:
				System.out.println("INVALID OPTION \nPLEASE TRY AGAIN");
				
			}
		}


		
		private static void mycamera() {
			System.out.println("1.ADD\n"
					+ "2.REMOVE\n"
					+ "3.VIEW MY CAMERAS\n"
					+ "4.GO TO PREVIOUS MENU");
			int opt1=sc.nextInt();
			
			switch(opt1) {
			
			case 1:
				
				System.out.println("ENTER THE CAMERA BRAND - ");
				String brand=sc.next();
				System.out.println("ENTER THE MODEL - ");
				String model=sc.next();
				System.out.println("ENTER THE PER DAY PRICE - ");
				double price=sc.nextInt();
				String status="Available";
				list.add(new Camera(++cam_id,brand,model,price,status));
		
				System.out.println("YOUR CAMERA HAS BEEN SUCCESSFULLY ADDED TO THE LIST\n");
				mycamera();
				break;
				
			case 2:
				displaycamera();
				System.out.print("ENTER THE CAMERA ID TO REMOVE - ");
				int id=sc.nextInt();
				for(int i=0;i<list.size();i++) {
					if(list.get(i).camera_id==id) {
						list.remove(i);
						System.out.println("CAMERA SUCCESSFULLY REMOVED FROM THE LIST\n");
						mycamera();
					}
				}
				System.out.println("INVALID CAMERA ID");
				mycamera();
				break;
				
			case 3:
				displaycamera();
				mycamera();
				break;
		
			case 4:
				options();
				break;
				
			default: 
				System.out.println("INVALID OPTION\n try again");
				mycamera();
		}
	}


		private static void displaycamera() {
			System.out.printf("%-12s%-15s%-10s%-10s%5s\n","CAMERA ID","BRAND","MODEL","PRICE","STATUS");
			for(int i=0;i<list.size();i++) {
				System.out.printf("%-12d%-15s%-10s%-10s%5s\n",list.get(i).camera_id,list.get(i).brand,list.get(i).model,list.get(i).price,
						list.get(i).status);
			}
			System.out.println();
			
		}
		
	}


