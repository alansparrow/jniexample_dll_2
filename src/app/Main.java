package app;

import sdk.JNIClassA;
import sdk.JNIClassB;

public class Main {
    static {
        System.loadLibrary("./sdk/sdk");
        System.out.println("load sdk.dll successfully");

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

        System.out.println("Done!");
    }
}
