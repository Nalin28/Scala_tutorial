//scala - sets
//cant have duplicates
//mutable and immutable set
object Demo{
	val mylist: List[Int] = List(1,2,3,4,5,6,6);//has duplicate values
	//default-imutable sets
	val myset: Set[Int] = Set(1,2,3,4,5,6,6);//even after giving duplicate values it will only  print the duplicate value once
	val myset2: Set[Int] = Set(34,42,43,44,45,46);
	val names: Set[Int] = Set("Max","Tom","John");
	//to make mutable use this notation:
	//var myset: Set[Int] = scala.collection.mutable.Set(1,2,3,4,5,6,6);

	def main(args: Arrays[String]){
		println(myset + 10);//will print another set with 10 value but will not change own set's value
		println(myset);//sets in scala are not ordered-  Sets(2,3,5,4,6,1)
		println(myset(8));//true
		println(myset.head);//5
		println(myset.tail);//Set(1,6,7,2,3,4,5)
		println(myset.isEmpty);//false
		println(myset ++ myset2);//concats the sets
		println(myset.++(myset2));//concats the sets

		println(myset.&(myset2));//intersection of both sets
		println(myset.intersect(myset2));//intersection of both sets
		
		println(myset.max);
		println(myset.min);

		//printing the elements
		myset.foreach(println);
		
		for(name <- names){
			println(name);
		}
	}
}
}