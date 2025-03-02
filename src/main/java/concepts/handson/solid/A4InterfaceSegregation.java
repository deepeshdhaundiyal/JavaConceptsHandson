package concepts.handson.solid;

public interface A4InterfaceSegregation {
    //segregates small-small interfaces
}

interface Fly{
    void flying();
}

interface Swim{
    void swimming();
}

class Parrots implements Fly{

    @Override
    public void flying() {
        System.out.println("Parrots can fly");
    }

}

class Penguin implements Fly, Swim
{

    @Override
    public void flying() {
        System.out.println("Penguins can fly.");
    }

    @Override
    public void swimming() {
        System.out.println("Penguins can swim.");
    }
}