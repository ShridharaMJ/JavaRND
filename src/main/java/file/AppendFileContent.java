package file;

import org.testng.annotations.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class AppendFileContent {

    @Test
    public void testFile() throws IOException {

        for (int i = 1; i < 10; i++) {

            Path of = Path.of("target/result.txt");
            if (!Files.exists(of))
                Files.createFile(of);
            Files.writeString(of, "Testing " + i + "\n", StandardOpenOption.APPEND);
        }
    }
}
