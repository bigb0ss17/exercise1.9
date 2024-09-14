public class Person {

    private String name;
    private int age;
    private String eyeColor;

    //Constructor

    public Person(String name, int age, String eyeColor){
            this.name = name;
            this.age = age;
            this.eyeColor = eyeColor;
    }

    //non-parameter constructor

    public Person(){this("Unknown", 0, "Unknown");}

    //setter

    public void setName(String name){this.name = name;}
    public void setAge(int age){this.age = age;}
    public void setEyeColor(String eyeColor){this.eyeColor = eyeColor;}

    //getter

    public String getName(){return this.name;}
    public int getAge(){return this.age;}
    public String getEyeColor(){return this.eyeColor;}

    //toString

    public String toString(){
        return ("Person's name is: " + name +  " Age is: " + age +  " Eye color is: "  + eyeColor);
    }

    //talk

    public void talk(){
        System.out.println("Welcome coders! I am " + name + ".");
    }


}
