import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class main {

    public static void main( String[] args) {
        errorHandling1();

        errorHandling2();

        errorHandlig3();

    }

    static void errorHandling1() {

        int i = 12;
        int j = 2;

        try {
            int result = i / (j-2);
            System.out.println(result);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

    static void errorHandling2() {

        BufferedReader reader = null;
        int total = 0;

        try {
            reader = new BufferedReader(new FileReader("C:\\MyLearnings\\Numbers.txt"));
            String line = null;
            while ((line = reader.readLine()) != null)
                    total += Integer.valueOf(line);
            System.out.println("Total : "+total);

        } catch(NumberFormatException e) {
            System.out.println("Invalid Value ### "+e.getMessage());
        } catch(FileNotFoundException e) {
            System.out.println("Not found ##### "+e.getMessage());
        } catch(IOException e) {
            System.out.println("Error interacting with file ##### "+e.getMessage());
        } catch(Exception e) {
            System.out.println(e.getMessage());
        } finally {
            try{
                if(reader != null)
                    reader.close();
            } catch(Exception e) {
                System.out.println(e.getMessage());
            }
        }

    }

    static void errorHandlig3() {
     System.out.println("Trying to implement throws");
    }
}

