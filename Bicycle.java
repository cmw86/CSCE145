
public class Bicycle {
//instance variable
	private String make;
	private Wheel frontWheel;
	private Wheel backWheel;
	private Frame frame;
	//default constructors
	public Bicycle() {
		this.make= "none";
		this.frontWheel= new Wheel();
		this.backWheel= new Wheel();
		this.frame= new Frame();
	}
	//parameterized constructors
	public Bicycle(String make, Wheel frontWheel, Wheel backWheel, Frame frame) {
		this.setMake(make);
		this.setFrontWheel(frontWheel);
		this.setBackWheel(backWheel);
		this.setFrame(frame);
	}
	//Accessors and Mutators
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public Wheel getFrontWheel() {
		return frontWheel;
	}
	public void setFrontWheel(Wheel frontWheel) {
		this.frontWheel = frontWheel;
	}
	public Wheel getBackWheel() {
		return backWheel;
	}
	public void setBackWheel(Wheel backWheel) {
		this.backWheel = backWheel;
	}
	public Frame getFrame() {
		return frame;
	}
	public void setFrame(Frame frame) {
		this.frame = frame;
	}
	//toString
	public String toString() {
		return "Make: " +this.make+ 
				" Front Wheel: "+this.frontWheel+
				" Back Wheel: "+ this.backWheel+
				" Frame: "+this.frame;
	}
	//Equals
	public boolean equals(Bicycle AA) {
		return AA !=  null &&
				this.make.equals(AA.getMake())&&
				this.frontWheel.equals(AA.getFrontWheel())&&
				this.backWheel.equals(AA.getBackWheel())&&
				this.frame.equals(AA.getFrame());
	}
	
}
