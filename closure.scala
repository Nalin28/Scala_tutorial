//A closure is a function that uses 1 or more variables declared outside this function.

import java.util.Date
object Demo{
	var number = 10;
	val add = (x : Int) => x + number;//if the value of number changes then it will change inside the method as well as it takes the last valid state of the var

	def main(args: Array[String]){
		number = 100;
		println(add(20));
	}
}


object Demo{
	var number = 10;
	val add = (x : Int) => {number = x + number; number;}//changing value of number itself=>it will be updated

	def main(args: Array[String]){
		number = 100;
		println(add(20));
		println(number);//120
	}
}


object Demo{
	var number = 10;//impure closure if val number it will be pure closure
	val add = (x : Int) => x + number;//if the value of number changes then it will change inside the method as well as it takes the last valid state of the var

	def main(args: Array[String]){
		number = 100;
		println(add(20));
	}
}
