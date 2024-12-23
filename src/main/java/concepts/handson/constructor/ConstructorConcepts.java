package concepts.handson.constructor;

public class ConstructorConcepts {

    //creating attributes
    int x;

    String name;

    //Default constructor : A constructor that we do not need to create and called out when object is created
    ConstructorConcepts(){
        System.out.println("Default constructor is called...");
    }

    //Parametrised Constructor : A constructor that required parameters to pass on while initialising an object.
    ConstructorConcepts(int x, String value){
        System.out.println("Parameterised constructor is called...");
        this.x = x;
        this.name = value;
    }

    //Copy Constructor : Initializes an object using another object of the same class.
    ConstructorConcepts(ConstructorConcepts constructorConcepts){
        System.out.println("Copy constructor is called...");
        this.x = constructorConcepts.x;
        this.name = constructorConcepts.name;
    }

    void printMethod(){
        System.out.println("Print method is called...");
    }

    public static void main(String[] args){
        try {
            //Just checking if we define an object as null so what will happen.
            ConstructorConcepts constructorConcepts = null;
            constructorConcepts.printMethod();
        }catch (NullPointerException nullException)
        {
            System.out.println(nullException);
        }

        ConstructorConcepts constructorConcepts = new ConstructorConcepts();

        ConstructorConcepts constructorConceptsParametrised = new ConstructorConcepts(26,"Deepesh");

        ConstructorConcepts constructorConceptsCopy = new ConstructorConcepts(constructorConceptsParametrised);




    }
}
