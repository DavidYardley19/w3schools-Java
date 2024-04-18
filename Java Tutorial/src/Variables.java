public class Variables {

    public static void main(String[] args)
    {

        Variables myObject = new Variables();
        myObject.GetOutOfStaticContext();

    }

    public void GetOutOfStaticContext()
    {
        ProduceTitle("Variables");

        String myString = "Hello World";
        int myInt = 10;
        float myFloat = 10.99f;
        char myChar = 'a';
        boolean myBoolean = true;

        // Variables can be changed at runtime.
        System.out.println(myInt);
        myInt = 11;
        System.out.println(myInt);

        // If you do not want a variable to change, you can declare it as a constant with the final keyword.
        final float PI = 3.14159265f;
        // note: this produces an error since we cannot change it // PI = 1.2f;

        ProduceTitle("Print Variables");

        // combine both text and a var:
        String name = "David";
        String surname = "Yardley";
        System.out.println("Hello" + name + " " + surname + " " + 19);

        // You can also join them and assign to another variable
        String fullName = name + surname;
        System.out.println(fullName);

        // Math functions can also be complete between two variables:
        System.out.println(2+19.5);

        ProduceTitle("Declare Multiple Variables");

        // Instead of:
        int x = 1;
        int y = 2;
        int z = 3;
        System.out.println(x + " " + y + " " + z);
        // You can write:
        int a = 1, b = 2, c = 3;
        System.out.println(a + " " + b + " " + c);

        // You can assign the same value to multiple vars
        boolean bool1, bool2, bool3;
        bool1 = bool2 = bool3 = true;
        System.out.println(bool1 + " " + bool2 + " " + bool3);

        ProduceTitle("Identifiers");

        // All vars have unique names called identifiers. Descriptive names make the code more readable.

        // Good example:
        int minutesPerHour = 60;
        // OK but not so easy to understand what m actually is
        int m = 60;

        System.out.println
                (
                        "GENERAL RULES\n" +
                                "\tCan contain letters digits underscores and dollar signs\n" +
                                "\tMust begin with a letter\n" +
                                "\tShould start with lower case, but upper is fine for constants\n" +
                                "\tNo whitespace\n" +
                                "\tThey can also begin with a $ or _ >> But these will not be used\n" +
                                "\tThey are case sensitive! myVar and myvar are two different Identifiers\n" +
                                "\tReserved words cannot be used, such as int or boolean."

                );
    }



    public void ProduceTitle(String title_name)
    {
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println(title_name);
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-\n");
    }

}
