package EntityPackage;

public class Booking {
	public RegularUser userBooking;
	public Resource r;
	public int timeDuration;
	public int cost;
	public Booking(RegularUser userBooking,int timeDuration,Resource r){
		this.userBooking=userBooking;
		this.timeDuration=timeDuration;
		this.r=r;
		this.cost=r.costPerHr*timeDuration;
	}
}
