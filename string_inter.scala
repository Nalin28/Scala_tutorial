//string interpolation
object HelloWorld{
	def main(args: Array[String]){
		val name = "mark"
		val age = 18
		println(name + " is "+ age + "years old")//concatination
		println(s"$name is $age years old")//s string interpolation
		println(f"$name%s is $age%d years old")//f interpolation %f for float
	}
}