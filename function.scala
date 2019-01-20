object Demo{

	def FunctionName(x : Int, y : Int): Int ={
		code
	}
	def main (args: Array[String]){

	}
}


object Demo{
	object Math{
		def add(x : Int, y : Int): Int ={
		return x+y;
		}
		def square(x : Int) = x*x;
	}

	def add(x : Int, y : Int): Int ={
		return x+y;
	}

	def subtract(x : Int, y : Int): Int ={
		x-y;//no return required(last line considered as the return value)
	}

	def multiply(x : Int, y : Int): Int = x*y;

	def divide(x : Int, y : Int) = x/y;//if we are certain of the return value we can omit the Int as well making it more concise

	def main (args: Array[String]){
		println(Math.add(45,15));
		println(Math square 3);//this is also valid
		println(add(45,15));
		println(subtract(45,15));
		println(multiply(45,15));
		println(divide(45,15));

	}
}