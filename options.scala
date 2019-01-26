//Scala - Options(Some or None)
//containert that can give 2 values(instances)

val lst = List(1, 2, 3);
val map = Map(1 -> "Tom", 2 -> "Max", 3 -> "John");

val opt : Option[Int] = Some(55);//can give None also

def main(args: Array[String]){
	println(lst.find(_ > 6));//None-since there is nothing > 6
	println(lst.find(_ > 2));//Some(3)
	println(map.get(1));//Some(Tom)
	//How to extract the value out of the Some- get
	println(lst.find(_ > 2).get);//3
	println(map.get(1).get);//Tom

	println(map.get(5));//throws an exception if we access a non-existant element
	//we can give a condition to stop that
	println(map.get(5).getOrElse("No name found")); //No name found
	//same can be used with none and will print the exception
	println(opt.isEmpty);//None = true, Some = false
	println(opt.get);//55




}
}
