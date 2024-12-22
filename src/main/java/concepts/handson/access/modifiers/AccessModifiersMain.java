package concepts.handson.access.modifiers;

class AccessModifiersExample{

    //defining attributes
    private String pvtVar = "This is a private variable";
    public String pubVar = "This is a public variable";
    protected String protVar = "This is a protected variable";
    String defVar = "This is default variable";

    //demonstrating private method that can be access within the same class.
    private void pvtMethod()
    {
        System.out.println("Printing private method");
    }

    //demonstrating public method that can be access everywhere..
    public void publicMethod()
    {
        System.out.println(pvtVar);
        System.out.println(pubVar);
        System.out.println(protVar);
        System.out.println(defVar);
    }

    //demonstrating protected method that can be access within the same package or other package's subclasses.
    protected void protMethod()
    {
        System.out.println(protVar);
    }

    //demonstrating default method that can be access within the same package.
    void defMethod()
    {
        System.out.println(defVar);
    }
}

public class AccessModifiersMain
{

    public static void main(String[] args) {

        AccessModifiersExample accessModifiersExample = new AccessModifiersExample();

        //calling public access specifiers in different class of same package.
        System.out.println(accessModifiersExample.pubVar);
        accessModifiersExample.publicMethod();

        //calling public access specifiers in different class of same package.
//        System.out.println(accessModifiersExample.pvtVar);   //'pvtVar' has private access in 'concepts.handson.access.modifiers.AccessModifiersExample'

        //I can call here def and protected as within the same package.
    }

}