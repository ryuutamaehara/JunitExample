import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.Date;
import org.junit.Test;

/**
 * システム時間に依存するメソッドのテスト
 */
public class DateDependencyExampleTest {

  @Test
  public void doSomethingでdateに現在時刻が設定される() throws Exception {
    DateDependencyExample sut = new DateDependencyExample();
    sut.doSomething();

    // アサーションは実行タイミングによって成功にも失敗にもなる
    assertThat(sut.date, is(new Date()));
  }
}