// scala - auxiliary constructors
//default constructors that do not take any inputs
//start with this key word
//they must call the previously defined constructors

//                 Getter?   Setter?
//____________    _________  ________
//var                yes	   yes
//val                yes        no
//default             no        no

class User(var name: String, var age: Int){//primary constructor
	def this(){//default constructor
		this("Tom", 32);
	}

	def this(name : String){//aux constructor
		this(name,32);

	}
};

object Demo{
	def main(args: Array[String]){
		var user1 = new User("Max", 28);
		var user2 = new User();
		var user3 = new User("Max");

	}
}