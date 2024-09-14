import org.w3c.dom.Text;

public class TextbooksTester {
    public static void main(String[] args) {
        Textbooks Textbooks1 = new Textbooks();
        System.out.println(Textbooks1);
        Textbooks1.setEdition("PeePeePooPoo");
        Textbooks1.setPages(420);
        Textbooks1.setName("Goons with the Spoon");
        System.out.println(Textbooks1);
        Textbooks1.excitement();

        Textbooks Textbooks2 = new Textbooks();
        Textbooks2.setName("Airplanes and More");
        String name = Textbooks2.getName();
        System.out.println(name);
        Textbooks2.excitement();

    }
}
