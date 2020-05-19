import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.Date;
import org.junit.Test;

/**
 * インタフェースを使って処理を差し替えたユニットテスト
 */
public class DelegateObjectExampleTest {

  @Test
  public void doSomethingを実行するとdateに現在時刻が設定される() throws Exception {
    final Date current = new Date();
    DelegateObjectExample sut = new DelegateObjectExample();
    sut.dateFactory = new DateFactory() {
      @Override
      public Date getDate() {
        return current;
      }
    };
    assertThat(sut.date, is(current));
  }
}