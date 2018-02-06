public class Main {

    static String s1 = "I Love";
    static String s2 = "I";

    public static void main(String args[]) {

        s1 += " java";
        s2 += " Love Java";

        if (s1 == s2) {
           System.out.println("Not Equal with ==");
        }else{
            s1 = s2;     // == compares value based on whether they both points to the exact same object instance. Reference based comparision are inexpencinve
            if(s1 == s2){
                System.out.println("Now equal with ==");
            }
        }

        if(s1.equals(s2)){ // it does charecter by charecter based comparision , these are very expensive operations, particularly in very long strings.
            System.out.println("equals with equals");
        }

        String s3 = s1.intern(); // when we call a intern on some string value it will always return back the same exact string object for a given string value
        String s4 = s2.intern(); // intern assures that the two strings with the same value will reference the exact same object.

        if(s3 == s4){
            System.out.println("now == equals with intern method");
        }
    }
}