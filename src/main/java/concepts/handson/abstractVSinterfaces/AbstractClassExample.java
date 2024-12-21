package concepts.handson.abstractVSinterfaces;

public abstract class AbstractClassExample
{
    //defining attributes
    private String name;

    //concrete method example
    private String yourName(){
        return this.name;
    }

    //Setter to set values of name from outside
    public void setName(String name) {
        this.name = name;
    }

    //declaring an abstract method
    public abstract void getName();
}
