package out.production.file.streams;

import java.beans.Transient;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

class Demo implements java.io.Serializable
{


    public int a;

    public transient String b;

    static int test;

    // Default constructor
    public Demo(int a, String b)
    {
        this.a = a;
        this.b = b;
    }

    @Override
    public String toString() {
        return "Demo{" +
                "a=" + a +
                ", b='" + b + '\'' +
                '}';
    }
}

public class Serialization {
    public static void main(String[] args) throws IOException, ClassNotFoundException {


        Demo d = new Demo(1,"test");
        test(d);
        d = null;

        FileOutputStream file = new FileOutputStream("/Users/dineshchandgeetharavichandran/Desktop/Dinesh/Project/Java/untitled/src/out/production/file/streams/test.ser");
        BufferedOutputStream bos = new BufferedOutputStream(file);
        ObjectOutputStream out = new ObjectOutputStream(bos);

        // Method for serialization of object
        out.writeObject(d);

        out.close();
        file.close();
        System.out.println(d);
        System.out.println("Object has been serialized");

        FileInputStream fis = new FileInputStream("/Users/dineshchandgeetharavichandran/Desktop/Dinesh/Project/Java/untitled/src/out/production/file/streams/test.ser");
        BufferedInputStream bis = new BufferedInputStream(fis);
        ObjectInputStream ois = new ObjectInputStream(bis);
        System.out.println("deserialized");
        Demo d1 = (Demo) ois.readObject();
        System.out.println(d1);
    }


    static void test(Demo d){

    }
}


