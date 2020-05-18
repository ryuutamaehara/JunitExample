import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import java.io.File;
import java.util.Arrays;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

/**
 * TemporaryFolderの使用
 */
public class TemporaryFolderExampleTest {

  @Rule
  public TemporaryFolder temporaryFolder = new TemporaryFolder();

  @Test
  public void mkDefaultFilesで2つのファイルが作成される() throws Exception {
    File folder = temporaryFolder.getRoot();
    TemporaryFolderExample.mkDefaultFiles(folder);
    String[] actualFiles = folder.list();
    Arrays.sort(actualFiles);
    assertThat(actualFiles.length, is(2));
    assertThat(actualFiles[0], is("UnitTest"));
    assertThat(actualFiles[1], is("readme.txt"));
  }
}
