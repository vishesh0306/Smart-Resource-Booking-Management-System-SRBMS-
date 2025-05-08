package DataBase;

import java.util.ArrayList;

import EntityPackage.Booking;
import EntityPackage.RegularUser;
import EntityPackage.Resource;
import EntityPackage.ResourceManager;

public class DatabaseClass {
	public static ArrayList<RegularUser>userDatabase=new ArrayList<RegularUser>();
	public static ArrayList<Resource>Rooms=new ArrayList<Resource>();
	static {
		Rooms.add(new Resource(1,"Lux",1000,true));
		Rooms.add(new Resource(2,"ord",500,true));
	}
	public static ArrayList<Booking>bookingDatabase=new ArrayList<>();
	public static ArrayList<ResourceManager>managerDatabase=new ArrayList<>();
}
