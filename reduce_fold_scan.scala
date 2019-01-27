//Scala- Reduce, fold or scan (Left/Right)
//reduceLeft, reduceRight, foldLeft, foldRight, scanLeft, scanRight
//to perform binary operations on all elements
object Demo{
	val lst = List(1, 2, 3, 5, 7, 10, 13);
	val lst2 = List("A", "B", "C");
	def main(args: Array[String]){
		println(lst2.reduceLeft(_+_));//takes binary operator as an argumernt-ABC 
		println(lst.reduceLeft(_+_));//41
		println(lst.reduceLeft((x,y) => {println(x+","+y);x+y;}));
		//1,2- sum of 1 and 2 is 3 and is passed to the second function
		//3,3
		//6,5
		//11,7
		//18,10
		//28,13
		//41
	
		println(lst.reduceLeft(_-_));//-39
		println(lst.reduceRight(_-_));//7
		println(lst.reduceRight((x,y) => {println(x+","+y);x-y;}));
		//10,13
		//7,-3
		//5,10
		//3,-5
		//2,8
		//1,-6
		//7

		println(lst.foldLeft(0)(_+_));//we add 0 to the initial reduceLeft sum - 41
		println(lst.foldLeft(100)(_+_));//141
		println(lst2.foldLeft("Z")(_+_));//ZABC
		//scan gives the intermediate results as well 
		println(lst.scanLeft(100)(_+_));//List(100, 101, 103, 106, 111, 118, 128, 141)
		println(lst2.scanLeft("Z")(_+_));//List(Z, ZA, ZAB, ZABC)
		
	}
}