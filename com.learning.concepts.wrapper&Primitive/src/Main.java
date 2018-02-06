public class Main {

    static Integer a = 100; // here compiler actually injects integer.valueOf call for us...........after java 5 we don't have to use them.
    static int b = a;
    //Integer c = b;

    public static void main ( String args[]){
        System.out.println("Hello");
        Integer c = b;

        Integer d = Integer.valueOf(100);
        int e = d.intValue();
        Integer f = Integer.valueOf(e);

        String s = "87.44";
        double s1 = Double.parseDouble(s);  // here we are calling parseDouble on wrapper class Double, it's returning back a pritive double valus.
        System.out.println(" String to primitive conversion "+s1);

        Double s2 = Double.valueOf(s);
        System.out.println(" String to Wrapper conversion "+s1);

        Object[] stuff = new Object[3];
        stuff[0] = 100; // java will get a reference to an instance of the integer wrapper class, with a value of 100 and assign it to stuff sub 0;

        Integer i1000A = 10 * 10 * 10;
        Integer i1000B = 100 * 10;
        if (i1000A == i1000B) {
            System.out.println("not equals"); // as these two are references to the classes, so it's checking references equality i.e checking if both references points to the same exact object.
        }
        if(i1000A.equals(i1000B)){
            System.out.println(" Now equal "); // as Wrappers are classes
        }

        /*
        in java certain boxing conversions are defined to always return back a reference to the exact same instance
        int -128 to +127
        short -128 to +127
        byte -128 to +127
        char '\u0000' to '\u00ff'
        boolean true,false
         */
        Integer i8A = 4 * 2;
        Integer i8B = 2 * 2 * 2;
        if (i8A == i8B) {
            System.out.println("Equals");
        }







    }





}
