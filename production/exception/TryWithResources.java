package out.production.exception;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TryWithResources {
    public static void main(String[] args) throws IOException {


        //File f = new File("/Users/dineshchandgeetharavichandran/Desktop/Dinesh/Project/Java/untitled/src/out/production/file/streams/test.txt");

        try(  FileReader reader = new FileReader("/Users/dineshchandgeetharavichandran/Desktop/Dinesh/Project/Java/untitled/src/out/production/file/streams/test.txt");

              BufferedReader br = new BufferedReader(reader);
              FileWriter writer = new FileWriter("/Users/dineshchandgeetharavichandran/Desktop/Dinesh/Project/Java/untitled/src/out/production/file/streams/output1.txt");
              BufferedWriter bw = new BufferedWriter(writer);
            ){

            StringBuilder sb = new StringBuilder();
            int temp;

            while( (temp = br.read()) != -1){
                System.out.println((char)temp);
                sb.append((char)temp);
            }
            sb.append("ssssss ssss sssssss sss");
            System.out.println("string s "+sb.toString());
            bw.write(sb.toString());

        }catch(Exception e){

        }

    }
}
