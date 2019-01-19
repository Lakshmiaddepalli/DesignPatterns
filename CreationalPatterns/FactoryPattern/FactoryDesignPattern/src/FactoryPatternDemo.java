
public class FactoryPatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ShapeFactory sf = new ShapeFactory();
		Shape value = sf.createShape("Rectangle");
		value.draw();
		
		Shape value1 = sf.createShape("Circle");
		value1.draw();
		
		Shape value2 = sf.createShape("Square");
		value2.draw();
	}

}
