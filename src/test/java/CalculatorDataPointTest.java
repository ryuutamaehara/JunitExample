import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.experimental.theories.DataPoint;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

/**
 * フィクスチャオブジェクトによるパラメータ化テスト
 */
@RunWith(Theories.class)
public class CalculatorDataPointTest {

  static class Fixture {

    int x;
    int y;
    int excepted;

    Fixture(int x, int y, int excepted) {
      this.x = x;
      this.y = y;
      this.excepted = excepted;
    }
  }

  @DataPoint
  public static Fixture PARAM_1 = new Fixture(3, 4, 7);
  @DataPoint
  public static Fixture PARAM_2 = new Fixture(0, 5, 5);
  @DataPoint
  public static Fixture PARAM_3 = new Fixture(-3, 1, -2);

  @Theory
  public void add(Fixture p) throws Exception {
    Calculator sut = new Calculator();
    assertThat(sut.add(p.x, p.y), is(p.excepted));
  }
}