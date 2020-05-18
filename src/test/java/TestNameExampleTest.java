import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;

/**
 * テスト名の取得
 */
public class TestNameExampleTest {

  @Rule
  public TestName testName = new TestName();

  @Test
  public void テスト名() throws Exception {
    assertThat(testName.getMethodName(), is("テスト名"));
  }
}