package concepts.handson.solid;

public class A3LSP
{
    //liskov substitution principle shows that a child class can substitute as a parent class
    //suppose a parent class bird with child as Penguin
    //Penguins can't fly so will substitute it as a Parent class.
}

class Birds {
      void fly(){
          System.out.println("Birds are flying.");
      }
}

class Parrot extends Birds{

    public static void main(String[] args) {
        Parrot p = new Parrot();
        p.fly();
    }
}

//Now since we know penguins can not fly so will not extend parents class
class Penguins{

    public static void main(String[] args) {
        Penguins.waddle();
    }

    static void waddle(){
        System.out.println("Penguins are wadlling.");
    }
}