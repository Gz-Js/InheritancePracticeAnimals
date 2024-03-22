public class Cat extends Animal
{
    private String size;
    private int lives = 9;
    public Cat()
    {
        this.size = "Small";
    }
    public Cat(int age, String name, boolean fed, String size, int lives)
    {
        super(age, name, fed);
        this.size = size;
        this.lives = lives;
    }
    public String getSize()
    {
        return this.size;
    }
    public void soundOff()
    {
        System.out.println("Meow!");
    }
    public String toString()
    {
        String info = "This cat is " + this.age + " years old, its name is " +
                this.name + ", it is " + this.fed + " that it has been fed, and it is a " +
                this.size + " sized cat with " + this.lives + "lives left.";
        return info;
    }
    public boolean equals(Cat a)
    {
        return this.size.equals(a.getSize());
    }
    public void loseLife()
    {
        this.lives = this.lives - 1;
        if (this.lives <= 0)
        {
            System.out.println(this.name + " has " + this.lives + " lives and has died.");
        }
        else
        {
            System.out.println(this.name + " has " + this.lives + " lives left.");
        }
    }
    public String purr()
    {
        return "prrrrrrrr";
    }
}
