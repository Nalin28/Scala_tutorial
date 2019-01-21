//higher order functions- able to return other functions

object Demo{
	def math(x: Double, y: Double, f:(Double,Double)=>Double): Double = f(x,y);//x,y,function to decide what operator should be chosen
	def main(args: Array[String]){
		val result = math(50,20,(x,y)=>x+y);//x*y or x min y or x max y
		println(result);
	}
}



object Demo{
	def math(x: Double, y: Double,z: Double, f:(Double,Double)=>Double): Double = f(z,f(x,y));//x,y,function to decide what operator should be chosen
	def main(args: Array[String]){
		val result = math(50,20,10, (x,y)=>x+y);//or _+_(_is wild card and can be substituted with a value)
		println(result);
	}
}