package exct;

public class Main {

    public static void main(String[] args) {
	    Animal [] animals = {
                new Dog(),
                new Cow(),
                new Bird()
        };
        for (int i=0; i<animals.length; i++){
            animals[i].eat();
            animals[i].speak();
        }
    }
}
