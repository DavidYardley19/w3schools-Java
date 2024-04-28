package JavaTutorial;

public class Variables
{

    public static void main(String[] args)
    {

        System.out.println("");
        System.out.println("-=-=-=-=-=-");
        System.out.println("Variables");
        System.out.println("-=-=-=-=-=-");
        System.out.println("");

        String myString = "Hello";
        final int myInt = 123;
        float myFloat = 19.99f;
        double myDouble = 19.99999d;
        char myChar = 'a';
        // Note characters always take single quotes, whilst strings take double quotes
        boolean myBool = true;
        // Lower case, not so happy. >> Prefer "True"

        System.out.println(myInt);
        // myInt += 1;
        // The code above would produce an error since it is a constant
        // Meaning unchangeable. Get used to making the variable names all caps. See below
        final double PI = 3.14159265d;
        System.out.println(myInt);

        System.out.println("");
        System.out.println("-=-=-=-=-=-");
        System.out.println("Print Variables");
        System.out.println("-=-=-=-=-=-");
        System.out.println("");

        System.out.println("To combine text and a variable, use a plus sign " + myString + " " + myInt);
        System.out.println("You can make a new variable out of two other variables");
        String firstname = "Andy";
        String lastname = "White";
        String fullname = firstname + " " + lastname;
        System.out.println(fullname);

        System.out.println("Be very carefyl with numbers\n" +
                "If you join them with a string, then it may not work out the way you intended.");
        System.out.println(5 + 6);

        System.out.println("");
        System.out.println("-=-=-=-=-=-");
        System.out.println("Declare Multiple Variables");
        System.out.println("-=-=-=-=-=-");
        System.out.println("");

        // instead of the following:
        int x = 1;
        int y = 2;
        int z = 3;
        // Use the following:
        int a = 1, b = 2, c = 3;

        // You can assign one value to multiple variables
        int q, w, e;
        q = w = e = 10;

        // Also works on one line
        int j, k, l = 10;

        System.out.println("");
        System.out.println("-=-=-=-=-=-");
        System.out.println("Identifiers");
        System.out.println("-=-=-=-=-=-");
        System.out.println("");

        System.out.println("All variables are assigned unique names, this is case sens;");
        System.out.println("Get used to using more descriptive names so it's easier to understand");

        System.out.println("""
                General rules:
                \t Can contain letters digits underscores and dollar signs
                \t They must begin with a letter, but can also start with a dollar sign  - not used here
                \t Should start lowercase, unlike Classes - must not contain whitespace
                \t Reserved keywords cannot be used such as int or System...
                """);


    }

}
