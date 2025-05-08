package EntityPackage;

public class Admin extends User{
	int adminId;
	Admin(String name,String id,String password,int adminId){
		super(name,id,password);
		this.adminId=adminId;
	}
	
}
