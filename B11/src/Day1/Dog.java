package Day1;

public class Dog 
{
    // Instance Variables
	//State: It is represented by attributes of an object.
	//It also reflects the properties of an object.
    String name;
    String breed;
    int age;
    String color;
 
    // Constructor Declaration of Class
    public Dog(String name, String breed,
                   int age, String color)
    {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.color = color;
    }
 
    // method 1
    //Behavior: It is represented by methods of an object.
    //It also reflects the response of an object with other objects.
    public String getName()
    {
        return name;
    }
 
    // method 2
    public String getBreed()
    {
        return breed;
    }
 
    // method 3
    public int getAge()
    {
        return age;
    }
 
    // method 4
    public String getColor()
    {
        return color;
    }
 
    //Override
    public String toString()
    {
        return("Hi my name is "+ this.getName()+
               ".\nMy breed,age and color are " +
               this.getBreed()+"," + this.getAge()+
               ","+ this.getColor());
    }
 
    public static void main(String[] args)
    {
        // creating object of class Dog
        Dog tuffy = new Dog("tuffy","papillon", 5, "white");
        System.out.println(tuffy.toString());
    }
}