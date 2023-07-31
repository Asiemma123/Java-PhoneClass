
public class Phone {
	
	//Private instance variable 
	
	private String name;
	private String color;
	private double memory;
	
	// An empty Constructor
	public Phone() {
		name="Samsung";
		color="Black";
		memory=256;
	}
	
	//Constructor with 2 of 3 arguments 
	public Phone(String name, double memory) {
		this.name=name;
		this.memory=memory;
	}
	
	// Constructor with all 3 arguments 
	public Phone(String name, String color, double memory) {
		this.name=name;
		this.color=color;
		this.memory=memory;
	}
	
	//Set method for private variables 
	
	public String setname() {
		return name;
		
	}
	
	public String setcolor() {
		return color;
	}
	
	public double setmemory()
	{
		return memory;
	}
	
	// Get methods for private variable
	
	public void getname() {
		this.name=name;
			
	}
		
	public void getcolor() {
		this.color=color;
	}
		
	public void getmemory() {
		this.memory=memory;
			
	}
	public boolean isPhone() {
		return true;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Phone myPhone=new Phone("Emmanuel","Yellow",300);
		System.out.println(myPhone);

	}

}
