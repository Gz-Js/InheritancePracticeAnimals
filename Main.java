import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        ArrayList<Animal> pets = new ArrayList<Animal>();

        Animal animal = new Animal();
        Animal cheetah = new Animal(5, "Fluffy", true);
        Animal puppy = new Dog();
        Animal kitty = new Cat();
        Animal ben = new Dog(2, "Ben", true, "Border Collie");
        Animal suzie = new Cat(3, "Suzie", true, "Normal", 8);
        Animal pancho = new Dog(17, "Pancho,", false, "Chihuahua");
        Animal peppa = new Cat(3, "Peppa", true, "Fat", 5);
        Animal lion = cheetah;
        Animal bear = new Animal(10, "Oso", false);

        pets.add(animal);
        pets.add(cheetah);
        pets.add(puppy);
        pets.add(kitty);
        pets.add(ben);
        pets.add(suzie);
        pets.add(pancho);
        pets.add(peppa);
        pets.add(bear);
        pets.add(lion);
    }
}