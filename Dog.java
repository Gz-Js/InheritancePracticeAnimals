public class Dog extends Animal
{
 private String breed;
    public Dog()
    {
        this.breed = "Mutt";
    }
    public Dog(int age, String name, boolean fed, String breed)
    {
        super(age, name, fed);
        this.breed = breed;
    }
    public String getBreed()
    {
        return this.breed;
    }
    public void soundOff()
    {
        System.out.println("Bark!");
    }
     public String toString()
    {
        String info = "This dog is " + this.age + " years old, its name is " +
                this.name + ", it is " + this.fed + " that it has been fed, and its breed is " +
                this.breed + ".";
        return info;
    }
     public boolean equals(Dog a)
    {
        return this.breed.equals(a.getBreed());
    }
    public String play()
    {
        String play = "";
        int time = (age * -1) + 5;
        if (time <= 0)
        {
            play = "The dog named " + this.name + " is " + this.age + " years old and is too old to play!";
        }
        else
        {
            play = "The dog named " + this.name + " is " + this.age + " years old and can play for " + time + " hours.";
        }
        return play;
    }
    public void getOlder()
    {
        this.age = this.age + 1;
    }
}
