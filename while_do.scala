object Demo{
	def main(args: Array[String]){
		var x = 0;

		while(x<10){
			println("x ="+x);//++x not allowed
			x +=1;
		}

		//do

		var y =0;
		do{
			println("y = "+y)
			y +=1;
		}while(y<10);
	}
}