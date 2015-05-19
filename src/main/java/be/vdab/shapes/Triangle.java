package be.vdab.shapes;

public class Triangle extends Shape {
    public Triangle(String name) {
        super(name);
    }
    
    public double area(){
    	return 12;
    }

	@Override
	public double perimeter() {
		return 16;
	}
    
    
}
