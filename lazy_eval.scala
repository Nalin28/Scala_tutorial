//scala - Lazy Evaluation
//lazy evaluation delays the evaluation untill the evaluation is needed
//strict and lazy evaluation

class strict{
	val e = {
		println("strict");
		9
	}
}

class lazyEval{
	lazy val l = {
		println("lazy");
		9
	}
}

object Demo{
	def main(args:  Array[String]){
		//lazy val l = 9;//Int = <lazy>
		val x = new strict;//only strict printed
		val y = new LazyEval;//will only be evaluated when l will be used

		println(x.e);
		//strict
		//9
		println(y.l);
		//lazy
		//9(now printed as it is called directly)
    }
}



//call by name

object Demo{
	
		def method1(n: Int){
			println("Method 1");
			println(n);
		}
		def method2(n: => Int){//call by name
			println("Method 2");
			println(n);
		}
		def main(args:  Array[String]){
			val add = (a: Int, b: Int) => {
				println("Add");
				a+b
			}
			method1(add(5,6));//Add Method 1 11
			method2(add(5,6));//Method 2 Add 11
    }
}

