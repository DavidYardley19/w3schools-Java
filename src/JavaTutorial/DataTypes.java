package JavaTutorial;

import java.awt.*;

public class DataTypes
{

    public static void main(String[] args)
    {

        System.out.println("");
        System.out.println("-=-=-=-=-=-");
        System.out.println("Data Types");
        System.out.println("-=-=-=-=-=-");
        System.out.println("");

        System.out.println("Variables must be defined with a specific data type\n" +
                "Such as String, int, float, boolean, char... ");
        int myNum = 10;
        String myString = "David";
        float myFloat = 10.221f;
        // Always remember the f for float and d for double.
        double myDouble = 1212.1212d;
        boolean myBool = false;
        char myChar = 'q';
        // And that char was in single quotes whilst string is double quotes

        System.out.println("There are two groups of datatypes:\n" +
                "\t Primative : byte, short, int, long, float, double, boolean, char\n" +
                "\tNon-Primative: String, Arrays, Classes >> Covered later.");

        byte myByte = -128;
        myByte = -127;
        // This is fine
        //  myByte = 129;
        // The above is not fine since this is outside of the bounds for a byte
        short myShort = -32768;
        myShort = 32767;

        // int: 4 bytes long
        // long: 8 bytes long
        // float: 4 bytes long
        // double: 8 bytes long
        // boolean: 1 bit, on or off. true or false
        // char: 2 bytes long since we are using ASCII


        System.out.println("");
        System.out.println("-=-=-=-=-=-");
        System.out.println("Numbers");
        System.out.println("-=-=-=-=-=-");
        System.out.println("");

        System.out.println("Integer types: whole numbers positive or negative\n" +
                "\t >> byte short int long");

        System.out.println("Floating point types: represents a fractional part containing one or more decimals\n" +
                "\t >> float / double");

        System.out.println("Note: You MUST use a f after a float value\n" +
                "And a d after a double value");

        System.out.println("Flaot = ~6/7 decimal digits\n" +
                "Double = ~ 15 digits");

        System.out.println("We can also use Scientific notation with the letter e\n" +
                "\t This indicates the power of 10");

        double maxScore = 10E1d;
        System.out.println(maxScore);

        // Looks like we can use both upper case and lower case e's... Lower may be more readable.

        System.out.println("");
        System.out.println("-=-=-=-=-=-");
        System.out.println("Booleans");
        System.out.println("-=-=-=-=-=-");
        System.out.println("");

        System.out.println("Booleans are useful when you need one of two values\n" +
                "\t >> On or off, yes or no, true or false.");

        final boolean ALWAYS_NO = false;
        System.out.println(ALWAYS_NO);
        // More will be learnt on booleans and conditions later.

        System.out.println("");
        System.out.println("-=-=-=-=-=-");
        System.out.println("Characters");
        System.out.println("-=-=-=-=-=-");
        System.out.println("");

        // Used to store a single character, an element of a String, if you will.

        myChar = 'a';
        // Alternatively you can use the decimal values for its ASCII counterpart:
        myChar = 97;
        // Had to google
        System.out.println(myChar);

        // Strings:
        System.out.println("Hello world");
        // Single quotes above will not work.

        // String refers to an object so it is non-primative.
        // This also means that methods can be performed on strings, whilst maybe not on int's for example.
        String splitString = myString.split("v")[0];
        // Maybe a bit complicated right now, but it splits the string into parts where v is the 'divider'
        // Then we take the 0th part (first: Since we start from 0), and sets it to variable: splitString
        System.out.println(splitString);
        // Should output Da


        System.out.println("");
        System.out.println("-=-=-=-=-=-");
        System.out.println("Non-primitive types");
        System.out.println("-=-=-=-=-=-");
        System.out.println("");

        System.out.println("AKA reference types since they refer to objects.");

        System.out.println("""
                Primitive = predefined in Java > Except for String.
                Non-Prim : They can call methods to perform operations
                They can be null
                They must start in an uppercase, like String, Array, Interface.
                """);

        // Interface sounds interesting, I wonder what that is.
    }

}
