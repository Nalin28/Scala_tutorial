//scala- map and filter
object Demo{
	val lst = List(1,2,3,5,7,10,13);
	val mymap = Map(1 -> "Tom", 2 -> "Max", 3 -> "John");
	def main(args: Array[String]){
		
		println(lst.map(_*2));//will iterate over the list and double every element
		
		println(lst.map(x => x*2));//performs the same function as above
		
		println(lst.map(x => "hi"+x));//hi1, hi2, hi3...
		
		println(lst.map(x => "hi"*x));//hi, hihi, hihihi...

		println(mymap.map(x => "hi" + x ));//hi(1,Tom), hi(2,Max)...

		println(mymap.mapValues(x => "hi " + x));//1 -> hi Tom, 2 -> hi Max...

		println("hello".map(_.toUpper));//HELLO

		println(List(List(1,2,3), List(3,4,5)).flatten);//List(1,2,3,3,4,5)

		println(lst.flatMap(x => List(x, x+1)));//1,2,2,3,3,4,5,6,7,8,10,11,13,14
		//filter
		println(lst.filter(x => x%2==0));//2, 10
		




	}
}