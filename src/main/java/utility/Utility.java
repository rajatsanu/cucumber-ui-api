package utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Utility extends ApiUtil{

    public static String readFile(String filePath) throws IOException {
        String str = null ;
        str = new String(Files.readAllBytes(Paths.get(filePath)));
        return str;
    }

}
