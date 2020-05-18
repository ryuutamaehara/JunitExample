package rule;

import java.io.File;
import org.junit.rules.TemporaryFolder;

/**
 * 特定のサブフォルダを作成するルール
 */
public class SpecificTemporaryFolder extends TemporaryFolder {

  public File srcFolder;
  public File binFolder;

  @Override
  public void before() throws Throwable {
    super.before(); //テンポラリフォルダを作成する
    srcFolder = newFolder("src");
    binFolder = newFolder("bin");
  }
}
