var c : Int = 2

var c = true

var d = 12.3

var d = 12.3f

val x = {val a :Int = 200 ; val b : Int = 300 ; a+b}

or

val x = {
	| val a : Int = 500
	| val b : Int = 600
	| a+b
    |}

 //if we have a list of millions of numbers but we dont use it then it would be a waste, for that we have a lazy declaration

 lazy val x = 500//Int = <lazy> memory allocated only when the variable is in use

 