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

        ProduceTitle("Numbers");

        ProduceTitle("Booleans");

        ProduceTitle("Characters");

        ProduceTitle("Non-primitive Types");

    }

    public void ProduceTitle(String title_name)
    {
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println(title_name);
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-\n");
    }

}

