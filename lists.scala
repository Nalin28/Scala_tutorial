//scala lists
//arrays are mutable and lists are immutable
//list represent linked list
object Demo{
	val mylist: List[Int] = List(1,2,3,4,5,6,7);
	val names: List[String] = List("Max","Tom","John");
	def main(args: Array[String]){
		mylist(0) = 5;//error- since immutable

		println(mylist);
		println(names);

		println(0 :: mylist);//conse-0 will be appended to the list
		println(1 :: 5 :: 9 :: Nil);//Nil creates a list and conse puts 1,5,9
		println(mylist.head);//1
		println(names.tail);//List(Tom,John)
		println(names.isEmpty);//false
		println(mylist.reverse);//7 6 5 4 3 2 1
		println(List.(5)(2));//List(2,2,2,2,2) creates a list of 5 two's
		println(mylist.max);//7
		mylist.foreach(println);//performs any function written inside on each element of the list
		var sum : Int = 0;
		mylist.foreach(sum += _)//adds each element of the list
		println(sum);

		for(name <- names){
			println(name);
		}

		println(names(0));//printing first element
	}
}