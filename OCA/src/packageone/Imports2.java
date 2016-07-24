package packageone;

/**
 * Created by shivkonar on 24/07/2016.
 */

import packageone.subpackage.ClassB;
import packagetwo.ClassOne;
public class Imports2 {
    public static void main(String[] args) {
        packageone.ClassOne cOne = new packageone.ClassOne();
        System.out.println(cOne.toString());

        packageone.subpackage.ClassA cA = new packageone.subpackage.ClassA();
        System.out.println(cA.toString());

        ClassB cB = new ClassB();
        System.out.println(cB.toString());

        ClassOne cOneAgain = new ClassOne();
        System.out.println(cOneAgain.toString());
    }
}
