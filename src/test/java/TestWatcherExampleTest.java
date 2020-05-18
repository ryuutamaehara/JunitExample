import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestWatcher;
import org.junit.rules.Verifier;
import org.junit.runner.Description;

/**
 * ログを出力する
 */
public class TestWatcherExampleTest {

  @Rule
  public TestWatcher testWatcher = new TestWatcher() {

    @Override
    protected void starting(Description description) {
      Logger.getAnonymousLogger().info(
          "start: " + description.getMethodName());
    }

    @Override
    protected void succeeded(Description description) {
      Logger.getAnonymousLogger().info(
          "succeeded: " + description.getMethodName());
    }

    @Override
    protected void failed(Throwable e, Description description) {
      Logger.getAnonymousLogger().log(
          Level.WARNING,
          "failed: " + description.getMethodName(),
          e);
    }

    @Override
    protected void finished(Description description) {
      Logger.getAnonymousLogger().info(
          "finished: " + description.getMethodName());
    }

  };

  @Test
  public void 成功するテスト() throws Exception {
  }

  @Ignore("動作確認のためにはコメントアウトしてください")
  @Test
  public void 失敗するテスト() throws Exception {
    fail("NG");
  }
}