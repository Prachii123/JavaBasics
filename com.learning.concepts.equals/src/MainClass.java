public class MainClass {

    public static void main(String[] args) {

        ChildClass childClass1 = new ChildClass();
        childClass1.setK(30);
        System.out.println(childClass1.toString());

        ChildClass childClass2 = new ChildClass();
        childClass2.setK(40);
        System.out.println(childClass2.toString());

        if(childClass1.equals(childClass2)) {
            System.out.println("Equals");
        }
        else
            System.out.println("Not Equals");
    }

    }

