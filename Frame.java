
public class Frame {
	//Instance Variables
	private double size;
	private String type;

	//Default Constructors
	public Frame() {
		this.size= 18.5;
		this.type= "Diamond";
	}
	//Parameterized Constructors
	public Frame(double size, String type) {
		this.setSize(size);
		this.setType(type);
	}
	//Accessors and Mutators
	public double getSize() {
		return size;
	}
	public void setSize(double size) {
		if(size>=18.5&&size<=60) 
		{
			this.size=size;
		}
		else 
		{
			this.size=18.5;
		}
	}
	public String getType() {
		return type;
}
	public void setType(String type) {
		if(type.equals("Diamond")||type.equals("Step-Through")||type.equals("Truss")||type.equals("Penny-Farthing")) 
		{
			this.type=type;
		}
		else 
		{
			this.type="Diamond";
		}
	}
	//ToString
	public String toString() {
		return "Size: " +this.size+ 
				" Type: "+this.type;
	}
	//Equals
	public boolean equals(Frame AA) {
		return AA !=  null &&
				this.size==AA.getSize()&&
				this.type.equals(AA.getType());
	}
	
}
