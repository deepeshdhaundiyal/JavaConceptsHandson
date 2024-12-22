package concepts.handson.abstractVSinterfaces;

//Initialisation is not possible
public interface InterfaceExample
{
     int age = 0; //variable initialisation required and only public access can be given.

//    InterfaceExample() {}  NOT allowed in an interface

     default void ConcreteMethod(){    //need to grant default, private access to ConcreteMethod

     }

     void normalMethods();             //Modifier 'abstract' is redundant for interface methods

}
