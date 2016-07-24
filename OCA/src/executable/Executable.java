package executable;

/**
 * Created by shivkonar on 24/07/2016.
 */
public class Executable {
    public static void main(String[] args) {
        System.out.println("Hello World");
        for(int i = 0; i < args.length; i++) {
            System.out.println("args[" + i + "] -> " + args[i]);
        }
        System.out.println("No more.");
    }
}
