public class B extends A{

    B(){
        this("");  //calling one arguement constructor of Class B
        //super();
        System.out.println("B's no arguement constructor");
    }

    B(String args){
        super("");
        //this();
        System.out.println("B's one arguement constructor");
    }
}
