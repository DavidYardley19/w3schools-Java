public class Comments {

    public static void main(String[] args)
    {

        // This is a single line comment!

        /* This is a multi-line comment!
           Well, Now I'm not sure what to put here.
         */

        // To get out of a static context, see the two lines below
        Comments myObject = new Comments();
        myObject.Test();

        /*
        We create an object of the class Comments since this holds methods which we want to run such as Test
        The object is assigned a name: myObject, note that this is not capitalized however camel case is used
            since we cant have spaces.

        A method is then called by utilising the dot prefix.
        Recall that there is something in SQL which is very similar,
        where you can call a specific attribute from a specific table by utilising the dot prefix.
         */
    }

    public void Test()
    {

        System.out.println("test");

    }

}
