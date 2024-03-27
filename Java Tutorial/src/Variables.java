public class Variables {

    public static void main(String[] args)
    {

        Variables myObject = new Variables();
        myObject.GetOutOfStaticContext();

    }

    public void GetOutOfStaticContext()
    {
        ProduceTitle("Variables");

        ProduceTitle("Print Variables");

        ProduceTitle("Declare Multiple Variables");

        ProduceTitle("Identifiers");
    }



    public void ProduceTitle(String title_name)
    {
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println(title_name);
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-\n");
    }

}
