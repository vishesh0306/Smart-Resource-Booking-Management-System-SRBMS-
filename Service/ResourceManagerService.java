package Service;

import java.util.Iterator;
import java.util.Scanner;

import DataBase.DatabaseClass;
import EntityPackage.RegularUser;
import EntityPackage.Resource;
import EntityPackage.ResourceManager;

public class ResourceManagerService {
	static Scanner sc=new Scanner(System.in);
	public static boolean checkResourceManager(String id) {
		Iterator<ResourceManager> i=DatabaseClass.managerDatabase.iterator();
		while(i.hasNext()) {
			ResourceManager res=i.next();
			if(res.id.equals(id)) {
				return true;
			}
		}
		return false;
	}
	
	public static boolean checkResourceManagerWithPassword(String Id,String password) {
		Iterator<ResourceManager> i=DatabaseClass.managerDatabase.iterator();
		while(i.hasNext()) {
			ResourceManager res=i.next();
			if(res.id.equals(Id) && res.password.equals(password)) {
				return true;
			}
		}
		return false;
	}
	
	public static void seeManagers() {
		int p=0;
		Iterator<ResourceManager>i=DatabaseClass.managerDatabase.iterator();
		while(i.hasNext()) {
			p=1;
			ResourceManager r=i.next();
			System.out.println("                                  🫸🫸 NAME : "+r.name+ " , "+"ID : "+r.id+" , "+"PASSWORD : "+r.password +" 🫷🫷");

		}
		if(p==0) {
			System.err.println("                                          ‼️‼️ No Manager is present ‼️‼️");
		}
	}
	
	public static void addRoom() {
		System.out.println("Enter unique no");
		int n=sc.nextInt();
		Iterator<Resource>i=DatabaseClass.Rooms.iterator();
		while(i.hasNext()){
			Resource r=i.next();
			if(r.no==n) {
				System.out.println("This room no is already present");
				return;
			}
		}
		System.out.println("Enter type");
		sc.nextLine();
		String str=sc.nextLine();
		System.out.println("Enter cost per hour");
		int cost=sc.nextInt();
		if(cost<0) {
			System.out.println("Cost is invalid");
			return;
		}
		sc.nextLine();
		Resource r=new Resource(n,str,cost,true);
		DatabaseClass.Rooms.add(r);
	}
	
	public static void seeRooms() {
		int p=0;
		Iterator<Resource>i=DatabaseClass.Rooms.iterator();
		while(i.hasNext()) {
			p=1;
			Resource r=i.next();
			System.out.println(r.no+" "+r.type+" "+r.costPerHr+" "+r.isAvailaible);
		}
		if(p==0) {
			System.out.println("No room");
		}
	}
	
	public static void deleteRoom() {
		System.out.println("Enter the unique no/id of room you want to delete");
		int no=sc.nextInt();
		Iterator<Resource>it=DatabaseClass.Rooms.iterator();
		int p=0;
		int c=0;
		while(it.hasNext()) {
			Resource r=it.next();
			if(r.no==no) {
				c=1;
			}
		}
		if(c==0) {
			System.out.println("Enter correct room number");
			return;
		}
		it=DatabaseClass.Rooms.iterator();
		while(it.hasNext()) {
			Resource r=it.next();
			if(r.no==no) {
				c=1;
			}
			if(r.no==no && r.isAvailaible==true) {
				p=1;
				it.remove();
				System.out.println("Room deleted successfully");
				return;
			}
		}
		if(p==0) {
			System.out.println("Someone is using this room ....so this room cant be deleted");
		}
	
	}
	
	public static void editRoom() {
		System.out.println("Enter room no");
		int no=sc.nextInt();
		Iterator<Resource>i=DatabaseClass.Rooms.iterator();
		int p=0;
		Resource res=null;
		while(i.hasNext()) {
			res=i.next();
			if(res.no==no) {
				p=1;
				break;
			}
		}
		if(p==0) {
			System.out.println("Room of this no is not present");
			return;
		}
		System.out.println("What you want to edit");
		System.out.println("1:Type   2:Cost Per hour   3:Availaibility");
		System.out.println("Enter your choice");
		String ch=sc.nextLine();
		switch(ch) {
		case "1":{
			System.out.println("Enter new type");
			sc.nextLine();
			String str=sc.nextLine();
			res.type=str;
			System.out.println("Type updated");
		}break;
		case "2":{
			System.out.println("Enter new Cost");
			int co=sc.nextInt();
			res.costPerHr=co;
			System.out.println("Cost updated");
		}break;
		case "3":{
			System.out.println("Enter new availaibility");
			sc.nextLine();
			boolean b=sc.nextBoolean();
			res.isAvailaible=b;
			System.out.println("Availaibility updated");
		}break;
		default:{
			System.out.println("Enter correct choice");
		}break;
		}
		
	}
}
