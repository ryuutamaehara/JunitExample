import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.TestName;

/**
 * 複数のルールの宣言
 */
public class RulesExampleTest {

  @Rule
  public TestName testName = new TestName();
  @Rule
  public ExpectedException expectedException = ExpectedException.none();

  @Test
  public void test() throws Exception {
  }
}
