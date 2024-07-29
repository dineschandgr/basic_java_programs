package programs.file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharacterStreams {

    public static void main(String[] args) throws IOException {
        File f = new File("programs/file/test.txt");
        FileReader reader = null;
        try {
            reader = new FileReader(f);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        BufferedReader br = new BufferedReader(reader);
        int temp;
        StringBuilder sb = new StringBuilder();
        while(true){
            try {
                if ((temp = br.read()) == -1)
                    break;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            System.out.println((char)temp);
            sb.append((char)temp);
// H He Hel Hell Hello
            //hello world
        }
        
        sb.append(" ssssss ssss sssssss sss jhasvghvh");
        System.out.println("string s "+sb.toString());

        File output = new File("programs/file/output.txt");
        FileWriter writer = new FileWriter(output);
        BufferedWriter bw = new BufferedWriter(writer);
        bw.write(sb.toString());
        //writer.write(sb.toString());


        bw.close();
        writer.close();


    }
}
