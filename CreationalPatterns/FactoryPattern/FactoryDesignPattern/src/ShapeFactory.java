
public class ShapeFactory {

	public Shape createShape(String ShapeType){
		
		if(ShapeType == null)
		return null;
		
		if(ShapeType.equalsIgnoreCase("Rectangle"))
			return new Rectangle();
		
		if(ShapeType.equalsIgnoreCase("Circle"))
			return new Circle();
		
		if(ShapeType.equalsIgnoreCase("Square"))
			return new Square();
		
		return null;
		
	}
}
