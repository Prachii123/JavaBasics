import com.sun.deploy.util.SyncAccess;
/*
 upcasting can never fail. But if you have a group of different Animals and want to downcast them all to a Cat,
 then there's a chance, that some of these Animals are actually Dogs, and process fails, by throwing ClassCastException.

 Important: Do not confuse variables with instances here. Cat from Mammal Variable can be cast to a Cat, but Mammal from Mammal variable cannot be cast to a Cat.
 */

public class Test {

    public static void main(String[] args) {

        Cat c = new Cat();
       //System.out.println(c.health + "  " +c.CatProperty + "  " + c.MammalProperty);
        Dog d = new Dog();
        //System.out.println(d.health);
        Mammal m = c;
       //System.out.println(c.CatProperty+ "  " +c.MammalProperty+ "  " +c.health);
        Object o = (Object)m;
       // convertToDog(c);

        Animal a = new Animal();
        a = c; // if we comment this line it will give error java.lang.ClassCastException: Animal cannot be cast to Cat
        Cat c2 = (Cat) a;
        System.out.println(c2.CatProperty+ "  " +c2.MammalProperty+ "  " +c2.health);

        Animal a1 = new Animal();
        Cat c1 = new Cat();
        a1 = c1;
        System.out.println(a1.health);
        c1 = (Cat)a1;
        System.out.println(c1.CatProperty + c1.MammalProperty);



    }

    private static void  convertToDog(Object o) {
        Dog d = (Dog) o;
    }
}

