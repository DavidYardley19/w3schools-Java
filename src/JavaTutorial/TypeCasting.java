package JavaTutorial;

public class TypeCasting
{

    public static void main(String[] args)
    {

        // When assigning val of one primitive datatype to another.

        //widening casting
        System.out.println("Widening casting (AUTO)\n" +
                "byte > short > chat > int > long > float > double");
        // This is safe since no data is lost.
        // Below is not as safe

        // Narrowing casting
        System.out.println("Narrowing Casting (Manual attention req'\n" +
                "byte < short < chat < int < long < float < double");

        // Suppose you have double myDub = 10.99d;
        // if you try to convert that into an int, then it would cut off the .99 on the end.

        // Narrowing casting example:
        double myDouble = 1.23d;
        int myInt = (int) myDouble;
        System.out.println(myDouble);
        System.out.println(myInt);
    }

}
