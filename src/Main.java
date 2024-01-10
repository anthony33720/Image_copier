import java.io.*;
import java.io.FileInputStream;


public class Main {

    private static final int BUFFER = 4096;
    private static final String IMG_PATH = "/Users/salt-dev1/Anthony/Image_copier/src/img.png";
    private static final String OUTPUT_IMG_PATH = "/Users/salt-dev1/Anthony/Image_copier/src/Output.img.png";
    public static void main(String[] args) {
        try (
        InputStream is = new FileInputStream(IMG_PATH);
        OutputStream os = new FileOutputStream(OUTPUT_IMG_PATH);
        ) {
            byte[] imageBuffer = new byte[BUFFER];
            int bytesRead = -1;

        while ((bytesRead = is.read(imageBuffer)) != -1){
            os.write(imageBuffer, 0, bytesRead);
        }

    } catch (IOException ex ){
        ex.printStackTrace();
    }

}}