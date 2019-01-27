//scala - inheritance
//extending a class
//creating new classes which retain characterstics of the base class
//this is called inheritance
//involves super class and subclass
//subclass inherits the members of the superclass
//on top of which it can add its own members

//           superclass
//            POLYGON
//          ^         ^
//			|(extends)|
//     RECTANGLE   TRIANGLE
//     subclass     subclass  


//scala - class - extending a class
//new project -> scalaClass -> src -> Package -> Inheritance -> Inheritance.Polygon ->Inheritance.Rectangle -> Inheritance.Triangle


//Polygon

package Inheritance

class Polygon{
	def area: Double = 0.0;
}

object Polygon{
	def main (args: Array[String]){
		
		var poly = new Polygon;
		printArea(poly);//0.0
		
		var rect = new Rectangle(55.2, 20.0);
		printArea(rect);//1104.0
		
		var tri = new Triangle(55.2, 20.0);
		println(tri);
	}

	def printArea(p: Polygon){
		println(p.area);
	}
}

//Rectangle
package Inheritance

class Rectangle(var width: Double, var height: Double) extends Polygon{
	override def area: Double = width * height;//you need to give override keyword since rect class will override the polygon class
}




//Triangle
package Inheritance

class Triangle(var width: Double, var height: Double) extends Polygon{
	override def area: Double = 0.5 * width * height;
	
}


