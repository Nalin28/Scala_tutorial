//1. we do not want the super class to be instantiated since it is useless and not doing anything
//2. we want to make the child classes robust so that when the user gives in data it does not print something else as if the sub class was empty

//scala - abstract classes
//an abstract class cant be instantiated and does a few things for the sub classes:
//.define methods which can be used by the inheriting subclass.
//.define abstract methods which the inheriting subclass must implement.
//.provide common interface which allows the subclass to be interchanges with all other subclasses.

...
abstract class Polygon{//only adding an abstract keyword
//no body
}
...

//all subclasses must have body (def area:)...