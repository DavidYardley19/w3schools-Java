package JavaTutorial;

public class Operators {

    public static void main(String[] args){

        System.out.println("Used for operations on variables and values");
        int x = 10 + 20;
        System.out.println("The variable x = " + x);

        // operator groups
        System.out.println("\n" +
                "There are 5 operator groups:\n" +
                "\t > Arithmetic\n" +
                "\t > Assignment\n" +
                "\t > Comparison\n" +
                "\t > Logical\n" +
                "\t > Bitwise");

        System.out.println();
        System.out.println("""
                Arithmetic includes:
                + addition
                - subtraction
                * multiplication
                / division
                % modulus
                ++ increment
                -- decrement
                """);

        System.out.println("""
                Assignment includes:
                The use of the equals sign to give a variable to a name
                int x = 10;
                
                Addition assignment: += or -= adds/ subtracts a value from a variable.
                int x = 10;
                x +=1;
                is the same as
                x ++;
                
                Additional assignment operators which may be used:
                &=
                |=
                ^=
                >>=
                <<=
                You will learn about these
                """);

        System.out.println("""
                Comparison: always returns true or false. It checks relation between two variables.
                == is equal to
                != not equal to
                > < greater than or less than
                >= <= ... You get the gist.
                """);

        System.out.println("""
                Locical: Also true or false
                && >> Logical AND
                || >> Logical OR
                ! >> LogicaL NOT
                """);


    }

}
