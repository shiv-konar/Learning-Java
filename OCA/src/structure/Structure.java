package structure; // Should always come first
//One or more all the necessary import statements

/**
 * Created by shivkonar on 24/07/2016.
 */
import java.util.Date;
import java.util.List;
import java.util.ArrayList;

// public -> method is accessible from everywhere
// static -> no instance needed to invoke main method
// void   -> nothing returned
// main   -> no choice; has to be called main
// args   -> arguments list; requrired but no need to be named as args
// String ... args -> is same as String[] args
public class Structure {
    public static void main(String[] args) {
        Date d = new Date();
        System.out.println("Today is " + d);
        List l = new ArrayList();

    }
}

class OtherClass {
}

interface AnInterface {
}
