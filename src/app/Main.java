package app;

import sdk.JNIClassA;
import sdk.JNIClassB;
import sdk.TestJNIPrimitive;

public class Main {
    static {
        System.loadLibrary("./sdk/sdk");
        System.out.println("load sdk.dll successfully");


        /*
        * Notes:
        * sdk.dll is newest
        * sdk.dll override sdkA.dll but not sdkB.dll
        * I don't know why
        *
        * */
        //System.loadLibrary("./sdk/sdkA");
        //System.out.println("load sdkA.dll successfully");

        //System.loadLibrary("./sdk/sdkB");
        //System.out.println("load sdkB.dll successfully");
    }
    public static void main(String[] args) {
        //System.out.println(System.getProperty("java.library.path"));

        int intArrA[] = {1,2,3};
        int intArrB[] = {4,5,6};

        JNIClassA jniClassA = new JNIClassA();
        JNIClassB jniClassB = new JNIClassB();

        jniClassA.intMethod(111);
        jniClassA.booleanMethod(true);
        jniClassA.stringMethod("JNIClassA");
        jniClassA.intArrayMethod(intArrA);

        jniClassB.intMethod(222);
        jniClassB.booleanMethod(false);
        jniClassB.stringMethod("JNIClassB");
        jniClassB.intArrayMethod(intArrB);

        double result = new TestJNIPrimitive().calcJNIAverage(10, 25);
        System.out.println("TestJNIPrimitive().calcJNIAverage: " + result);


        System.out.println("Done!");
    }
}
