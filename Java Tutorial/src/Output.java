import org.w3c.dom.Text;

public class Output {

    public static void main(String[] args)
    {
        // TEXT SECTION
        System.out.println("TEXT SECTION");
        System.out.println("Many println");
        System.out.println("Can be used");

        System.out.println("But do remember that you need to use \"Double Quotes\"");


        System.out.print("System.out.print > Similar to println however does not include the separator string: def \\n\n\n");

        // NUMBERS SECTION
        System.out.println("NUMBERS SECTION");
        System.out.println("You can also print integers such as: " + 3);
        System.out.println("This was achieved with concatenation" + " where we used a plus symbol to join two values");
        System.out.println("Quotes are not needed when dealing with numbers.\n");

        System.out.println("You can also perform mathematical equations when outputting.");
        System.out.println(3 + " Multiplied by " + 5 + " Equals " + 3*5);
    }


}
