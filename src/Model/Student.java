package Model;

public class Student {

    //Attributes
    private final String name;
    private final float heitght;
    private final int age;

    //Constructor
    public Student(String name, float height, int age)
    {
        this.name = name;
        this.heitght = height;
        this.age = age;
    }

    //Getters
    public String getName() {
        return name;
    }

    public float getHeitght() {
        return heitght;
    }

    public int getAge() {
        return age;
    }
}
