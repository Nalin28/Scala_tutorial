//scala- Tuples
//can contain hetrogenous data 
//immutable
object Demo{
	val mytuple = (1, 2, "Hello", true);//can contain objects as well
	val mytuple2 = new Tuple3(1, 2, "hello");//Tuple3 means it has 3 elements so if n elements Tupleln(1-22 elements allowed in theis signature)
	val mytuple3 = new Tuple3(1, "hello", (2,3));//how to access (2,3)?*
	def main(args: Array[String]){
		println(mytuple._3);//hello
		println(mytuple._1);//1
		println(mytuple._2);//2
		println(mytuple._4);//true
		println(mytuple2._1);//1


		//iteration
		mytuple.productIterator.foreach{
			i => println(i);//1 2 hello true
		}

		println(1 -> "Tom");//creates a tuple - only valid for 2 elements(1,Tom)
		println(1 -> "Tom" -> true);//((1,Tom),true)

	println(mytuple3._3);//(2,3))*

	}
}