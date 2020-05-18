import java.io.File;
import java.io.IOException;

public class Calculator {

  public int add(int x, int y) {
    return x + y;
  }

  public static class TemporaryFolderExample {

    public static void mkDefaultFiles(File folder) throws IOException {
      new File(folder, "UnitTest").createNewFile();
      new File(folder, "readme.txt").createNewFile();
    }
  }
}
