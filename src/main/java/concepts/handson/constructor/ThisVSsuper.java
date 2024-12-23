package concepts.handson.constructor;

public class ThisVSsuper{

    int age;
    String name;

    //this keyword use case
    ThisVSsuper(){
        this(26, "Deepesh");
    }

    ThisVSsuper(int x, String value)
    {
        this.age = x;
        this.name = value;
    }
}

class Child extends ThisVSsuper{

    Child(){
        super(25,"Rahul");
    }

    public static void main(String[] args) {

    }
}