object Demo{
	def main (args: Array[String]){

		for(var a <- Range){
			statements
		}
	}
}

object Demo{
	def main (args: Array[String]){

		for(i <- 1 to 5){ //1.to(5) or 1.until(6) or 1 until 6
			println("i using to" +i);
		}

		for (i<- 1 to 9; j<- 1 to 3){//multi variables
			println("i using until" +i+" "+j);
		}

		//using lists
		val lst = List(1,2,3,4,5,6,78,9,5,4);

		for(i<- lst){
			println("i using lst"+i);
		}

		//after filtering
		for(i<-lst; if i<6){
			println("i using Filters "+i);
		}

		//as an expression(you can remove ; as well)
		val result = for {i<-lst; if i<6}yield{
			i*i
		}
		println("result ="+result);

	}
}