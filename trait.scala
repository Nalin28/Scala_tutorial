//scala - trait
//scala does not allow multiple inheritance



//if we chanc=ge poly gon class to class Shape i.e. rectangle and triangle are also shapes and can also inherit from shape
//and can be written as (in rectangle class)

class Rectangle(var width: Double, var height: Double)
extends Polygon with Shape{...}
//this gives an error -> "class Shape needs to be a trait to be mixed in"
//does'nt allow multiple inheritance from multiple parent classes
//diamond problem

//traits are partially implemented interfaces

trait Shape{//atleast one method in trait should be abstract
	...
}

//now if you give the above subclass declaration it will work!
//so it is possible to inherit from a class and multiple traits in scala: use with keyword
//you can also omit override keyword with traits

...

trait Shape{
	def color: String;
}
...
...

def main(args: Array[String]){
	...
	println(rect.color);//red
	...
	println(tri.color);//green
	...
}



//Rectangle
class Rectangle(var width: Double, var height: Double)
extends Polygon with Shape{
	...
	 def color: String = "red";
	...
}


//Triangle
class Triangle(var width: Double, var height: Double)
extends Polygon with Shape{
	...
	/*override*/ def color: String = "green";
	...
}



