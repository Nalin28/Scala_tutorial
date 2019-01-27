//scala - class
//class helps in making an oubject out of them

//var - getter and setter both available
//val - getter  but not setter available
//default - neither available



class User;
//or
class User(var name: String, var age: Int);//constructor
//for outside access
class User(var name: String, var age: Int){
	def printName {println(name)}
};
object Demo{
	def main(args: Array[String]){
		var user = new User;
		//or
		var user = new User("Max",28);
		user.name = "Tom";//overwritten if var used but not in val

		user.age = 22;
		println(user.name);//Tom
		println(user.age);//22

		//you cannot, not put a var or val in the constructor else it gives an error
		//if we write private var name: String inside the class constructor we cant access the var inside the object Demo (access only inside the class)
		//or you can access it indirectly:
		user.printName//Tom

	}
}