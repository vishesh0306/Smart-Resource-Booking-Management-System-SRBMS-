package Service;

import java.util.Iterator;
import java.util.Scanner;

import DataBase.DatabaseClass;
import EntityPackage.Booking;
import EntityPackage.RegularUser;
import EntityPackage.Resource;

public class BookingService {
	public static void roomBooking(int roomNumber,RegularUser user,Resource res) {	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter time duration");
		int time=sc.nextInt();
		if(time<=0) {
			System.out.println("Enter valid time");
		}else {
		Booking b=new Booking(user,time,res);
		DatabaseClass.bookingDatabase.add(b);
		res.isAvailaible=false;
		System.out.println("room is booked");
		}
	}
}
