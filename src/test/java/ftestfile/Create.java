package ftestfile;

import org.testng.annotations.Test;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Create {
    @Test
    public void test() {
        LogUtil.step(1, "Create file.");
        String filePath = "newFile.txt";
        File file = new File(filePath);
        try (FileWriter fileWriter = new FileWriter(file)) {
            String text;
            if (System.getProperty("fileContent") == null) {
                text = "Hello!!";
            } else {
                text = System.getProperty("fileContent");
            }
            fileWriter.write(text);
            fileWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
