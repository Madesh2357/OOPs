class Shape{
	void display(){
		System.out.println("This is a Shape");
}
}
class Circle extends Shape{
	double radius;
	Circle(double r){
		radius = r;
}
	
	void display(){
		System.out.println("This is a Circle");
}
	double area(){
		return Math.PI * radius * radius;
}
}
class Rectangle extends Shape{
	double length, breadth;
	Rectangle(double l, double b){
		length = l;
		breadth = b;
}
	double area(){
		return length * breadth;
}
	void display(){
		System.out.println("This is a rectangle");
}
}
public class Mano{
	public static void main(String[] args){
		Circle c = new Circle(5);
		c.display();
		double area1 = c.area();
		System.out.println("Area of Circle = "+ area1);
		

		Rectangle r = new Rectangle(4, 6);
		r.display();
		double area2 = r.area();
		System.out.println("Area of Rectangle = "+ area2);
		
}
}
