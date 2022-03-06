package exct;

public class Cow implements Animal{
    @Override
    public void eat(){
        System.out.println("Eats some grass");
    }
    @Override
    public void speak(){
        System.out.println("Moo");
    }
}
