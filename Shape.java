
abstract public class Shape {

	abstract double surface_area();
	abstract double volume();

}

class Sphere extends Shape{
	
	double radius;
	
	Sphere(double radius){
		this.radius = radius;
	}
	
	@Override
	double surface_area(){
		return Math.PI * (radius * radius);
	}
	
	@Override
	double volume(){
		return (4 / 3) * Math.PI * (radius * radius * radius);
	}
	
	@Override
	public String toString() {
		return "Surface Area: " + surface_area() + "\n" + 
		"Volume: " + volume();
	}
}

class Cylinder extends Shape{

	double radius;
	double height;
	
	Cylinder(double radius, double height){
		this.radius = radius;
		this.height = height;
	}
	
	@Override
	double surface_area() {
		return (2 * Math.PI * (radius * radius)) + (2 * Math.PI * radius * height);
	}

	@Override
	double volume() {
		return Math.PI * (radius * radius) * height;
	}
	
	@Override
	public String toString() {
		return "Surface Area: " + surface_area() + "\n" + 
		"Volume: " + volume();
	}
}

class Cone extends Shape{

	double radius;
	double height;
	
	Cone(double radius, double height){
		this.radius = radius;
		this.height = height;
	}
	
	@Override
	double surface_area() {
		return (Math.PI * radius) * (radius * height);
	}
	
	@Override
	double volume() {
		return (1 / 3) * Math.PI * (radius * radius) * height;
	}
	
	@Override
	public String toString() {
		return "Surface Area: " + surface_area() + "\n" + 
		"Volume: " + volume();
	}
}

 class ShapeArray{
	public static void main(String[] args) {
		Shape[] shapeArray = new Shape[3];
		
		shapeArray[0] = new Sphere(3);
		shapeArray[1] = new Cylinder(2, 4);
		shapeArray[2] = new Cone(4, 8);
		
		for (Shape shape : shapeArray) {
			System.out.println(shape.toString() + "\n");
		}
	}
}