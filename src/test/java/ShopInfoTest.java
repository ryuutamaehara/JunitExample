import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.CoreMatchers.nullValue;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;

/**
 * ErrorCollectorを使ったインスタンス化テスト
 */
public class ShopInfoTest {

  public static class インスタンス化テスト {

    @Rule
    public ErrorCollector ec = new ErrorCollector();

    @Test
    public void デフォルトコンストラクタ() throws Exception {
      // Exercise
      ShopInfo instance = new ShopInfo();
      // Verify
      ec.checkThat(instance.url, is(notNullValue()));
      ec.checkThat(instance, is(notNullValue()));
      ec.checkThat(instance.id, is(nullValue()));
      ec.checkThat(instance.name, is(""));
      ec.checkThat(instance.address, is(""));
    }
  }
}