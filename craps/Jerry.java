package craps;

import java.io.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import static java.nio.file.StandardCopyOption.*;

public class Jerry {

    public static void main(String[] args) throws FileNotFoundException, IOException {
{
        Path source = Paths.get("G:\\DiceGame\\gradlew.bat"); 
        Path target=Paths.get("G:\\h\\gradlew.bat");
        try
        {
            Files.copy(source, target, REPLACE_EXISTING, COPY_ATTRIBUTES);
        }
        catch(IOException e)
        {
        System.out.println(e);
        }
        
}
}


    }
