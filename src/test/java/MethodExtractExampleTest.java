import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.Date;
import org.junit.Test;

public class MethodExtractExampleTest {

  @Test
  public void doSomethingを実行するとdateに現在時刻が設定される() throws Exception{
    final Date current = new Date();
    MethodExtractExample sut = new MethodExtractExample() {
      @Override
      Date getDate() {
        return current;
      }
    };
    sut.doSomething();
    assertThat(sut.date, is(current));
  }
}