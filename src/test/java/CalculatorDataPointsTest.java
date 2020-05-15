import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.experimental.theories.DataPoint;
import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

/**
 * DataPointsアノテーションの利用
 */
@RunWith(Theories.class)
public class CalculatorDataPointsTest {

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

  @DataPoints
  public static Fixture[] PARAMs = {
      new Fixture(3, 4, 7),
      new Fixture(3, 2, 5),
      new Fixture(-3, 1, -2)
  };

  @Theory
  public void add(Fixture p) throws Exception {
    Calculator sut = new Calculator();
    assertThat(sut.add(p.x, p.y), is(p.excepted));
  }
}