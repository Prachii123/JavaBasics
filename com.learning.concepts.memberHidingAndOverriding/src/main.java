public class main {

    public static void main(String[] args) {

        A a = new B(); // B type object is auto-UP casted to A type.
        System.out.println("************************"+ a.i);
        System.out.println("************************"+ a.getI());

        /*
        It's very important to note that Downcasting is allowed only when the subclass object is assigned to the super class object at least once before doing so.
         */
        A a1 = new A();
        B b1 = new B();
        a1 = b1;
        b1 = (B)a1;
       // B b1 = (B)a1;
        System.out.println("************************"+ b1.i);
        System.out.println("************************"+ b1.getI());

       // Object o;// = new A();
       // B b2 = (B)a1;
       // System.out.println("************************"+ b2.i);
        //System.out.println("************************"+ b2.getI());

        /*o = new B();

        if(o instanceof B)
            System.out.println("instance of B");

        if(o instanceof A)
            System.out.println("instance of A");

        B b3 = (B)o;
        System.out.println("************************"+ b3.i);
        System.out.println("************************"+ b3.getI());
       // System.out.println("************************"+ o.i);
        //System.out.println("************************"+ o.getI());



        Object o2;
        o = new A();

        if(o instanceof B)
            System.out.println("instance of B");

        if(o instanceof A)
            System.out.println("instance of A");

            */

        Object o3 = new B();
        B b3 = (B)o3;
        System.out.println("************************"+ b3.i);
        System.out.println("************************"+ b3.getI());

        A a4 = new B();
        B b4 = (B)a4;
        System.out.println("************************"+ b4.i);
        System.out.println("************************"+ b4.getI());


    }
}

