package EntityPackage;

abstract public class User {
	public String name;
	public String id;
	public String password;
	User(String name,String id,String password){
		this.name=name;
		this.id=id;
		this.password=password;
	}

}
