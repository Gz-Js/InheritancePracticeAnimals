public class Animal
{
    int age;
    String name;
    boolean fed = false;
    public Animal()
    {
        age = 0;
        name = "Unknown";
        fed = false;
    }
    public Animal(int age, String name, boolean fed)
    {
        this.age = age;
        this.name = name;
        this.fed = fed;
    }
    public void setAge(int age)
    {
        this.age = age;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public void feed()
    {
        this.fed = true;
    }
    public int getAge()
    {
        return this.age;
    }
    public String getName()
    {
        return this.name;
    }
    public boolean isHungry()
    {
        return this.fed;
    }
    public void soundOff()
    {
        System.out.println("ROAR");
    }
    public void walk()
    {
        int distance = (this.age * -1) + 50;
        System.out.println("This animal can walk " + distance + " steps before getting tired.");
    }
    public String toString()
    {
        String info = "This animal is " + this.age + " years old, its name is " +
                this.name + ", and it is " + this.fed + " that it has been fed";
        return info;
    }
    public boolean equals(Animal a)
    {
        return this.name.equals(a.getName());
    }
}
