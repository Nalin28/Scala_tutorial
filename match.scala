object Demo{
	def main(args: Array[String]){
		val age = 18;

		age match {
			case 20 => println(age);//can be "20" if val is string
			case 18 => println(age);
			case 30 => println(age);
			case 40 => println(age);
			case 50 => println(age);

			case _=> println("default");
		}

		val result = age match {
			case 20 => age;//can be "20" if val is string
			case 18 => age;
			case 30 => age;
			case 40 => age;
			case 50 => age;

			case _=> 0;
		}

		val i =7;
		i match {
			case 1| 3| 5| 7| 9| =>println("odd");//odd
			case 2| 4| 6| 8| 10| =>println("even");
		}
	}
}