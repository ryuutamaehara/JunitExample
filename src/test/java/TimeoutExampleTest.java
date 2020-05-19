import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

/**
 * Ruleアノテーションによるルールの宣言
 */
public class TimeoutExampleTest {

  @Rule
  public Timeout timeout = new Timeout(100);

  @Test
  public void 長時間かかるテスト() throws Exception {
    doLongTask(80);  //実行結果はOK
//    doLongTask(200);  //実行結果はNG
  }

  private void doLongTask(int time) throws InterruptedException {
    Thread.sleep(time);
  }
}
