public class JavaDataTypes
{

    public static void main(String[] args)
    {
        JavaDataTypes myObject = new JavaDataTypes();
        myObject.GetOutOfStaticContext();
    }

    public void GetOutOfStaticContext()
    {
        ProduceTitle("Data Types");
        DataTypes();

        ProduceTitle("Numbers");
        Numbers();

        ProduceTitle("Booleans");
        Booleans();

        ProduceTitle("Characters");
        Characters();

        ProduceTitle("Non-primitive Types");
        NonPrimitiveTypes();
    }

    public void DataTypes()
    {
        int myInt = 5;
        float myFloat = 5.99f;
        char myLetter = 'f';
        boolean myBool = true;
        String myString = "Hello";

        System.out.println("Primitive types include:\n" +
                "\tByte, short, int, long, float, double, boolean, char");
        System.out.println("Non-Primitive types include:\n" +
                "\tString, Arrays, Classes");

        System.out.println("-=-=-=-=-=-");

        System.out.println("Byte: 1 byte, -128-127\n" +
                "Short: 2 bytes, -32,768 to 32,767\n" +
                "int: 4 bytes, -2,147,483,648 to 2,147,483,647\n" +
                "long: 8 bytes, -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807\n" +
                "float: 4 bytes, Sufficient for 6 to 7 decimal digits\n" +
                "double: 8 bytes, Sufficient for 15 decimal digits\n" +
                "boolean: true or false\n" +
                "char: 2 bytes, single character or ASCII val");
    }
    public void Numbers()
    {
        System.out.println("Primitive number types are divided into two groups: Integer types, Floating types.");

        float exampleFloat = 10.99f;
        double exampleDouble = 10.99f;

        System.out.println("When working with calculations, it is much safer to work with double since it has added precision");

        System.out.println("-=-=-=-=-=-");

        System.out.println("You can also use e in floating point numbers such as 25e2f;");
        float f1 = 10e2f;
        System.out.println(f1);
        // Note: e indicates to the power of 10.

    }
    public void Booleans()
    {
        System.out.println("When working with one of two values: Yes/No, On/Off, True/False\n" +
                "\t Well I should say * true/false ... Just the way it is written");
    }
    public void Characters()
    {
        System.out.println("Char is used to store a single character : ASCII");
        char myGrade = 'B';
        System.out.println("These need to be surrounded by single quotes instead of double quotes like Strings.");

        System.out.println("-=-=-=-=-=-=-");

        System.out.println("Alternatively you can just use the ASCII values, ie. remember that A was 65!");
        char letterA = 65;
        System.out.println(letterA);

        System.out.println("-=-=-=-=-=-=-=-=-");

        System.out.println("Again, Strings are represented with \"double quotes\"");
    }
    public void NonPrimitiveTypes()
    {
        System.out.println("These are typically referred to as reference types since they refer to Objects");

        System.out.println("Main differences:\n" +
                "\tThey are predefined in Java\n" +
                "\tThey can be used to call methods which perform certain operations\n" +
                "\tThey always have a value, whilst non-primitive values can be null\n" +
                "\tThey always start with an uppercase, whilst primitive types such as int start in lower case.");
    }

    public void ProduceTitle(String title_name)
    {
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println(title_name);
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-\n");
    }

}

