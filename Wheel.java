
public class Wheel {
	//instance variables
	private double diameter;
	private double width;
	
	//Default COnstructors
	public Wheel() {
		this.diameter=16;
		this.width=1;
	}
	//Parameterized Constructors
	public Wheel(double diameter, double width) {
		this.setDiameter(diameter);
		this.setWidth(width);
	}
	//Accessors and Mutators
	public double getDiameter() {
		return diameter;
	}
	public void setDiameter(double diameter) {
		if(diameter>=16&&diameter<=55) 
		{
			this.diameter = diameter;
		}
		else 
		{
			this.diameter=16;
		}
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		if(width>=1&&width<=2.5) 
		{
			this.width = width;
		}
		else 
		{
			this.width=1;
		}
	}
	//ToString
	public String toString() {
		return "Diameter: " + this.diameter+
				" Width: " + this.width;
	}
	//equals
	public boolean equals(Wheel AA) {
		return AA !=  null &&
				this.diameter==AA.getDiameter()&&
				this.width==AA.getWidth();
	}
	
}
