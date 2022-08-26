package java_data_types;

abstract class shape{
abstract void RectangleArea(double width, double length);
abstract void SquareArea(double side);
abstract void CircleArea(double r);
}
 class Area extends shape {

	@Override
	void RectangleArea(double width, double length) {
	System.out.println("Rectangle area: "+2.5*5);
		
	}

		
	

	@Override
	void CircleArea(double r) {
		// TODO Auto-generated method stub
		
	}




	@Override
	void SquareArea(double side) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	}
	


	
