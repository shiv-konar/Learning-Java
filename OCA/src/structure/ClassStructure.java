package structure;

/**
 * Created by shivkonar on 24/07/2016.
 */
public class ClassStructure {
    public float getTemperature() {
        return temperature;
    }

    public static int getABigNumber() {
        return A_BIG_NUMBER;
    }

    private static int A_BIG_NUMBER = 123456;
    private float temperature;

    public ClassStructure() {
        temperature = 98.4F;
    }

    public void makeOne() {
        AConcept ac = new AConcept();
    }

    public structure.sub.SecretiveClass sc ;

    class AnInnerClass {
        public void doStuff(){}
    }
}
