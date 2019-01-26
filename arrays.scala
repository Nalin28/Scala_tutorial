//scala- arrays
import Array._

object Demo{
	val myarray: Array[Int] = new Array[Int](4);//if you directly print the array without defining then it will print the default values of the array data type
	val myarray2 = new Array[Int](5);//Boolean Double ..
	val myarray3 = Array(1,2,3,4,5,6,8);

	def main(args: Array[String]){
		myarray(0) = 20;
		myarray(1) = 50;
		myarray(2) = 10;
		myarray(3) = 30;//not convenient
		println(myarray);
		println(myarray3.length);
		
		val result = concat(myarray, myarray3);

		for (x <- myarray2){//way-1
			println(x);
		}
		
		for(i <- 0 to (myarray.length - 1)){//way-2
			println(myarray(i));
		}



	}
}