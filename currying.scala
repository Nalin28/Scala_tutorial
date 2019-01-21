//Currying is the technique of transforming a function that 
//takes multiple args. into a function 
//that takes a single argument

object Demo{
	def add(x:Int, y:Int) = x+y

	def add2(x : Int) = (y : Int) => x+y;//curried function

	def add3(x:Int)(y:Int) = x+y;//another signature of curried function
	def main(args:Array[String]){
		println(add(20,10));
		println(add2(20)(10));//curried function

		val sum40 = add2(40);//applying partial funct. to curried funct.
		println(sum40(100));//140

		println(add3(100)(200));
		val sum50 = add3(50)_;//partial app. funct
		println(sum50(400));
	}
}
