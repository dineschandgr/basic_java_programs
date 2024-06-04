package production.file.streams;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharacterStreams {

    public static void main(String[] args) throws IOException {
        File f = new File("/Users/dineshchandgeetharavichandran/Desktop/Dinesh/Project/Java/untitled/src/production/file/streams/test.txt");
        FileReader reader = null;
        try {
            reader = new FileReader(f);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        BufferedReader br = new BufferedReader(reader);
        int temp;
        StringBuilder sb = new StringBuilder();
        while( (temp = br.read()) != -1){
            System.out.println((char)temp);
            sb.append((char)temp);
// H He Hel Hell Hello
            //hello world
        }
        
        sb.append("ssssss ssss sssssss sss jhasvghvh");
        System.out.println("string s "+sb.toString());


        FileWriter writer = new FileWriter("/Users/dineshchandgeetharavichandran/Desktop/Dinesh/Project/Java/untitled/src/production/file/streams/output.txt");
        BufferedWriter bw = new BufferedWriter(writer);
        bw.write(sb.toString());
        //writer.write(sb.toString());


        bw.close();
        writer.close();


    }
}
