object Demo{
	def main(args: Array[String]){
		val x = 20;
		var res = "";
		if(x == 20){//x<= >= < > 20 etc. && || !=
			
			res = "x == 20"

		}else{
			res = "x != 20"
		}
		println(res);


		//if expressions

		val res2 = if(x == 20) "x==20" else "x!=20";
			println (res2);//you can directly also write in println

	}
}