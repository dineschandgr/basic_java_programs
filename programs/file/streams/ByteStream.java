package programs.file.streams;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStream {

    public static void main(String[] args) throws IOException {

        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        FileOutputStream fos = null;
        System.out.println();

        try {
            File file = new File("/Users/dineshchandgeetharavichandran/Desktop/Dinesh/Project/Java/untitled/src/production/file/streams/img.png");      // img.jpg can be any image file
            FileInputStream in = new FileInputStream(file);

            bis = new BufferedInputStream(in);
            long size = file.length();
            byte[] temp = new byte[(int) size];
            bis.read(temp);

            // The img.jpg image data will be written in a new image File named "output.jpg"
            File outputFile = new File("/Users/dineshchandgeetharavichandran/Desktop/Dinesh/Project/Java/untitled/src/production/file/streams/output.jpg");
            fos = new FileOutputStream(outputFile);
            bos = new BufferedOutputStream(fos);
            bos.write(temp);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            bis.close();
            bos.close();
            fos.close();

        }
    }
}
