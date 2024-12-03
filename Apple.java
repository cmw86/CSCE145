//Connor Wiggins
public class Apple {
	
	//Instance variables
	private String type;
	private double weight;
	private double price;
	//Default Constructors
	public Apple() {
		this.type="Gala";
		this.weight= 0.0;
		this.price=0.0;
	}
	//Parameterized Constructor
	public Apple(String type, double weight, double price) {
		this.setType(type);
		this.setWeight(weight);
		this.setPrice(price);
	}
	//Accessors and Mutators
	public String getType() {
		return type;
	}
	public void setType(String type) {
		if(type.equals("Red Delicious")||type.equals("Golden Delicious")||type.equals("Gala")||type.equals("Granny Smith"))
				{
			this.type = type;
				}
		else {
			this.type = "Gala";
		}
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		if(weight<0&&weight>2.0) {
		this.weight = weight;
		}
		else {
			this.weight=0.0;
		}
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		if(price>0.0) {
		this.price = price;
		}
		else {
			this.price=0.0;
		}
	}
	//to string method
	public String toString() {
		return "Type: " +this.type+ 
				" Weight: "+this.weight+
				" Price: "+this.price;
	}
	//equals method
	public boolean equals(Apple AA) {
		return AA !=  null &&
				this.type.equals(AA.getType())&&
				this.weight==AA.getWeight()&&
				this.price==AA.getPrice();
	}
		
	}
