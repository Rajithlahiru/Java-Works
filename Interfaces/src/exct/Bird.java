package exct;

public class Bird implements Animal {
    @Override
    public void eat(){
        System.out.println("Eats some worm");
    }
    @Override
    public void speak(){
        System.out.println("tweet tweet");
    }
}
