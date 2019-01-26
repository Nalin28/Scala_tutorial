//Scala - Maps
//collection of key-value pairs
//key is unique
//mutable and immutable
object Demo{
	val mymap: Map[Int, String] = Map(801 -> "Max",802 -> "Tom",804 -> "July");
	//even if u give a duplicate key it will take the last key value 
	val mymap2: Map[Int, String] = Map(805 -> "lua");
	def main(args: Array[String]){
	println(mymap);
	println(mymap(802));//value of key: 802 -> Tom
	//if 803 is asked it will throw exception
	println(mymap.keys);//Set(801,802,804)
	println(mymap.values);//MapLike.DefaultValuesIterable(Max, Tom, July)
	println(mymap.isEmpty);//false
 	//printing in a tabular order
	mymap.keys.foreach{ key =>
		println("key " + key);
		println("Value" + mymap(key));

	}

	println(mymap.contains(key));//true or false- if you do not use contains it will throw an exception
	println(mymap ++ mymap2);//concatination
	println(mymap.size);//size of the map
	}
}