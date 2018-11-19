package sdk;

public class TestJNIPrimitive {
    static {
        System.loadLibrary("./sdk/TestJNIPrimitive");
        System.out.println("load TestJNIPrimitive.dll successfully");
    }

    private native double average(int n1, int n2);

    public double calcJNIAverage(int n1, int n2) {
        return average(n1, n2);
    }
}
