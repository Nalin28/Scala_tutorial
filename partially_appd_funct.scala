object Demo{

	def main(args: Array[String]){
		val sum = (a: Int, b: Int, c: Int) =>a + b + c//applying function to the arguments(fully applied function)

		println(sum(10, 20, 30));
	}
}


//partially applied functions

object Demo{

	def main(args: Array[String]){
		val sum = (a: Int, b: Int, c: Int) =>a + b + c//applying function to the arguments(fully applied function)

		val f = sum(10,20,_ : Int)
		println(f(30));//giving the wild card value only
	}
}

//log a message(example of partially applied function)

import java.util.Date

object Demo{
	def log(date: Date, message: String) = {
		println(date+"  "+message);
	}
def main(args: Array[String]){
	val date = new Date;
	val newLog = log(date, _ : String);//partially applied

	newLog("the message is 1");//time1    message1
	newLog("the message is 2");//time2    message2     
	newLog("the message is 3");
	newLog("the message is 4");
}

}