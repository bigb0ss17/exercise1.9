public class Textbooks {
    private String name;
    private int pages;
    private String edition;

    //constructor
    public Textbooks(String name, int pages, String edition){
        this.name = name;
        this.pages = pages;
        this.edition = edition;
    }

    //default/no argument constructor
    public Textbooks(){this("Model Kits 101", 160, "First");}


    //setter

    public void setName(String name){this.name = name;}
    public void setPages(int pages){this.pages = pages;}
    public void setEdition(String edition){this.edition = edition;}

    //getter

    public String getName(){return this.name;}
    public int getPages(){return this.pages;}
    public String getEdition(){return this.edition;}

    //toString

    public String toString(){
        return("The name of the textbook is: " + name + " It has: " + pages + " pages It is the " + edition + " edition.");
    }

    public void excitement(){
        System.out.println("Wow! I love " + name + "! It is such a great textbook! It's only " + pages + " pages!");
    }
}
