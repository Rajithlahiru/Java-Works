package exct;

public class Dog implements Animal{
    @Override
    public void eat(){
        System.out.println("Eats some meat");
    }
    @Override
    public void speak(){
        System.out.println("woof woof");
    }

}
