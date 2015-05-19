package be.vdab.shapes;

public class Rectangle extends Shape {
   double side;

	public Rectangle(String name, double side) {
		super(name);
		this.side = side;
    }
    
    public double area(){
    	return 22;
    }
    
    

	@Override
	public double perimeter() {
		return side*4;
	}
    
    
}
