package EntityPackage;

public class Resource {
	public int no;
	public String type;
	public int costPerHr;
	public boolean isAvailaible;
	public Resource(int no,String type,int costPerHr,boolean isAvailaible){
		this.no=no;
		this.type=type;
		this.costPerHr=costPerHr;
		this.isAvailaible=isAvailaible;
	}
}
